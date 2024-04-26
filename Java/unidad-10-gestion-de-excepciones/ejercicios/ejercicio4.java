import java.util.Scanner;

public class ejercicio4
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Númerador: ");
            int numerador = sc.nextInt();

            System.out.print("Denominador: ");
            int denominador = sc.nextInt();

            int resultado = numerador / denominador;
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {

            System.out.println("error");

        } finally {

            sc.close();
        }
    }

}
