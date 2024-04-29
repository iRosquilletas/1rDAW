/* Muestra los números múltiplos de 5 entre el 0 y el 100 (incluidos) utilizando un bucle for. */
public class Ejercicio1 {
    public static void main(String[] args) {
        int problema;
        for (int i = 0; i <= 100; i++) {
            problema = 5 * i;
            System.out.printf("5 x %d: %d%n", i, problema);
        }
    }
}