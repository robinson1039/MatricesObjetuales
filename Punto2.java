public class Punto2 {
    public void p2(int d){
        Metodos metodos = new Metodos();
        ObjProductos[][] matriz = new ObjProductos[d][d];
        matriz = metodos.llenarMatrizObjProductos(d);
        metodos.mostrarMatrizObjProductos(matriz);
        metodos.sumarCantidad(matriz);
    }
}
