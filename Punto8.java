public class Punto8 {
    public void p8(int d) {
        Metodos metodos = new Metodos();

        // Llenar lista de productos
        ObjProducto[] productos = metodos.generarListaProductos(d * d);

        // Mostrar lista de productos original
        System.out.println("Lista original de productos:");
        metodos.mostrarListaProductos(productos);

        // Agrupar por categoría y llenar la matriz de estanterías
        ObjProducto[][] estanterias = metodos.llenarEstanterias(productos, d);

        // Mostrar la matriz de estanterías
        System.out.println("\nMatriz de estanterías organizada por categoría:");
        metodos.mostrarMatrizEstanterias(estanterias);
    }
}
