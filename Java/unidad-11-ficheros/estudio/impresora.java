import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class impresora {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        boolean q = true;
        System.out.print("Introduce el nombre del archivo con su extensión: ");
        String archivo = sc.nextLine();
        while (q) {
            System.out.print("Introduce la linea(q para salir): ");
            String pregunta = sc.nextLine();
            if (pregunta.equals("q")) {
                q = false;
            }

            try {
                FileWriter fw = new FileWriter(archivo, true);
                fw.write(pregunta + "\n");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        sc.close();
    }
}
