import arrays.funArray;

public class generaArrayInt {

    public static void main(String[] args) {
        int[] miArray = funArray.generaArrayInt(10, 1, 100);

        System.out.print("Array generado: ");
        for (int num : miArray) {
            System.out.print(num + " ");
        }
    }
}