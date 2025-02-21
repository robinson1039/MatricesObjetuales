import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
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

    public ObjProductoMarket[][] llenarMatrizObjProductosMarket(int d){
        Scanner sc = new Scanner(System.in);
        ObjProductoMarket[][] matriz = new ObjProductoMarket[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                ObjProductoMarket obj = new ObjProductoMarket();
                System.out.println("Ingrese el nombre del producto ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto ");
                obj.setPrecio(sc.nextDouble());
                System.out.println("el producto esta disponible? ");
                obj.setDisponible(sc.nextBoolean());
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

    public void mostrarMatrizObjProductosMarket(ObjProductoMarket[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("-------------------------------------------------");
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Nombre: " + matriz[i][j].getNombre());
                System.out.println("Precio: " + matriz[i][j].getPrecio());
                System.out.println("disponibilidad: " + matriz[i][j].isDisponible());

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

    public ObjProductoMarket[][] obtenerElementosDisponibles(ObjProductoMarket[][] matriz) {
        // Contar cuántos elementos disponibles hay
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int contador = 0;
    
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != null && matriz[i][j].isDisponible()) {
                    contador++;
                }
            }
        }
    
        // Crear una nueva matriz con la cantidad de elementos disponibles
        ObjProductoMarket[][] nuevaMatriz = new ObjProductoMarket[contador][1]; // Matriz de una sola columna
    
        // Llenar la nueva matriz con los elementos disponibles
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != null && matriz[i][j].isDisponible()) {
                    nuevaMatriz[index][0] = matriz[i][j];
                    index++;
                }
            }
        }
    
        return nuevaMatriz;
    }

      // Método para llenar la matriz con estudiantes aleatorios
      public ObjEstudiantes[][] llenarMatrizEstudiantes(int d) {
        ObjEstudiantes[][] matriz = new ObjEstudiantes[d][d];
        String[] nombres = {"Juan", "Ana", "Luis", "Maria", "Pedro", "Laura", "Carlos", "Sofia"};
        char[] calificaciones = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                String nombre = nombres[(int) (Math.random() * nombres.length)];
                char calificacion = calificaciones[(int) (Math.random() * calificaciones.length)];
                matriz[i][j] = new ObjEstudiantes(nombre, calificacion);
            }
        }
        return matriz;
    }

    // Método para mostrar la matriz de estudiantes
    public void mostrarMatrizEstudiantes(ObjEstudiantes[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    // Método para agrupar estudiantes según su calificación
    public void agruparEstudiantesPorCalificacion(ObjEstudiantes[][] matriz) {
        // Mapa para almacenar las listas de estudiantes por calificación
        HashMap<Character, ArrayList<ObjEstudiantes>> grupos = new HashMap<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                char calificacion = matriz[i][j].getCalificacion();
                grupos.putIfAbsent(calificacion, new ArrayList<>());
                grupos.get(calificacion).add(matriz[i][j]);
            }
        }

        // Mostrar los grupos de estudiantes por calificación
        System.out.println("\nEstudiantes agrupados por calificación:");
        for (char clave : grupos.keySet()) {
            System.out.println("Calificación " + clave + ":");
            for (ObjEstudiantes estudiante : grupos.get(clave)) {
                System.out.println("  - " + estudiante.getNombre());
            }
        }
    }

      // Método para generar una lista de productos con nombres, peso y categoría aleatoria
    public ObjProducto[] generarListaProductos(int cantidad) {
        ObjProducto[] productos = new ObjProducto[cantidad];
        String[] nombres = {"Arroz", "Leche", "Azúcar", "Cereal", "Aceite", "Detergente", "Jabón", "Shampoo"};
        String[] categorias = {"Alimentos", "Bebidas", "Limpieza", "Cuidado Personal"};

        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            double peso = 0.5 + (5.0 - 0.5) * random.nextDouble(); // Peso aleatorio entre 0.5 y 5 kg
            String categoria = categorias[random.nextInt(categorias.length)];
            productos[i] = new ObjProducto(nombre, peso, categoria);
        }
        return productos;
    }

    // Método para mostrar la lista de productos
    public void mostrarListaProductos(ObjProducto[] productos) {
        for (ObjProducto p : productos) {
            System.out.println(p);
        }
    }

    // Método para agrupar productos por categoría y llenar la matriz de estanterías
    public ObjProducto[][] llenarEstanterias(ObjProducto[] productos, int d) {
        // Mapa para agrupar productos por categoría
        HashMap<String, ArrayList<ObjProducto>> grupos = new HashMap<>();

        for (ObjProducto p : productos) {
            grupos.putIfAbsent(p.getCategoria(), new ArrayList<>());
            grupos.get(p.getCategoria()).add(p);
        }

        // Convertir cada grupo en un vector
        List<ObjProducto[]> listaEstanterias = new ArrayList<>();
        for (String categoria : grupos.keySet()) {
            ArrayList<ObjProducto> lista = grupos.get(categoria);
            ObjProducto[] vectorCategoria = lista.toArray(new ObjProducto[0]);
            listaEstanterias.add(vectorCategoria);
        }

        // Llenar la matriz con los vectores de productos organizados por categoría
        ObjProducto[][] estanterias = new ObjProducto[d][d];
        int fila = 0, col = 0;

        for (ObjProducto[] vector : listaEstanterias) {
            for (ObjProducto p : vector) {
                if (fila < d && col < d) {
                    estanterias[fila][col] = p;
                    col++;
                    if (col == d) {
                        col = 0;
                        fila++;
                    }
                }
            }
        }
        return estanterias;
    }

    // Método para mostrar la matriz de estanterías organizada
    public void mostrarMatrizEstanterias(ObjProducto[][] estanterias) {
        for (int i = 0; i < estanterias.length; i++) {
            for (int j = 0; j < estanterias[i].length; j++) {
                if (estanterias[i][j] != null) {
                    System.out.print(estanterias[i][j] + " | ");
                } else {
                    System.out.print("Vacio | ");
                }
            }
            System.out.println();
        }
    }

     // Método para generar la matriz de ventas con valores aleatorios entre 1000 y 10000
     public int[][] generarMatrizVentas(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 1000 + random.nextInt(9001); // Valores entre 1000 y 10000
            }
        }
        return matriz;
    }

    // Método para mostrar la matriz de ventas
    public void mostrarMatrizVentas(int[][] matriz, String[] vendedores) {
        System.out.println("Ventas mensuales:");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s", "Vendedor");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%8s", "M" + i);
        }
        System.out.printf("%10s\n", "Total");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < matriz.length; i++) {
            int total = 0;
            System.out.printf("%-10s", vendedores[i]);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%8d", matriz[i][j]);
                total += matriz[i][j];
            }
            System.out.printf("%10d\n", total);
        }
        System.out.println("-------------------------------------------------");
    }

    // Método para obtener el vendedor con mayor venta anual
    public void obtenerMejorVendedor(int[][] matriz, String[] vendedores) {
        int maxVenta = 0;
        String mejorVendedor = "";

        for (int i = 0; i < matriz.length; i++) {
            int totalVentas = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                totalVentas += matriz[i][j];
            }
            if (totalVentas > maxVenta) {
                maxVenta = totalVentas;
                mejorVendedor = vendedores[i];
            }
        }

        System.out.println("\nEl mejor vendedor del año es: " + mejorVendedor);
        System.out.println("Total de ventas anuales: $" + maxVenta);
    }

     // Método para generar la matriz de productos con valores aleatorios
     public ObjProducto2[][] llenarMatrizProductos(int n) {
        ObjProducto2[][] matriz = new ObjProducto2[n][n]; // Matriz de n x n
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String nombre = "Producto" + (i * n + j + 1);
                double precio = 100 + random.nextDouble() * 900; // Precio entre 100 y 1000
                boolean enOferta = random.nextBoolean(); // Aleatorio true o false

                matriz[i][j] = new ObjProducto2(nombre, precio, enOferta);
            }
        }
        return matriz;
    }

    // Método para mostrar la matriz de productos
    public void mostrarMatrizProductos(ObjProducto2[][] matriz) {
        System.out.println("\nLista de productos:");
        System.out.println("---------------------------------------");
        for (ObjProducto2[] fila : matriz) {
            for (ObjProducto2 producto : fila) {
                System.out.printf("%-12s | $%-7.2f | Oferta: %-5s\n",
                        producto.getNombre(), producto.getPrecio(), producto.isEnOferta() ? "Sí" : "No");
            }
            System.out.println("---------------------------------------");
        }
    }

    // Método para contar cuántos productos están en oferta
    public int contarProductosEnOferta(ObjProducto2[][] matriz) {
        int contador = 0;
        for (ObjProducto2[] fila : matriz) {
            for (ObjProducto2 producto : fila) {
                if (producto.isEnOferta()) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
