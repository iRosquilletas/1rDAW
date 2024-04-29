import libreria.libreria2;

public class primo {
    public static void main(String[] args) {
        // Ejemplo de uso
        for (int i = 1; i <= 1000; i++) {
            if (libreria2.esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}