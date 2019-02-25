package cadenaabas;

/**
 *
 * @author jrodriguezar
 */
public abstract class Producto {
    protected Fecha fecha;
    protected String nombre;

    public Producto(Fecha fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }
    
    public abstract void registro();
}
