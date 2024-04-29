import lib.Tiempo;
import java.util.Arrays;
import java.util.Scanner;

public class Tiempo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;
        Tiempo[] tiempos = new Tiempo[10];

        System.out.println("Pon 10 tiempos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Tiempo " + (i + 1) + ": ");
            horas = sc.nextInt();
            minutos = sc.nextInt();
            segundos = sc.nextInt();
            tiempos[i] = new Tiempo(horas, minutos, segundos);
        }
        Arrays.sort(tiempos);
        System.out.println("\nDe menor a mayor:");
        for (Tiempo tiempo : tiempos) {
            System.out.println(tiempo);
        }

        sc.close();

    }
}
