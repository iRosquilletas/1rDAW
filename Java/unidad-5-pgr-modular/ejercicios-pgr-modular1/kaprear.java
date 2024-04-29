import java.util.Scanner;

import libreria.FNumDAW;

public class kaprear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        // Utilizar la función kaprear de la librería Kaprekar
        if (FNumDAW.kaprear(numero)) {
            System.out.println(numero + " es un número de Kaprekar.");
        } else {
            System.out.println(numero + " no es un número de Kaprekar.");
        }
        sc.close();
    }
}