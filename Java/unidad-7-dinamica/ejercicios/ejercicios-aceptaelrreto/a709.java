package aceptaelreto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nVotos;
        String empate = "Empate";

        while (true) {
            nVotos = sc.nextInt();
            if (nVotos == 0) {
                break;

            }
            Map<String, Integer> contar = new HashMap<>();
            for (int i = 0; i < nVotos; i++) {
                String voto = sc.next();
                contar.put(voto, contar.getOrDefault(voto, 0) + 1);
            }

            int xVotos = 0;
            for (Map.Entry<String, Integer> entry : contar.entrySet()) {
                if (entry.getValue() > xVotos) {
                    xVotos = entry.getValue();
                    empate = entry.getKey();
                } else if (entry.getValue() == xVotos) {
                    empate = "EMPATE";
                }
            }

            System.out.println(empate);
        }
        sc.close();
    }
}
