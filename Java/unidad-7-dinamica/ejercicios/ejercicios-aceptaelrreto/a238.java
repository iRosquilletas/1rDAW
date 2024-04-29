package aceptaelreto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a238 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero, sicarios;

        while (true) {
            dinero = sc.nextInt();
            sicarios = sc.nextInt();

            if (dinero == 0 && sicarios == 0) {
                break;
            }

            ArrayList<Integer> billetes = new ArrayList<>();
            for (int i = 0; i < dinero; i++) {
                billetes.add(sc.nextInt());
            }

            Collections.sort(billetes, Collections.reverseOrder());
            ArrayList<Integer> reparto = new ArrayList<>();
            int cuenta = 0;

            for (int i = 0; i < sicarios; i++) {
                reparto.add(0);
            }

            for (int i = 0; i < dinero; i++) {
                reparto.set(cuenta, reparto.get(cuenta) + billetes.get(i));
                cuenta = (cuenta + 1) % sicarios;
            }

            for (int i = 0; i < sicarios; i++) {
                System.out.print(reparto.get(i) + ":");
                for (int j = 0; j < dinero; j++) {
                    if (reparto.get(i) >= billetes.get(j)) {
                        System.out.print(" " + billetes.get(j));
                        reparto.set(i, reparto.get(i) - billetes.get(j));
                    }
                }
                System.out.println();
            }
            System.out.println("---");
        }

        sc.close();
    }
}
