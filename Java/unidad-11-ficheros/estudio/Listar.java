import java.io.File;
import java.util.Scanner;

public class Listar {
    public static void main(String[] agrs) {
        String ruta;
        Scanner sc = new Scanner(System.in);
        System.out.println("indica la ruta del directorio a listar");
        ruta = sc.nextLine();

        if (ruta.length() > 0) {
            File f = new File(ruta); // Creamos o cargamos el directorio en File
            if (f.isDirectory()) { // Comprobamos que es un directorio y no un archivo
                File[] ficheros = f.listFiles();
                System.out.println("Listado de los ficheros");
                for (File file : ficheros) // listamos el directorio
                    System.out.println("\t" + file.getName());
            }
        }
        sc.close();
    }
}
