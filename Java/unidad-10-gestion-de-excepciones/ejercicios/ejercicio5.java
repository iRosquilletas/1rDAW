import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Numerador: ");
            int numerador = sc.nextInt();
            
            System.out.print("Denominador: ");
            int denominador = sc.nextInt();
            
            int resultado = HacerDivision(numerador, denominador);
            System.out.println("El resultado es: " + resultado);
            
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:  " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    
    public static int HacerDivision(int numerador, int denominador) throws ArithmeticException {
        try {

            return numerador / denominador;

        } catch (ArithmeticException e) {

            
            throw e;
        }
    }
}
