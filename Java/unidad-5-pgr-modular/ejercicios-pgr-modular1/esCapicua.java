import java.util.Scanner;
import libreria.FNumDAW;

public class capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        if (FNumDAW.esCapicua(numero)) {
            System.out.println(numero + " es capicúa.");
        } else {
            System.out.println(numero + " no es capicúa.");
        }

        sc.close();
    }
}
