import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class verificar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File f = new File("file51.txt");
            FileReader fr = new FileReader(f);
            madremia br = new BufferedReader(fr);
            String linea = br.readLine();
            System.out.println();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
