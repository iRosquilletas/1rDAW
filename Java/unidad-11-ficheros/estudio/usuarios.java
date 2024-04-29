import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class usuarios {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo con su extension: ");
        String archivo = sc.nextLine();
        boolean a = true;
        while (a) {

            System.out.print("Introduce el nombre(q para salir): ");
            String user = sc.nextLine();
            if (user.equals("q")) {
                a = false;
                break;
            }
            System.out.print("Introduce la contraseña: ");
            String password = sc.nextLine();

            try {
                FileWriter fw = new FileWriter(archivo, true);
                fw.write(user + ":" + password);
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        sc.close();

    }

}
