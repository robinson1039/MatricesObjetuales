public class ObjProducto {
    private String nombre;
    private double peso;
    private String categoria;

    public ObjProducto(String nombre, double peso, String categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre + " (" + peso + "kg, " + categoria + ")";
    }
}
