import java.util.Scanner;
import libreria.FNumDAW;

public class digitoso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, posicion;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.print("Ingrese la posición del dígito que desea obtener: ");
        posicion = sc.nextInt();

        // Utilizando el método de la clase DigitoEnPosicion
        int digito = FNumDAW.digitoN(numero, posicion);

        if (digito != -1) {
            System.out.println("El dígito en la posición " + posicion + " es: " + digito);
        } else {
            System.out.println("La posición especificada está fuera de rango.");
        }

        sc.close();
    }
}
