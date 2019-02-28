package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author jhon
 */
public class Granja extends EslabonC{
    
    private ArrayList<Productoc> producto;
    
    public Granja(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        ArrayList<Productoc> pro = new ArrayList<>();
        this.producto = pro;
    }
    
    public ArrayList<Productoc> getProducto() {
        return producto;
    }
    
    public void listar(){
        System.out.println("Lista de materias primas cultivadas: ");
        int i =0;
        for(Productoc pro : this.producto)
            System.out.println(i+1 + " Nombre: " + pro.nombre);
    }
    
    public void crearpro(String nombre, int dia, int mes, int anio){
        Fecha fecha = new Fecha(dia, mes, anio);
        ArrayList<Fecha> fech = new ArrayList<>();
        fech.add(fecha);
        Productoc proc = new Productoc(fech, nombre);
        proc.anadirname(this.nombre);
        this.producto.add(proc);
        //return this.producto;
    }
    
    public void enviar(Productoc producto, String namae, int dia, int mes, int anio){
        producto.anadirname(namae);
        producto.anadirfecha(dia, mes, anio);
    }
}