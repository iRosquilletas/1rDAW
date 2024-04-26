
import arrays.funArray;

public class estaEnArrayInt {

    public static void main(String[] args) {
        // Ejemplo de uso: Verificar si un número está en un array
        int[] miArray = { 5, 8, 2, 1, 10, 7 };
        int numeroBuscado = 1;

        boolean resultado = funArray.estaEnArrayInt(miArray, numeroBuscado);

        if (resultado) {
            System.out.println("El número " + numeroBuscado + " está en el array.");
        } else {
            System.out.println("El número " + numeroBuscado + " no está en el array.");
        }
    }
}
