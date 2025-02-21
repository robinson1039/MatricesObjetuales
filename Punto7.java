public class Punto7 {
    public void p7(int d) {
        Metodos metodos = new Metodos();
        
        // Llenar la matriz de estudiantes
        ObjEstudiantes[][] matriz = metodos.llenarMatrizEstudiantes(d);
        
        // Mostrar la matriz original de estudiantes
        System.out.println("Matriz original de estudiantes:");
        metodos.mostrarMatrizEstudiantes(matriz);
        
        // Agrupar estudiantes por calificación
        metodos.agruparEstudiantesPorCalificacion(matriz);
    }
}
