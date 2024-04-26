import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántos huevos caben en la cazuela?: ");
        int capacidadCazuela = scanner.nextInt();

        System.out.print("Cuántos huevos quieres cocer?: ");
        int cantidadHuevos = scanner.nextInt();

        int minutos = 10;

        int calcular = (int) Math.ceil((double) cantidadHuevos / capacidadCazuela);

        int total = calcular * minutos;

        System.out.println("En total tardará: " + total + "minutos");

        scanner.close();
    }
}
