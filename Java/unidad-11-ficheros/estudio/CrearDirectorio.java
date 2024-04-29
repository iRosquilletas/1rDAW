import java.io.File;
import java.io.IOException;

public class CrearDirectorio {
    public static void main(String[] args) {
        try {
            File directorio = new File("directorio");
            if (directorio.mkdir()) {
                System.out.println("Directorio creado: " + directorio.getName());
            } else {
                System.out.println("El Directorio ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error: No puedo crear el fichero");
        }
    }

}
