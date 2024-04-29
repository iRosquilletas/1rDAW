package estudio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class guardartexto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el texto que deseas guardar en el fichero (Escribe 'fin' para terminar):");
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("texto_guardado.txt"))) {
                String line;
                while (!(line = scanner.nextLine()).equalsIgnoreCase("fin")) {
                    writer.write(line);
                    writer.newLine();
                }
                
                System.out.println("Texto guardado correctamente en el fichero 'texto_guardado.txt'.");
            } catch (IOException e) {
                System.out.println("Error al escribir en el fichero.");
                e.printStackTrace();
            }
        }
    }
}
