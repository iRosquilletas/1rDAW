package estudio;

import java.io.File;

public class fileinfo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java FileInfo <fichero o directorio>");
            return;
        }
        
        String fileName = args[0];
        File file = new File(fileName);
        
        if (!file.exists()) {
            System.out.println("El fichero o directorio no existe.");
            return;
        }
        
        System.out.println("Ruta absoluta: " + file.getAbsolutePath());
        if (file.isFile()) {
            System.out.println("Es un fichero.");
            System.out.println("Tamaño: " + file.length() + " bytes");
        } else if (file.isDirectory()) {
            System.out.println("Es un directorio.");
            System.out.println("Tamaño: " + folderSize(file) + " bytes");
        }
        
        System.out.println("Permisos: " + (file.canRead() ? "Lectura " : "") + (file.canWrite() ? "Escritura " : "") + (file.canExecute() ? "Ejecución" : ""));
    }
    
    public static long folderSize(File directory) {
        long length = 0;
        File[] files = directory.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    length += file.length();
                } else {
                    length += folderSize(file);
                }
            }
        }
        
        return length;
    }
}
