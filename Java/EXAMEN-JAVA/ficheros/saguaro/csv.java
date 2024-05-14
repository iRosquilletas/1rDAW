import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class csv {

    public static void main(String[] args) {
        try {
            File file = new File("random.txt");
            Scanner scanner = new Scanner(file);

            FileWriter writer = new FileWriter("datos_seleccionados.txt");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t"); // Separar los datos por tabulaciones

                // Seleccionar las columnas 'NOMBRE' y 'NOTA'
                String nombre = parts[1];
                String nota = parts[3];

                System.out.println("Nombre: " + nombre + ", Nota: " + nota);

                // Escribir los datos seleccionados en un nuevo archivo
                writer.write(nombre + "\t" + nota + "\n");
            }

            writer.close();
            scanner.close();

            System.out.println("Datos seleccionados escritos en 'datos_seleccionados.txt'.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}