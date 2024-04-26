/* scribe un programa que pida una base y un exponente (enteros positivos) y que calcule la
potencia realizando un bucle. */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero;
        int exponente;
        int operacion = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        System.out.print("Introduce el exponente: ");
        exponente = sc.nextInt();

        for (int i = 1; i <= exponente; i++) {
            operacion = numero * operacion;
            System.out.printf("%d elevado a %d es: %d%n", numero, i, operacion);
        }
        sc.close();
    }
}
