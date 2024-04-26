/* Escribe un programa que diga si un número introducido por teclado es o no primo. Un número
primo es aquel que sólo es divisible entre él mismo y la unidad. Debes usar un bucle while */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce un número: ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("El número debe ser positivo");
            System.out.print("Introduce un número: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int resultado = i + j + i * j;
                System.out.printf("Par (%d,%d): %d+%d+%d*%d vale %d%n", i, j, i, j, i, j, resultado);
            }
        }

        sc.close();

    }
}
