import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculos calc = new Calculos();

        while (true) {
            try {
                System.out.println("Dime la referencia: ");
                String referencia = sc.nextLine();
                System.out.println("Pon los M3: ");
                double volumen = Double.parseDouble(sc.nextLine());

                Resultado resultado = calc.realizarCalculos(referencia, volumen);
                System.out.println("Precio total: " + resultado.getPrecioTotal());

                System.out.println("Unidades necesarias: " + resultado.getUnidades());
                System.out.println("Precio por M3: " + resultado.getPrecioM3());

            } catch (NumberFormatException e) {

                System.out.println("Error");

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());

            }

            sc.close();
        }

    }
}