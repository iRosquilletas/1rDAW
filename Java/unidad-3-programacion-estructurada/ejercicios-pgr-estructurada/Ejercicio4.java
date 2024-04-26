/* Escribe un programa que diga si un número introducido por teclado es o no primo. Un número
primo es aquel que sólo es divisible entre él mismo y la unidad. Debes usar un bucle while */

import java.util.Scanner;

public class Ejercicio4 {
    public static boolean Primo(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        if (Primo(numero) == true) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
        sc.close();
    }

}
