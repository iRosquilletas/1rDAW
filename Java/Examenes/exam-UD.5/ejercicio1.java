
import java.util.Scanner;

import libreria.fnadaw;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        String fila;

        System.out.println("Introduce de cuantos renglones quieres: ");
        numeros = sc.nextInt();
        char[][] tabla = new char[numeros][numeros];
        sc.nextLine();

        for (int i = 0; i < numeros;  i++) {
            System.out.print("Introduce la fila de los numeros: ");
            fila = sc.nextLine();

            for (int j = 0; j < numeros; j++) {
                tabla[i][j] = fila.charAt(j);
            }
            }

        char[][] codificacion = fnadaw.codificador(tabla);

        for (int i = 0; i < numeros; i++) {
            for (int j = 0; j < numeros; j++) {
                System.out.print(codificacion[i][j] + "");
            } 
            System.out.println();
    }
        sc.close();
    }
}