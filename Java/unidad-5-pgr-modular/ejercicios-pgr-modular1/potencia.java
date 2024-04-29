import java.util.Scanner;
import libreria.FNumDAW;
public class potencias{
    public static void main(String[] args){
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el número: ");
    a = sc.nextInt();

    System.out.print("Introduce la potencia: ");
    b = sc.nextInt();

    c = FNumDAW.potencia(a,b);
    System.out.print(c);

    sc.close();
    }
}
