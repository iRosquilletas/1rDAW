import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántos insectos hay?: ");
        int insectos = scanner.nextInt();

        System.out.print("Cuantos aracnidos hay?: ");
        int aracnidos = scanner.nextInt();

        System.out.print("Cuantos crustáceos hay?");
        int crustaceos = scanner.nextInt();

        System.out.print("Cuantos cienpies hay?: ");
        int ciempiés = scanner.nextInt();

        System.out.print("Ingrese la cantidad de segmentos de cada ciempiés: ");
        int segmentosCien = scanner.nextInt();

        System.out.print("Ingrese la cantidad de milpiés: ");
        int milpiés = scanner.nextInt();

        System.out.print("Ingrese la cantidad de segmentos de cada milpiés: ");
        int segmentosMil = scanner.nextInt();

        int patasInsectos = insectos * 6;
        int patasAracnidos = aracnidos * 8;
        int patasCrustaceos = crustaceos * 10;
        int patasCiempiés = ciempiés * 2 * segmentosCien;
        int patasMilpiés = milpiés * 4 * segmentosMil;

        int patasTotales = patasInsectos + patasAracnidos + patasCrustaceos + patasCiempiés + patasMilpiés;

        System.out.println("El total de patas es: " + patasTotales);
        scanner.close();
    }
}