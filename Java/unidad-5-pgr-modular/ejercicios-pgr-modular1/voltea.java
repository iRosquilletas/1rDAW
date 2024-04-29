import java.util.Scanner;
import libreria.FNumDAW;

public class voltea {
    public static void main(String[] args) {
        int numero, resuelto;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        resuelto = FNumDAW.invertir(numero);
        System.out.printf("Este es: %d%n", resuelto);

        sc.close();

    }

}
