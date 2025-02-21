public class Punto6 {
    public void p6(int d) {
        Metodos metodos = new Metodos();
        ObjProductoMarket[][] matriz = metodos.llenarMatrizObjProductosMarket(d);
        
        System.out.println("Matriz original:");
        metodos.mostrarMatrizObjProductosMarket(matriz);
        
        // Obtener la nueva matriz con elementos disponibles
        ObjProductoMarket[][] productosDisponibles = metodos.obtenerElementosDisponibles(matriz);

        // Mostrar la nueva matriz
        System.out.println("\nElementos disponibles:");
        mostrarMatriz(productosDisponibles);
    }

    private void mostrarMatriz(ObjProductoMarket[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) {
                    System.out.println("Nombre: " + matriz[i][j].getNombre());
                    System.out.println("Precio: " + matriz[i][j].getPrecio());
                    System.out.println("Disponible: " + matriz[i][j].isDisponible());
                    System.out.println("-----------------------");
                }
            }
        }
    }
}