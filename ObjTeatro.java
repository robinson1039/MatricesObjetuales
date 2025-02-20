public class ObjTeatro {
    private int numero;
    private int fila;
    private float precio;

    public ObjTeatro(int numero, int fila, float precio){
        this.numero = numero;
        this.fila = fila;
        this.precio = precio;
    } 

    public ObjTeatro(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}
