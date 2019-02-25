/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author jrodriguezar
 */
public class ManofacturaW extends EslabonC{

    private Granja granjaX;
    private Granja granjaY;

    public ManofacturaW(Granja granjaX, Granja granjaY, String nombre, String descripcion, String direccion, Producto productos) {
        super(nombre, descripcion, direccion, productos);
        this.granjaX = granjaX;
        this.granjaY = granjaY;
    }

    public ManofacturaW(String nombre, String descripcion, String direccion, Producto productos) {
        super(nombre, descripcion, direccion, productos);
    }
    
    public ArrayList<Productoc> unionmat(Productoc p, Productoc r){
        ArrayList<Productoc> proc = null;
        proc.add(r);
        proc.add(p);
        return proc;
    }
    public Productopro procesarpro(String nombre, int nlote, ArrayList<Productoc> productos, Fecha fecha){
        return new Productopro(productos, nlote, fecha, nombre);
    }

    @Override
    public void registrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}