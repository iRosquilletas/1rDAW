import java.util.Scanner;
import libreria.FNumDAW;

public class pegaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Ingrese el primer número: ");
        numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        numero2 = sc.nextInt();

        // Utilizar la librería para concatenar los números
        int resultado = FNumDAW.pegaNumeros(numero1, numero2);

        // Mostrar el resultado en la consola
        if (resultado != -1) {
            System.out.println("El resultado de la concatenación es: " + resultado);
        }

        sc.close();
    }
}