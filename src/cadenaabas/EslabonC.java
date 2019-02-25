/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaabas;

/**
 *
 * @author jrodriguezar
 */
public abstract class EslabonC {
    protected String nombre;
    protected String descripcion;
    protected String direccion;
    protected Producto productos;

    public EslabonC(String nombre, String descripcion, String direccion, Producto productos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.productos = productos;
    }
    
    public abstract void registrar();
    
}
