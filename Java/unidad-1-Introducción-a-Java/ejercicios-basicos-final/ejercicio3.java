import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de raíces de una ecuación de segundo grado");
        System.out.print("Ingrese el valor de 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de 'c': ");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        System.out.println("Raíz 1: " + raiz1);
        System.out.println("Raíz 2: " + raiz2);

        scanner.close();
    }
}
