package ejemplo1;

public class Alimento {
    int cantidad, precio;
    String nombre, descripcion;
    
    public Alimento(int cantidad, int precio, String nombre, String descripcion) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }    
    
    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
