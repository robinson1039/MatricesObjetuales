public class Punto10 {
    public void p10(int n) {
        Metodos metodos = new Metodos();

        // Llenar la matriz con productos
        ObjProducto2[][] matrizProductos = metodos.llenarMatrizProductos(n);

        // Mostrar la matriz de productos
        metodos.mostrarMatrizProductos(matrizProductos);

        // Contar y mostrar cuántos productos están en oferta
        int totalEnOferta = metodos.contarProductosEnOferta(matrizProductos);
        System.out.println("\nTotal de productos en oferta: " + totalEnOferta);
    }
}
