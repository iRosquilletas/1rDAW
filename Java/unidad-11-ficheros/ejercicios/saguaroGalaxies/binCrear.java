import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class binCrear {
    public static void main(String[] args) {
        String salto = "";
        try {

            File file = new File("galaxias.TXT");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            File fileBin = new File("SAC.bin");
            FileOutputStream fs = new FileOutputStream(fileBin);
            ObjectOutputStream oos = new ObjectOutputStream(fs);

            salto = br.readLine();

            while (salto != null) {
                String[] columna = salto.split(",");
                String OBJ = columna[0].replace("\"", "").replace(" ", "");
                String GLX = columna[2].replace("\"", "").replace(" ", "");
                String CONST = columna[3].replace("\"", "").replace(" ", "");
                String RECTA = columna[4].replace("\"", "").replace(" ", "");
                String DEC = columna[5].replace("\"", "").replace(" ", "");
                String MAG = columna[6].replace("\"", "").replace(" ", "");

                if (GLX.equals("GALXY")) {
                    galaxias glx = new galaxias(OBJ, CONST, RECTA, DEC, MAG);
                    oos.writeObject(glx.toString());
                }
                salto = br.readLine();
            }

            oos.close();
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
