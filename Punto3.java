public class Punto3 {
    public void p3(int d){
        Metodos metodos = new Metodos();
        ObjProductos[][] matriz = new ObjProductos[d][d];
        matriz = metodos.llenarMatrizObjProductos(d);
        metodos.mostrarMatrizObjProductos(matriz);
        metodos.encontrarPrecioMayor(matriz);
    }
}
