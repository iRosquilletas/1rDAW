import java.util.Scanner;

public class posicionC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String numeroStr, inv;
        System.out.print("Ingresa número: ");
        a = sc.nextInt();

        numeroStr = Integer.toString(a);

        inv = new StringBuilder(numeroStr).reverse().toString();

        if (numeroStr.equals(inv)) {
            System.out.println("El número " + a + "es cap");
        } else {
            System.out.println("El número " + a + "no es cap: ");
        }

        sc.close();
    }
}
