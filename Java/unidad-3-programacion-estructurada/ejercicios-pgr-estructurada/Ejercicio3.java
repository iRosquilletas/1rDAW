/* Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
positivo o negativo. Se permiten números de hasta 6 dígitos. */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        while (numero > 999999) {
            System.out.print("No puede ser un número de más de 6 digitos");
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
        }

        if (numero == 0) {
            numero++;
        }
        System.out.println("Tiene " + Math.floor(Math.log10(Math.abs(numero)) + 1) + " digitos");

        sc.close();
    }
}
