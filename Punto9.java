public class Punto9 {
    public void p9() {
        Metodos metodos = new Metodos();

        // Definir nombres de los vendedores
        String[] vendedores = {"Carlos", "Ana", "Pedro", "Luisa", "Juan"};

        // Llenar la matriz con ventas aleatorias
        int[][] ventas = metodos.generarMatrizVentas(5, 12);

        // Mostrar la matriz de ventas
        System.out.println("Matriz de ventas por vendedor:");
        metodos.mostrarMatrizVentas(ventas, vendedores);

        // Obtener vendedor con mayor venta anual
        metodos.obtenerMejorVendedor(ventas, vendedores);
    }
}
