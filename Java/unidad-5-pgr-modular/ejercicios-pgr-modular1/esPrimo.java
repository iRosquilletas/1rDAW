import java.util.Scanner;
import libreria.FNumDAW;

public class prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        boolean resultado;
        System.out.print("Número: ");
        a = sc.nextInt();

        resultado = FNumDAW.esPrimo(a);

        if (resultado) {
            System.out.printf("%d es primo", a);
        } else {
            System.out.printf("%d no es primo", a);
        }

        sc.close();
    }
}
