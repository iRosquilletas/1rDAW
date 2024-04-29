import arrays.funArray;

public class minimoArrayInt {

    public static void main(String[] args) {
        int[] miArray = { 5, 8, 2, 1, 10, 7 };

        int minimo = funArray.minimoArrayInt(miArray);

        System.out.println("El mínimo del array es: " + minimo);
    }
}
