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
public class Granja extends EslabonC{

    public Granja(String nombre, String descripcion, String direccion, Producto productos) {
        super(nombre, descripcion, direccion, productos);
    }
    
    public Productoc crearpro(String nombre, Fecha fecha){
        return new Productoc(fecha, nombre);
    }

    @Override
    public void registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
