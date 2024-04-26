import java.util.Scanner;

public class ejercicio1l2 {
    private Scanner sc;
    public static final String[] COMPOSITORES = { "Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler",
            "Bartok" };

    public ejercicio1l2() {
        sc = new Scanner(System.in);
    }

    public int LeeInt() {
        int num = 0;
        boolean inputAccepted = false;
        do {
            try {
                System.out.print("Número entero: ");
                num = sc.nextInt();
                inputAccepted = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
        } while (!inputAccepted);
        return num;
    }

    public int LeeIntPos() {
        int num;
        do {
            num = LeeInt();
            if (num <= 0) {
                System.out.println("Error");
            }
        } while (num <= 0);
        return num;
    }

    public int LeeIntRango(int min, int max) {
        int num;
        do {
            num = LeeInt();
            if (num < min || num > max) {
                System.out.println("Error");
            }
        } while (num < min || num > max);
        return num;
    }

    public double LeeDou() {
        double num = 0;
        boolean inputAccepted = false;
        do {
            try {
                System.out.print("número real: ");
                num = sc.nextDouble();
                inputAccepted = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
        } while (!inputAccepted);
        return num;
    }

    public double LeeDouRango(double min, double max) {
        double num;
        do {
            num = LeeDou();
            if (num < min || num > max) {
                System.out.println("Error");
            }
        } while (num < min || num > max);
        return num;
    }

    public int ValidaString() throws ElementoNoExistente {
        System.out.print("Número de compositor: ");
        String nombreCompositor = sc.nextLine();

        for (int i = 0; i < COMPOSITORES.length; i++) {
            if (COMPOSITORES[i].equalsIgnoreCase(nombreCompositor)) {
                return i;
            }
        }

        throw new ElementoNoExistente("No existe ese compositor");
    }

    public static void main(String[] args) {
        ejercicio1l2 inputHandler = new ejercicio1l2();

        int entero = inputHandler.LeeInt();
        System.out.println("Número entero: " + entero);

        int enteroPositivo = inputHandler.LeeIntPos();
        System.out.println("Número entero positivo: " + enteroPositivo);

        int enteroEnRango = inputHandler.LeeIntRango(1, 100);
        System.out.println("Número entero en rango: " + enteroEnRango);

        double real = inputHandler.LeeDou();
        System.out.println("Número real: " + real);

        double realEnRango = inputHandler.LeeDouRango(0.0, 10.0);
        System.out.println("Número real en rango: " + realEnRango);

        try {
            int indice = inputHandler.ValidaString();
            System.out.println("El compositor se encuentra en la posición " + indice);
        } catch (ElementoNoExistente e) {
            System.out.println(e.getMessage());
        }
    }
}

class ElementoNoExistente extends Exception {
    public ElementoNoExistente(String message) {
        super(message);
    }
}
