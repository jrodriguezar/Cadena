package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author jhon
 */
public class Productopro extends Producto{
    
    private ArrayList<Productoc> materiap;
    private int nlote;
    private double precio;
    private String codigoven;
    private ArrayList<String> nombreslug;

    public Productopro(ArrayList<Productoc> materiap, int nlote, ArrayList<Fecha> fecha, String nombre, ArrayList<String> names) {
        super(fecha, nombre);
        this.materiap = materiap;
        this.nlote = nlote;
        this.nombreslug = names;
    }

    public Productopro(ArrayList<Productoc> materiap, String codigoven, ArrayList<Fecha> fecha, String nombre, ArrayList<String> names, int nlote, double precio) {
        super(fecha, nombre);
        this.materiap = materiap;
        this.nlote = nlote;
        this.precio = precio;
        this.codigoven = codigoven;
        this.nombreslug = names;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigoven(String codigoven) {
        this.codigoven = codigoven;
    }
    
    public void añadirfecha(Fecha fecha){
        this.fecha.add(fecha);
    }
    
    public void añadirname(String name){
        this.nombreslug.add(name);
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigoven() {
        return codigoven;
    }

    public ArrayList<Productoc> getMateriap() {
        return materiap;
    }

    public int getNlote() {
        return nlote;
    }

    public ArrayList<String> getNombreslug() {
        return nombreslug;
    }
    
    public void anadirname(String name){
        this.nombreslug.add(name);
    }
    
    public void anadirfecha(int dia, int mes, int anio){
        Fecha fech = new Fecha(dia, mes, anio);
        this.fecha.add(fech);
    }

    @Override
    public void imprimirtraza() {
        System.out.println("Nombre del producto: " + this.nombre);
        System.out.println("Trazado del producto: ");
        for (int i = 1; i < this.nombreslug.size(); i+=2) {
            System.out.println("En la fecha: " + this.fecha.get(i-1).imprimirfech() + "\n" + "paso por el lugar: " + this.nombreslug.get(i-1));
            System.out.println("En la fecha: " + this.fecha.get(i).imprimirfech() + "\n" + "fue enviado a: " + this.nombreslug.get(i));
        }
        System.out.println("Ingredientes del producto: ");
        for(Productoc pro : this.materiap){
                pro.imprimirtraza();
        }
    }
}