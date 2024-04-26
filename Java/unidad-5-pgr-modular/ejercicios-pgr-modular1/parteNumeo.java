import java.util.Scanner;
import libreria.FNumDAW;

public class parteNumeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, posicionInicial, posicionFinal;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.print("Ingrese la posición inicial: ");
        posicionInicial = sc.nextInt();

        System.out.print("Ingrese la posición final: ");
        posicionFinal = sc.nextInt();

        // Utilizar la librería para obtener el trozo del número
        int trozo = FNumDAW.parteNumero(numero, posicionInicial, posicionFinal);

        // Mostrar el resultado en la consola
        if (trozo != -1) {
            System.out.println("El trozo del número es: " + trozo);
        }

        sc.close();
    }
}