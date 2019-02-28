package cadenaabas;

import java.util.ArrayList;

/**
 *
 * @author jhon
 */
public class RetailR extends EslabonC {
    
    private ArrayList<Productopro> productos;

    public RetailR(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
        ArrayList<Productopro> productos = new ArrayList<>();
        this.productos = productos;
    }

    public ArrayList<Productopro> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productopro> productos) {
        this.productos = productos;
    }
    
    public void listarproductos(){
        System.out.println("Lista de productos disponibles para la venta: ");
        int i = 0;
        for(Productopro pro : this.productos){
            System.out.println(i+1 + ".Nombre del producto: " + pro.nombre);
            System.out.println("Precio del producto: " + pro.getPrecio());
            System.out.println("Codigo de venta: " + pro.getCodigoven());
            i++;
        }
    }
    
    public void agregarprecio(double precio, String codigo, Productopro producto, int dia, int mes, int anio){
        Fecha fecha = new Fecha(dia, mes, anio);
        producto.setCodigoven(codigo);
        producto.setPrecio(precio);
        producto.añadirfecha(fecha);
        producto.añadirname(this.nombre);
        this.productos.add(producto);
        //return producto;
    }
    
    public void vender(Productopro producto, String namaecliente, int dia, int mes, int anio){
        producto.anadirname(namaecliente);
        producto.anadirfecha(dia, mes, anio);
    }
}