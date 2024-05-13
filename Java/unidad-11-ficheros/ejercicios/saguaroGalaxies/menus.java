import java.util.Scanner;

public class menus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean seguir = true;

        while (seguir) {
            System.out.println();
            System.out.println("1. Información del objeto: ");
            System.out.println("2. Información de la constelación: ");
            System.out.println("3. Información con limite: ");
            System.out.println("4. Salir");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                if (opcion == 1) {
                    varMenu.NombreObjeto();
                    System.out.println();
                } else if (opcion == 2) {
                    varMenu.constelación();
                    System.out.println();
                } else if (opcion == 3) {
                    varMenu.MagnitudLimite();
                    System.out.println();
                } else if (opcion == 4) {
                    seguir = false;
                } else {
                    System.out.println("Error: Opción inválida. Por favor ingrese un número válido.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número.");
                sc.next(); // Limpiar el buffer del Scanner
            }
        }

    }
}