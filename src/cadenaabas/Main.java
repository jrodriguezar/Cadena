package cadenaabas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Granja granjax = new Granja("GranjaX", "Pequenia", "lat12-lon:143");
        Granja granjay = new Granja("GranjaY", "Grande", "lat12-lon:13");
        ManofacturaW manow = new ManofacturaW("ManoW", "pequenia", "lat1223-lon:13");
        CentroDistribucion centrodistri = new CentroDistribucion("Servientrega", "Sabroson", "lat12-lon:1334");
        RetailR retail = new RetailR("Exito", "Severo", "lat123434-lon:13343");

        Scanner lectura = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        String n = new String("BaseDatos.txt");

        GestionArchivo g = new GestionArchivo(n);

        /*try{
            retail.setProductos(g.cargar());
        } catch (FileNotFoundException e) {
            System.out.println("File not found -- " + n);
            e.printStackTrace();
        }*/
        do {
            System.out.println("Bienvenido al sistema comercial de comidas POO \n" + "Por favor indique el tipo de usuario es: ");
            System.out.println("1. Cliente de compra.");
            System.out.println("2. Gerente de cadena de suministros.");
            System.out.println("3. Salir.");
            String a1 = lectura.nextLine();
            a = Integer.parseInt(a1);

            switch (a) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nam = lectura.nextLine();
                    Cliente cliente = new Cliente(nam);
                    do {
                        System.out.println("Hola " + nam + ". Qué desea hacer hoy?");
                        System.out.println("1. Comprar producto");
                        System.out.println("2. Terminar sesion");
                        String b1 = lectura.nextLine();
                        b = Integer.parseInt(b1);

                        switch (b) {
                            case 1:
                                if (retail.getProductos().isEmpty()) {
                                    System.out.println("No hay productos disponibles para la compra actualmente.");
                                } else {
                                    retail.listarproductos();
                                    System.out.println("Digite el numero del producto que desea adquirir");
                                    String nm = lectura.nextLine();
                                    int t = Integer.parseInt(nm);
                                    if (cliente.adquirirproduc(retail.getProductos().get(t))) {
                                        System.out.println("Usted acaba de adquirir su producto exitosamente");
                                        retail.getProductos().get(t).imprimirtraza();
                                    } else {
                                        System.out.println("Ocurrio un error");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("La sesion ha terminado, gracias por su visita " + nam);
                                b = 5;
                                break;
                        }
                    } while ((b > 0) && (b < 3));
                    break;

                case 2:
                    do {
                        System.out.println("Bienvenido gerente, a continuacion se presentara el menu de opciones: ");
                        System.out.println("1. Mandar a cultivar un producto");
                        System.out.println("2. Mandar a procesar un producto(Pan)");
                        System.out.println("3. Enviar producto a un centro de distribucion");
                        System.out.println("4. Dar valor a un producto en un retail");
                        System.out.println("5. Consultar traza de un producto");
                        System.out.println("6. Guardar");
                        System.out.println("7. Terminar sesion");
                        String d1 = lectura.nextLine();
                        d = Integer.parseInt(d1);

                        switch (d) {
                            case 1:
                                System.out.println("Ingrese el nombre del producto a cultivar(Harina o Leche): ");
                                String namae = lectura.nextLine();
                                System.out.println("Ingrese la fecha de cultivo: ");
                                System.out.println("Dia: ");
                                String di1 = lectura.nextLine();
                                int di = Integer.parseInt(di1);
                                System.out.println("Mes: ");
                                String ms1 = lectura.nextLine();
                                int ms = Integer.parseInt(ms1);
                                System.out.println("Anio: ");
                                String an1 = lectura.nextLine();
                                int an = Integer.parseInt(an1);
                                if (namae.equals("Harina")) {
                                    granjay.crearpro(namae, di, ms, an);
                                } else {
                                    if (namae.equals("Leche")) {
                                        granjax.crearpro(namae, di, ms, an);
                                    } else {
                                        System.out.println("El producto no tiene lugar donde ser cultivado");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre del producto a procesar (Pan)");
                                String nuy = lectura.nextLine();
                                System.out.println("Ingrese la fecha de procesamiento: ");
                                System.out.println("Dia: ");
                                String di2 = lectura.nextLine();
                                int di3 = Integer.parseInt(di2);
                                System.out.println("Mes: ");
                                String ms2 = lectura.nextLine();
                                int ms3 = Integer.parseInt(ms2);
                                System.out.println("Anio: ");
                                String an2 = lectura.nextLine();
                                int an3 = Integer.parseInt(an2);
                                System.out.println("Ingrese el número del lote: ");
                                String nlo = lectura.nextLine();
                                int nl = Integer.parseInt(nlo);
                                if (nuy.equals("Pan")) {
                                    if (granjax.getProducto().isEmpty()||granjay.getProducto().isEmpty()) {
                                        System.out.println("No existencias suficientes de materias primas");
                                    }else{
                                        granjax.enviar(granjax.getProducto().get(0), manow.nombre, di3 - 1, ms3, an3);
                                        manow.añadirmateria(granjax.getProducto().get(0));
                                        granjay.enviar(granjay.getProducto().get(0), manow.nombre, di3 - 1, ms3, an3);
                                        manow.añadirmateria(granjay.getProducto().get(0));
                                        manow.procesarpro(nuy, nl, di3, ms3, an3);
                                        System.out.println("Se ha procesado exitosamente el producto " + manow.getProdp().get(0).nombre);
                                    }
                                } else {
                                    System.out.println("Lo sentimos, el produto no puede ser procesado en la manofacturadora actual");
                                }
                                break;
                            case 3:
                                if (manow.getProdp().isEmpty()) {
                                    System.out.println("Lo sentimos, pero no hay productos procesados para enviar");
                                } else {
                                    System.out.println("Escoja el producto que decide enviar al centro de distribucion: ");
                                    manow.listarproductos();
                                    String ger = lectura.nextLine();
                                    int ger2 = Integer.parseInt(ger);

                                    System.out.println("Ingrese la fecha en la que decide enviar el producto al centro de distribucion: ");
                                    System.out.println("Dia: ");
                                    String di4 = lectura.nextLine();
                                    int di5 = Integer.parseInt(di4);
                                    System.out.println("Mes: ");
                                    String ms4 = lectura.nextLine();
                                    int ms5 = Integer.parseInt(ms4);
                                    System.out.println("Anio: ");
                                    String an4 = lectura.nextLine();
                                    int an5 = Integer.parseInt(an4);

                                    manow.enviar(manow.getProdp().get(ger2), centrodistri.nombre, di5-1, ms5, an5);
                                    centrodistri.cargarpro(manow.getProdp().get(ger2), di5, ms5, an5);
                                    System.out.println("El producto ha sido enviado exitosamente");
                                }
                                break;
                            case 4: 
                                if (centrodistri.getProductopro().isEmpty()) {
                                    System.out.println("El centro de distribucion no cuenta con productos para ser enviados al retail");
                                }else{
                                    System.out.println("Escoja el producto que decide enviar al retail: ");
                                    centrodistri.listarproductos();
                                    String ger1 = lectura.nextLine();
                                    int ger3 = Integer.parseInt(ger1);
                                    
                                    System.out.println("Ingrese la fecha en la que decide enviar el producto al centro de distribucion: ");
                                    System.out.println("Dia: ");
                                    String di6 = lectura.nextLine();
                                    int di7 = Integer.parseInt(di6);
                                    System.out.println("Mes: ");
                                    String ms6 = lectura.nextLine();
                                    int ms7 = Integer.parseInt(ms6);
                                    System.out.println("Anio: ");
                                    String an6 = lectura.nextLine();
                                    int an7 = Integer.parseInt(an6);
                                    System.out.println("Ingrese el precio que desea adjudicarle al producto: ");
                                    String prec = lectura.nextLine();
                                    int prec1 = Integer.parseInt(prec);
                                    System.out.println("Ingrese el codigo de venta: ");
                                    String code = lectura.nextLine();
                                    
                                    centrodistri.enviar(centrodistri.getProductopro().get(ger3), retail.nombre, di7-1, ms7, an7);
                                    retail.agregarprecio(prec1, code, centrodistri.getProductopro().get(ger3), di7, ms7, an7);
                                    System.out.println("La operacion ha sido realizada exitosamente.");
                                }
                                break;
                            case 5:
                                if (retail.getProductos().isEmpty()) {
                                    System.out.println("El retail no tiene productos existentes");
                                }else{
                                    System.out.println("Escoja el producto al cual quiere revisar");
                                    retail.listarproductos();
                                    String red = lectura.nextLine();
                                    int red1 = Integer.parseInt(red);
                                    
                                    System.out.println("La traza del producto es: ");
                                    retail.getProductos().get(red1).imprimirtraza();
                                }
                                break;
                            case 6:
                                try{
                                    g.guardar(retail.getProductos());
                                    System.out.println("Se ha guardado exitosamente");
                                }catch(IOException e){
                                    System.out.println("Ha ocurrido un error con el archivo");
                                    e.printStackTrace();
                                }
                                break;
                            case 7:
                                System.out.println("Gracias por su visita gerente");
                                d = 9;
                                break;
                        }
                    } while ((d > 0) && (d < 8));
                    break;
                case 3:
                    System.out.println("Gracias por su visita.");
                    a = 8;
                    break;
            }
        } while ((a > 0) && (a < 4));
    }
}