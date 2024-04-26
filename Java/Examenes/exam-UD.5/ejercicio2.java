
//Te envio este por si acaso, no me aclaré mucho.
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String idioma, nombre, saludo;
        System.out.println("Introduce el idioma [ES/EN/FR]:");
        idioma = sc.nextLine();

        System.out.println("Introduce el nombre del destinatario:");
        nombre = sc.nextLine();

        switch (idioma) {
            case "ES":
                saludo = "Estimado " + nombre;
                break;
            case "EN":
                saludo = "Dear " + nombre;
                break;
            case "FR":
                saludo = "Cher " + nombre;
                break;
            default: 
                saludo = "";
        }
        System.out.println(saludo);

        System.out.println("Introduce la despedida:");
        String despedida = sc.nextLine();

        System.out.println(despedida);
    sc.close();
    }
}