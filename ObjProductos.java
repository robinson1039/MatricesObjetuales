public class ObjProductos {
    private String nombre;
    private double precio;
    private int cantidad;
    private int stok;
    public ObjProductos(String nombre, double precio, int cantidad, int stok) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stok = stok;
    }
    public ObjProductos() {
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public int getStok() {
        return stok;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public void sumarStock(int cantidad) {
        this.stok += cantidad;
    }
}
