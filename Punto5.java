public class Punto5 {
    public void p5(int d){
        Metodos metodos = new Metodos();
        ObjProductos[][] matriz1 = new ObjProductos[d][d];
        ObjProductos[][] matriz2 = new ObjProductos[d][d];
        System.out.println("Ingrece la matriz 1:");
        matriz1 = metodos.llenarMatrizObjProductos(d);
        System.out.println("Ingrece la matriz 2:");
        matriz2 = metodos.llenarMatrizObjProductos(d);
        metodos.mostrarMatrizObjProductos(matriz1);
        metodos.mostrarMatrizObjProductos(matriz2);
        ObjProductos[][] matrizFusionada = metodos.juntarMatrices(matriz1, matriz2);

        System.out.println("Matriz fusionada:");
        metodos.mostrarMatrizObjProductos(matrizFusionada);
    }
    
}
