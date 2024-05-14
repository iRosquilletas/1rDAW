import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
// Ejercicio 2, parte 2
public class VerificarUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.print("Introduce el nombre del fichero con su extensión: ");
        String fichero = sc.nextLine();

        try {
            File f = new File(fichero);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            System.out.print("Introduce el usuario: ");
            String user = sc.nextLine();
            System.out.print("Introduce la contraseña: ");
            String password = sc.nextLine();
            String a = user + ":" + password;

            while (linea != null) {
                if (a.equals(linea)) {
                    cont += 1;
                }
                linea = br.readLine();
            }
            if (cont > 0) {
                System.out.println("El usuario existe");
            } else {
                System.out.println("El usuario no existe");
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
