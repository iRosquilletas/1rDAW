import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class madremia {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int cont2 = 0;
        try {
            System.out.println("Introduce el usuario: ");
            String user = sc.nextLine();

            System.out.println("Introduce la contraseña: ");
            String password = sc.nextLine();

            String a = (user + ":" + password);
            File f = new File("file51.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                String str = linea;
                String[] parts = str.split(":", 2);
                String b1 = parts[0];
                if (user.equals(b1)) {
                    cont2 += 1;
                }

                if (a.equals(linea)) {
                    cont += 1;

                }
                linea = br.readLine();

            }
            if (cont2 > 0) {
                System.out.println("El usuario existe, pero no la contraseña");

                if (cont > 0) {
                    System.out.println("Existe y la contraseña tambien");
                } else {

                }
            } else {
                System.out.println("El usuario no existe");
                System.out.println("Chao");

            }

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }

}
