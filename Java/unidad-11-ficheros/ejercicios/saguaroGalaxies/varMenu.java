import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class varMenu extends menus {
    public static void NombreObjeto() {

        Scanner sc = new Scanner(System.in);
        String objeto = "";
        boolean existe = false;
        System.out.print("Introduce el nombre del objeto: ");
        objeto = sc.next();

        try {
            File arch = new File("SAC.bin");
            FileReader fr = new FileReader(arch);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea != null) {

                if (linea.contains(objeto)) {
                    System.out.println(linea);
                    existe = true;
                    break;
                }
                linea = br.readLine();
            }
            br.close();
            if (!existe) {
                System.out.println("No hay ningún objeto con ese ID");
            }
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo " + e.getMessage());
        }
        sc.close();
    }

    public static void constelación() {

        Scanner sc = new Scanner(System.in);
        String obj = "";
        boolean existe = false;
        System.out.print("Dime en nombre de la constelación: ");
        obj = sc.next();

        try {
            File arch = new File("SAC.bin");
            FileReader fr = new FileReader(arch);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea != null) {
                String[] columnas = linea.split("\\s+");
                String ColumObj = columnas[1].trim();
                if (ColumObj.equals(obj)) {
                    System.out.println(linea);
                    existe = true;
                }
                linea = br.readLine();
            }
            br.close();
            if (!existe) {
                System.out.println();
                System.out.println("No hay ninguna constelación con ese nombre");
            }
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo " + e.getMessage());
        }
        sc.close();
    }

    public static void MagnitudLimite() {

        Scanner sc = new Scanner(System.in);
        double numMenor = 0;
        double numeroMayor = 0;
        boolean seguir = true;

        System.out.print("Introduce el número menor: ");
        numMenor = sc.nextInt();

        System.out.print("Introduce el numero mayor: ");
        numeroMayor = sc.nextInt();

        if (numMenor > numeroMayor) {
            System.out.println();
            System.out.println("Orden incorrecto");
            seguir = false;
        }

        while (seguir) {

            try {
                File arch = new File("SAC.bin");
                FileReader fr = new FileReader(arch);
                BufferedReader br = new BufferedReader(fr);

                String linea = br.readLine();
                boolean existe = false;
                while (linea != null) {

                    String[] columnas = linea.split("\\s+");
                    String ColumMag = columnas[4].trim();

                    double ColumMagInt = Double.parseDouble(ColumMag);
                    if (ColumMagInt >= numMenor && ColumMagInt <= numeroMayor) {

                        System.out.println(linea);
                        existe = true;
                    }
                    linea = br.readLine();
                }
                br.close();
                seguir = false;
                if (!existe) {
                    System.out.println();
                    System.out.println("No hay ninguna magnitud entre esos: ");
                }
                seguir = false;
            } catch (IOException e) {
                System.out.println("Error en la lectura del archivo " + e.getMessage());
            }
        }
        sc.close();
    }
}
