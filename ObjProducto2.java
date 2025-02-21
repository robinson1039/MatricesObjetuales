public class ObjProducto2 {
    private String nombre;
    private double precio;
    private boolean enOferta;

    public ObjProducto2(String nombre, double precio, boolean enOferta) {
        this.nombre = nombre;
        this.precio = precio;
        this.enOferta = enOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEnOferta() {
        return enOferta;
    }
}
