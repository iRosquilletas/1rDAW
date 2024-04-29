import arrays.funArray;

public class maximoArrayInt {

    public static void main(String[] args) {
        // Ejemplo de uso: Encontrar el máximo de un array
        int[] miArray = { 5, 8, 2, 1, 10, 7 };

        try {
            int maximo = funArray.maximoArrayInt(miArray);
            System.out.println("El máximo del array es: " + maximo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
