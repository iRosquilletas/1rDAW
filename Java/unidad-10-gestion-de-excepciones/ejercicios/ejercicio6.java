
class excepcion extends Exception {
    public excepcion(String mensaje) {
        super(mensaje);
    }

}

public class ejercicio6 {
    public static void main(String[] args) {
        int[] vector = new int[5];

        try {

            for (int i = 0; i < vector.length; i++) {
                if (i == 6) {
                    throw new excepcion("Eso no se puede hacer");
                }
                vector[i] = i;
            }
        } catch (excepcion e) {
            System.out.println("xx");
            System.out.println("Excepcion: " + e.getMessage());

        }
    }
}
