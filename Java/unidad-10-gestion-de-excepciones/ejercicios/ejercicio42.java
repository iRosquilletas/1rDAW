import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Numerador: ");
            int numerador = sc.nextInt();

            System.out.print("denominador: ");
            int denominador = sc.nextInt();

            int resultado = numerador / denominador;
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {

            System.out.println("Error");
            System.out.println("karamba");

        } finally {
            sc.close();
        }
    }
}
