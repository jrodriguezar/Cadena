package cadenaabas;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jhon
 */
public class Main {

    public static void main(String[] args) {
        Granja granjax = new Granja("GranjaX", "Pequenia", "calle-123");
        Granja granjay = new Granja("GranjaY", "Grande", "calle-142");
        ManofacturaW manow = new ManofacturaW("ManoW", "pequenia", "calle123");
        CentroDistribucion centrodistri = new CentroDistribucion("Servientrega", "Sabroson", "calle-1756");
        RetailR retail = new RetailR("Exito", "Severo", "calle142-carr-43");

        Scanner lectura = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        String n = "BaseDatos.txt";

        GestionArchivo g = new GestionArchivo(n);

        /*try {
            retail.setProductos(g.cargar());
        } catch (FileNotFoundException e) {
            System.out.println("File not found -- " + n);
            e.printStackTrace();
        }*/
        do {
            System.out.println("Bienvenido al sistema comercial de comidas POO \n" + "Por favor indique el tipo de usuario es: ");
            System.out.println("1. Cliente de compra.");
            System.out.println("2. Gerente de cadena de suminiCliente de comstros.");
            System.out.println("3. Salir.");
            String a1 = lectura.nextLine();
            a = Integer.parseInt(a1);

            
            switch (a) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nam = lectura.nextLine();
                    Cliente cliente = new Cliente(nam);
                    System.out.println("Hola " + nam + ". Qué desea hacer hoy?");
                    System.out.println("1. Comprar producto");
                    System.out.println("2. Terminar sesion");
                    String b1 = lectura.nextLine();
                    b = Integer.parseInt(b1);

                    
                    do {
                        switch (b) {
                            case 1:
                                if (retail.getProductos().isEmpty()) {
                                    System.out.println("No hay productos disponibles para la compra actualmente.");
                                    break;
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
                    System.out.println("Bienvenido gerente, a continuacion se presentara el menu de opciones: ");
                    System.out.println("1. Mandar a cultivar un producto");
                    System.out.println("2. Mandar a procesar un producto(Pan)");
                    System.out.println("3. Enviar producto a un centro de distribucion");
                    System.out.println("4. Dar valor a un producto en un retail");
                    System.out.println("5. Consultar trazabilidad de un producto");
                    System.out.println("6. Terminar sesion");
                    String d1 = lectura.nextLine();
                    int d = Integer.parseInt(d1);

                    do {
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
                                    }break;
                                }
                                
                            case 2:
                                System.out.println("Ingrese el nombre del producto a procesar");
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
                                if (nuy.equals("Pan")) {
                                    granjax.enviar(granjax.getProducto().get(0), "ManoW", di3, ms3, an3);
                                    manow.añadirmateria(granjax.getProducto().get(0));
                                    granjay.enviar(granjay.getProducto().get(0), "ManoW", di3, ms3, an3);
                                    manow.añadirmateria(granjay.getProducto().get(0));
                                }else{
                                    System.out.println("Lo sentimos, el produto no puede ser procesado");
                                }
                                break;
                        }
                    } while ((d > 0) && (d < 7));
                    break;
                case 3:
                    System.out.println("Gracias por su visita.");
                    a = 8;
                    break;
            }
        } while ((a > 0) && (a < 4));
    }
}
