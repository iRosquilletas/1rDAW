import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pon tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Pon tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Su índice de masa coporporal es de: " + imc);

        scanner.close();
    }
}
