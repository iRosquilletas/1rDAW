import arrays.funArray;

public class posicionEnArray {

    public static void main(String[] args) {
        // Ejemplo de uso: Buscar la posición de un número en un array
        int[] miArray = { 5, 8, 2, 1, 10, 7 };
        int numeroBuscado = 1;

        int posicion = funArray.posicionEnArray(miArray, numeroBuscado);

        if (posicion != -1) {
            System.out.println("El número " + numeroBuscado + " está en la posición " + posicion + " del array.");
        } else {
            System.out.println("El número " + numeroBuscado + " no está en el array.");
        }
    }
}
