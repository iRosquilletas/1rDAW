package estudio;

import java.io.File;

public class rmj {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Rmj <fichero>");
            return;
        }
        
        String fileName = args[0];
        File file = new File(fileName);
        
        if (!file.exists()) {
            System.out.println("El fichero no existe.");
        } else if (file.isDirectory()) {
            System.out.println("El fichero es un directorio.");
        } else {
            if (file.delete()) {
                System.out.println("El fichero ha sido borrado correctamente.");
            } else {
                System.out.println("No se pudo borrar el fichero.");
            }
        }
    }
}
