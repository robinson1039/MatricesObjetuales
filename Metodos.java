import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Metodos {
    public ObjProductos[][] llenarMatrizObjProductos(int d){
        Scanner sc = new Scanner(System.in);
        ObjProductos[][] matriz = new ObjProductos[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                ObjProductos obj = new ObjProductos();
                System.out.println("Ingrese el nombre del producto ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto ");
                obj.setPrecio(sc.nextDouble());
                sc.nextLine(); // consume the newline character
                System.out.println("Ingrese la cantidad del producto ");
                obj.setCantidad(sc.nextInt());
                System.out.println("Ingrese el stok del producto ");
                obj.setStok(sc.nextInt());
                sc.nextLine(); // consume the newline character
                matriz[i][j] = obj;
            }
        }
        //sc.close();
        return matriz;
    }

    public void mostrarMatrizObjProductos(ObjProductos[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("-------------------------------------------------");
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Nombre: " + matriz[i][j].getNombre());
                System.out.println("Precio: " + matriz[i][j].getPrecio());
                System.out.println("Cantidad: " + matriz[i][j].getCantidad());
                System.out.println("stok: " + matriz[i][j].getStok());

            }
            System.out.println("-------------------------------------------------");
        }
    }

    public void mostrarListaProductos(ArrayList<ObjProductos> lista) {
        System.out.println("Lista de productos fusionados:");
        for (ObjProductos producto : lista) {
            System.out.println("Nombre: " + producto.getNombre() +
                               ", Precio: " + producto.getPrecio() +
                               ", Cantidad: " + producto.getCantidad() +
                               ", Stock: " + producto.getStok());
        }
    }

    public void encontrarProducto(ObjProductos[][] matriz, String nombre){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].getNombre().equals(nombre)) {
                    System.out.println("Nombre: " + matriz[i][j].getNombre());
                    System.out.println("Precio: " + matriz[i][j].getPrecio());
                    System.out.println("Cantidad: " + matriz[i][j].getCantidad());
                    System.out.println("En la celda [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Producto no encontrado");
    }

    public void sumarCantidad(ObjProductos[][] matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
                suma += matriz[i][j].getCantidad();
            }
        }
        System.out.println("La suma de las cantidades es: " + suma);
    }

    public void encontrarPrecioMayor(ObjProductos[][] matriz){
        double mayor = matriz[0][0].getPrecio();
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].getPrecio() > mayor) {
                    mayor = matriz[i][j].getPrecio();
                     fila = i;
                     columna = j;
                }
            }
        }
        System.out.println("El precio mayor es: " + mayor + " en la celda [" + fila + "][" + columna + "]");
    }

    public void ordenarAcientoOrdenAscendente(ObjProductos[][] matriz){
        ObjProductos[] array = new ObjProductos[matriz.length * matriz.length];
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                array[k] = matriz[i][j];
                k++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].getPrecio() > array[j + 1].getPrecio()) {
                    ObjProductos aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nombre: " + array[i].getNombre());
            System.out.println("Precio: " + array[i].getPrecio());
            System.out.println("Cantidad: " + array[i].getCantidad());
        }
    }

    
    public ObjProductos[][] juntarMatrices(ObjProductos[][] matriz1, ObjProductos[][] matriz2) {
        HashMap<String, ObjProductos> productosMap = new HashMap<>();
    
        // Procesar la primera matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                ObjProductos prod = matriz1[i][j];
                if (productosMap.containsKey(prod.getNombre())) {
                    productosMap.get(prod.getNombre()).sumarStock(prod.getStok());
                } else {
                    productosMap.put(prod.getNombre(), new ObjProductos(prod.getNombre(), prod.getPrecio(), prod.getCantidad(), prod.getStok()));
                }
            }
        }
    
        // Procesar la segunda matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                ObjProductos prod = matriz2[i][j];
                if (productosMap.containsKey(prod.getNombre())) {
                    productosMap.get(prod.getNombre()).sumarStock(prod.getStok());
                } else {
                    productosMap.put(prod.getNombre(), new ObjProductos(prod.getNombre(), prod.getPrecio(), prod.getCantidad(), prod.getStok()));
                }
            }
        }
    
        // Convertir el HashMap a una lista de productos
        ArrayList<ObjProductos> listaProductos = new ArrayList<>(productosMap.values());
    
        // Definir el tamaño de la nueva matriz (puedes ajustarlo según tu necesidad)
        int filas = (int) Math.ceil(Math.sqrt(listaProductos.size())); // Aproximación cuadrada
        int columnas = filas; // Matriz cuadrada o ligeramente rectangular si es necesario
    
        ObjProductos[][] matrizFusionada = new ObjProductos[filas][columnas];
    
        // Llenar la matriz con los productos de la lista
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (index < listaProductos.size()) {
                    matrizFusionada[i][j] = listaProductos.get(index++);
                } else {
                    matrizFusionada[i][j] = null; // Espacios vacíos
                }
            }
        }
    
        return matrizFusionada;
    }

}
