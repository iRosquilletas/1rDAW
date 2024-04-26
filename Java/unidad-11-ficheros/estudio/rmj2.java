import java.io.File;

public class rmj {
    public static void main(String[] agrs) {

        try {
            File file = new File(agrs[0]);
            if (file.exists()) {
                System.out.println("Es un directorio");
            } else {
                file.delete();
            }
        } catch (Exception e) {
            System.out.println("No sé de que me hablas");
        }

    }
}
