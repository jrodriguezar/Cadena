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
public class Productopro extends Producto{
    
    private ArrayList<Productoc> materiap;
    private int nlote;
    private double precio;
    private String codigoven;

    public Productopro(ArrayList<Productoc> materiap, int nlote, Fecha fecha, String nombre) {
        super(fecha, nombre);
        this.materiap = materiap;
        this.nlote = nlote;
    }

    public Productopro(ArrayList<Productoc> materiap, int nlote, double precio, String codigoven, Fecha fecha, String nombre) {
        super(fecha, nombre);
        this.materiap = materiap;
        this.nlote = nlote;
        this.precio = precio;
        this.codigoven = codigoven;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigoven(String codigoven) {
        this.codigoven = codigoven;
    }

    public void registro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
