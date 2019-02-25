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
public class CentroDistribucion extends EslabonC{
    private ManofacturaW manofact;

    public CentroDistribucion(String nombre, String descripcion, String direccion, Producto productos, ManofacturaW manofact) {
        super(nombre, descripcion, direccion, productos);
        this.manofact = manofact;
    }

    public void registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
