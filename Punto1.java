public class Punto1 {
    public void p1(int d){
        Metodos metodos = new Metodos();
        ObjProductos[][] matriz = new ObjProductos[d][d];
        matriz = metodos.llenarMatrizObjProductos(d);
        metodos.mostrarMatrizObjProductos(matriz);
        System.out.println("El producto y posicion es:");
        metodos.encontrarProducto(matriz, "pan");
    }
}
