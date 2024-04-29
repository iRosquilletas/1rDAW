import libreria.FNumDAW;
import java.util.Scanner;

public class posicionDeDigito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.print("Ingrese el dígito que desea buscar: ");
        digito = sc.nextInt();

        // Utilizar la librería para obtener la posición del dígito
        int posicion = FNumDAW.posicionDeDigito(numero, digito);

        // Mostrar el resultado en la consola
        if (posicion != -1) {
            System.out.println("La posición del dígito " + digito + " en el número " + numero + " es: " + posicion);
        }

        sc.close();
    }
}