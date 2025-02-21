public class ObjEstudiantes {
    private String nombre;
    private char calificacion;

    public ObjEstudiantes(String nombre, char calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public char getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return nombre + " (" + calificacion + ")";
    }
}
