import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);

        System.out.print("Pon numero para la matriz de 4x4: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean boleana = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    boleana = false;
                    break;
                }
            }
        }

        if (boleana) {
            System.out.println("La matriz es simetrica ");
        } else {
            System.out.println("La matriz no es simétrica");
        }
        sc.close();
    }
}