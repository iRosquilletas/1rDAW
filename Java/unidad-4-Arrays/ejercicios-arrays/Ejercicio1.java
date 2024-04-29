import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Introduce 15 números: ");

        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int ultimo = numeros[14];

        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultimo;

        System.out.println("Al reves es así: ");

        for (int i = 0; i < 15; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);

            sc.close();
        }
    }
}