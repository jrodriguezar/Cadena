package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author jhon
 */
public abstract class Producto {
    protected ArrayList<Fecha> fecha;
    protected String nombre;

    public Producto(ArrayList<Fecha> fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }
    
    public abstract void imprimirtraza();
}
