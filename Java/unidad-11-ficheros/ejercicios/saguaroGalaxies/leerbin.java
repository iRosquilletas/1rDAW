
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author nicor
 */
public class leerbin {
    public void Escribir(String nombre, String apellido, String genero, String correo, String carrera)
            throws IOException {
        int aux = 0;
        File archivo = new File("SAC.bin");
        if (!archivo.exists()) {
            try {

                aux = 1;
                DataOutputStream out = new DataOutputStream(
                        new BufferedOutputStream(new FileOutputStream(archivo, true)));
                out.writeUTF("-Estudiante-");

                out.writeUTF("Estudiante");
                out.writeInt(aux);
                out.writeChars("(");
                out.writeUTF(nombre);
                out.writeUTF(apellido);
                out.writeUTF(genero);
                out.writeUTF(correo);
                out.writeUTF(carrera);
                out.writeChars(")");
                out.writeUTF("\n");

                out.close();

            } catch (EOFException ex) {
                System.out.println("Error");
            } finally {
            } // cierre del fichero
        } else {
            try {
                aux++;
                DataOutputStream out = new DataOutputStream(
                        new BufferedOutputStream(new FileOutputStream(archivo, true)));

                out.writeUTF("T");
                out.writeInt(aux);
                out.writeChars("(");
                out.writeUTF(nombre);
                out.writeUTF(apellido);
                out.writeUTF(genero);
                out.writeUTF(correo);
                out.writeUTF(carrera);
                out.writeChars(")");
                out.writeUTF("\n");

                out.close();

            } catch (EOFException ex) {
                System.out.println("Error");

            }

        }

    }

    public void leer() throws FileNotFoundException, IOException {
        FileInputStream fileIn = new FileInputStream("./SAC.bin");
        DataInputStream inputStream = new DataInputStream(fileIn);
        StringBuffer buffer = new StringBuffer();
        while (inputStream.available() > 0) {
            buffer.append(inputStream.readUTF());
        }
        System.out.println(buffer);
    }

}