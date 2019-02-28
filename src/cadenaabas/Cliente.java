package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class Cliente {
    
    private String nombre;
    private ArrayList<Productopro> productos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        ArrayList<Productopro> productos = new ArrayList<>();
        this.productos = productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProdcutos(ArrayList<Productopro> prodcutos) {
        this.productos = prodcutos;
    }
    
    public boolean adquirirproduc(Productopro pro){
        if (this.productos.add(pro)) {
            return true;
        }
        return false;
    }
}