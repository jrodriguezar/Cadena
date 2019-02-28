package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author jhon
 */
public class ManofacturaW extends EslabonC{
    
    private ArrayList<Productoc> produc;
    private ArrayList<Productopro> prodp;
    
    public ManofacturaW(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        ArrayList<Productoc> produc = new ArrayList<>();
        ArrayList<Productopro> produp = new ArrayList<>();
        this.produc = produc;
        this.prodp = produp;
    }
    
    public void añadirmateria(Productoc produc){
        this.produc.add(produc);
    }
    
    public ArrayList<Productoc> getProduc() {
        return produc;
    }
    
    public ArrayList<Productopro> getProdp() {
        return prodp;
    }
    
    public void procesarpro(String nombre, int nlote, int dia, int mes, int anio){
        Fecha fecha = new Fecha(dia, mes, anio);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Fecha> fech = new ArrayList<>();
        fech.add(fecha);
        name.add(this.nombre);
        Productopro pro = new Productopro(this.produc, nlote, fech, nombre, name);
        this.prodp.add(pro);
    }
    
    public void enviar(Productopro producto, String namae, int dia, int mes, int anio){
        producto.anadirname(namae);
        producto.anadirfecha(dia, mes, anio);
    }
}