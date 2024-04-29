import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lab.*;

public class demo {
    public static void main(String[] args) {
        List<Formulario> formularios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int contaPedi = 0;
        int contaDevo = 0;
        int contadorReclam = 0;
        int a;

        do {

            System.out.println("1.- Crear pedido");
            System.out.println("2.- Crear devolución");
            System.out.println("3.- Crear reclamación");
            System.out.println("4.- Cerrar reclamación");
            System.out.println("5.- Imprimir formulario por ID");
            System.out.println("6.- Imprimir todas las reclamaciones");
            System.out.println("7.- Imprimir todos los formularios");
            System.out.println("0.- Salir");

            System.out.print("Elige una: ");

            a = sc.nextInt();

            sc.nextLine();

            switch (a) {
                case 1:
                    contaPedi++;
                    System.out.print("Nombre del cliente: ");
                    String clienPedi = sc.nextLine();
                    System.out.print("Producto: ");

                    String produPide = sc.nextLine();
                    System.out.print("Precio: ");
                    double precioPedi = sc.nextDouble();
                    String idPedi = "PE" + contaPedi;

                    formularios.add(new Pedido(idPedi, clienPedi, produPide, precioPedi));
                    System.out.println("Se hizo el pedido, con ID: " + idPedi);
                    break;

                case 2:
                    contaDevo++;
                    System.out.print("Nombre del cliente: ");
                    String clienteDevo = sc.nextLine();
                    System.out.print("Producto: ");
                    String producDevo = sc.nextLine();
                    System.out.print("Precio: ");
                    double precioDevo = sc.nextDouble();

                    String idDevo = "DE" + contaDevo;
                    formularios.add(new Devolucion(idDevo, clienteDevo, producDevo, precioDevo));
                    System.out.println("Devolución con ID: " + idDevo);
                    break;

                case 3:
                    contadorReclam++;
                    System.out.print("Nombre del cliente: ");
                    String clienRecla = sc.nextLine();
                    System.out.print("Texto de la reclamación: ");
                    String textoRecla = sc.nextLine();
                    String idRecla = "RE" + contadorReclam;
                    formularios.add(new Reclamacion(idRecla, clienRecla, textoRecla));

                    System.out.println("Reclamación con ID: " + idRecla);
                    break;

                case 4:
                    System.out.print("Qué ID quieres cerrar: ");
                    String idCerrarRecla = sc.nextLine();
                    for (Formulario xd : formularios) {

                        if (xd instanceof Reclamacion && xd.getId().equals(idCerrarRecla)) {
                            Reclamacion reclamacion = (Reclamacion) xd;
                            reclamacion.cerrarReclamacion();
                            System.out.println("Reclamación cerrada.");
                            break;
                        }

                    }

                    break;

                case 5:
                    System.out.print("Cual ID quieres imprimir del formulario: ");
                    String idBuscar = sc.nextLine();
                    for (Formulario xd : formularios) {

                        if (xd.getId().equals(idBuscar)) {
                            xd.imprimirDatos();
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Reclamaciones:");
                    for (Formulario xd : formularios) {
                        if (xd instanceof Reclamacion) {
                            xd.imprimirDatos();
                        }
                    }
                    break;

                case 7:
                    System.out.println("Todos los formularios:");
                    for (Formulario xd : formularios) {
                        xd.imprimirDatos();
                    }
                    break;

                case 0:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Error");
                    break;
            }

        } while (a != 0);

        sc.close();

    }
}