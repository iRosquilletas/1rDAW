
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class filew {
    public static void main(String[] args) {

        // PrintWRITER
        /*
         * try {
         * File file = new File("file.txt");
         * file.createNewFile();
         * PrintWriter pw = new PrintWriter("file1.txt");
         * pw.println("Buenas, primera linea");
         * pw.printf("Este es un número: %d", 42);
         * pw.close();
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         * }
         * }
         */

        // FileWriter
        try {
            FileWriter fw = new FileWriter("file51.txt", true);
            fw.write("Hola,908098094444444pjporiter\nOK");
            fw.close(); // Mete el contenido en el fichero
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}