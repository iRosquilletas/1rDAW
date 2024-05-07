import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SaguaroDatos {

     public static void main(String[] args) {
        
        String linea;
        String[] l;

        try {

            //Apertura Fichero TXT
            File f = new File("SAC_DeepSky_Ver81_QCQ.TXT");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            //Apertura Fichero Binario (nuevo)
            File fb = new File("SAC.bin");
            FileOutputStream fs = new FileOutputStream(fb);
            ObjectOutputStream oos = new ObjectOutputStream(fs);

            linea = br.readLine(); 

            while(linea != null) {

                l = linea.replace("\"","").split(",");

                System.out.println(l[2]);
                if(l[2].equals("GALXY")) {
                    SaguaroClass obj = new SaguaroClass(l[0].replace(" ", ""),l[3],l[4],l[5],l[6]);
                    oos.writeObject(obj);
                }
                linea = br.readLine(); 


        }
            br.close();
            fr.close();
            oos.close();
            fs.close();

        } catch(IOException e) {
            e.printStackTrace();
        }



     }
}