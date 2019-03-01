package cadenaabas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class GestionArchivo {
    
    private String direccion; 
    
    GestionArchivo(String descripcion) {
        this.direccion = descripcion;
    }

    public boolean guardar(ArrayList<Productopro> producto) throws IOException {
        File archivo = new File(this.direccion);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        
        PrintStream salida = new PrintStream(archivo);
        this.direccion = direccion;
        for (int i = 0; i < producto.size(); i++) {
            salida.print(producto.get(i).nombre);
            salida.print(",");
            salida.print(producto.get(i).getCodigoven());
            salida.print(",");
            salida.print(producto.get(i).getPrecio());
            salida.print(",");
            salida.print(producto.get(i).getNlote());
            salida.print(",");
            for(String nam : producto.get(i).getNombreslug()){
                salida.print(nam);
                salida.print(",");
            }
            for(Fecha fecha : producto.get(i).fecha){
                salida.print(fecha.getDia());
                salida.print(",");
                salida.print(fecha.getMes());
                salida.print(",");
                salida.print(fecha.getAnio());
                salida.print(",");
            }
            for(Productoc pro: producto.get(i).getMateriap()){
                salida.print(pro.nombre);
                salida.print(",");
                for(Fecha fe: pro.fecha){
                    salida.print(fe.getDia());
                    salida.print(",");
                    salida.print(fe.getMes());
                    salida.print(",");
                    salida.print(fe.getAnio());
                    salida.print(",");
                }
                for(String namae: pro.getNombrelug()){
                    salida.print(namae);
                    salida.print(",");
                }
            }
        }
        return true;
    }
    
    /*public ArrayList<Productopro> cargar() throws FileNotFoundException{
        ArrayList<Productopro> data = new ArrayList<>();
        Scanner lectura;
        
        try{
            lectura = new Scanner(new File(this.direccion));
            lectura.useDelimiter(",");
            
            while (lectura.hasNext()){
                //poner aqui para que lea los items del archivo
            }
            
        }catch(FileNotFoundException e){
            System.out.println("File not found -- " + this.direccion);
            e.printStackTrace();
        }
        return data;
    }*/
}
