public class Ejercicio4 {
    public static void main(String[] args) {
        int borde = 8;
        int up = 6;
        int[][] matriz = new int[borde][up];

        for (int i = 0; i < borde; i++) {
            for (int j = 0; j < up; j++) {
                if (i == 0 || i == borde - 1 || j == 0 || j == up - 1) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < borde; i++) {
            for (int j = 0; j < up; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}