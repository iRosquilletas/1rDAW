import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.TreeMap;

public class SaguaroMenu {
    public static void main(String[] args) {

        //Lo cargo todo en un TreeMap
        TreeMap<String, SaguaroClass> tm = new TreeMap<String, SaguaroClass>();
        
        try {

            File f = new File("SAC.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            SaguaroClass obj = (SaguaroClass)ois.readObject();
            
            while (obj != null) {
                //Cargo el objeto leido al TreeMap
                tm.put(obj.OBJECT, obj);
                obj = (SaguaroClass)ois.readObject();
            }

            ois.close();
            fis.close();

            } catch (EOFException e) {

            } catch (ClassNotFoundException e) {
                System.out.println("Excepción: "+e.getMessage());
            } catch (IOException e) {
                System.out.println("ExcepciónIO: "+e.getMessage());
            }


                
            //Pinto ejemplo
            SaguaroClass ej = tm.get("NGC1492");

            System.out.println(ej.OBJECT + "-" + ej.CON + "-" + ej.DEC + "-" + ej.RA + "-" + ej.MAG);



            //FALTA EL TRATAMIENTO DE DATOS. EL MENU

            //



    }
}
