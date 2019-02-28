package cadenaabas;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class GestionArchivo {
    private String direccion;

    public GestionArchivo(String direccion) {
        this.direccion = direccion;
    }
    
    public boolean guardar(ArrayList<Productopro> pro){
        return true;
    }
    
    /*public ArrayList<Productopro> cargar() throws FileNotFoundException{
        return
    }*/
}
