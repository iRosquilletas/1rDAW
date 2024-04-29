import java.util.Scanner;
public class omg {
    public static void main(String[] args){
        int numero, inv = 0, resto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        numero = sc.nextInt();

        while(numero > 0){
            resto = numero % 10;
            inv = inv * 10 + resto;
            numero /= 10;
        }
        System.out.printf("Número: %d%n ", inv);
        sc.close();
    }
    
}
