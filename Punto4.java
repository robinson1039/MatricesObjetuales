public class Punto4 {
    public void p4(int d){
        Metodos metodos = new Metodos();
        ObjProductos[][] matriz = new ObjProductos[d][d];
        matriz = metodos.llenarMatrizObjProductos(d);
        metodos.mostrarMatrizObjProductos(matriz);
        metodos.ordenarAcientoOrdenAscendente(matriz);
    }
}
