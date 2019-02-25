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
public class RetailR extends EslabonC {

    public RetailR(String nombre, String descripcion, String direccion, Producto productos) {
        super(nombre, descripcion, direccion, productos);
    }

    @Override
    public void registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Productopro agregarprecio(double precio, String codigo, Productopro producto){
        producto.setCodigoven(codigo);
        producto.setPrecio(precio);
        return producto;
    }
    
}
