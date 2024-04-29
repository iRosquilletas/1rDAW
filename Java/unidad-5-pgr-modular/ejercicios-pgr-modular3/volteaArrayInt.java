import arrays.funArray;

public class volteaArrayInt {

    public static void main(String[] args) {
        // Ejemplo de uso: Invertir un array
        int[] miArray = { 5, 8, 2, 1, 10, 7 };

        int[] arrayInvertido = funArray.volteaArrayInt(miArray);

        if (arrayInvertido != null) {
            System.out.print("Array original: ");
            for (int num : miArray) {
                System.out.print(num + " ");
            }

            System.out.print("\nArray invertido: ");
            for (int num : arrayInvertido) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No se pudo invertir el array.");
        }
    }
}
