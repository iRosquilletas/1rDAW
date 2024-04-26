import libreria.FNumDAW;
import java.util.Scanner;
public class digitos {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el dígito: ");
        a = sc.nextInt();

        b = FNumDAW.cuentaDigitos(a);
        System.out.print(b);

        sc.close();
    }
}
