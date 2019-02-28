package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author jhon
 */
public class Productoc extends Producto{
    
    private ArrayList<String> nombrelug;

    public Productoc(ArrayList<Fecha> fecha, String nombre) {
        super(fecha, nombre);
        ArrayList<String> nombrelug = new ArrayList<>();
        this.nombrelug = nombrelug;
    }

    public ArrayList<String> getNombrelug() {
        return nombrelug;
    }
    
    public void anadirname(String name){
        this.nombrelug.add(name);
    }
    
    public void anadirfecha(int dia, int mes, int anio){
        Fecha fech = new Fecha(dia, mes, anio);
        this.fecha.add(fech);
    }

    @Override
    public void imprimirtraza() {
        System.out.println("Nombre del producto: " + this.nombre);
        for(int i = 0; i<this.nombrelug.size(); i+=2){
            System.out.println("Fecha de cultivo: " + this.fecha.get(i-1).imprimirfech() + "\n" + "Lugar de cultivo: " + this.nombrelug.get(i-1));
            System.out.println("Fecha de envio: " + this.fecha.get(i).imprimirfech() + "\n" + "Lugar al que se envio: " + this.nombrelug.get(i));
        }
    }    
}