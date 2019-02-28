package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author jhon
 */
public class CentroDistribucion extends EslabonC{
    private ArrayList<Productopro> productopro;

    public CentroDistribucion(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        ArrayList<Productopro> productopro = new ArrayList<>();
        this.productopro = productopro;
    }

    public ArrayList<Productopro> getProductopro() {
        return productopro;
    }
    
    public void cargarpro(Productopro producto, int dia, int mes, int anio){
        Fecha fecha = new Fecha(dia, mes, anio);
        producto.añadirfecha(fecha);
        producto.añadirname(nombre);
        this.productopro.add(producto);
        //return producto;
    }
    
    public void enviar(Productopro producto, String namae, int dia, int mes, int anio){
        producto.anadirname(namae);
        producto.anadirfecha(dia, mes, anio);
    }
}