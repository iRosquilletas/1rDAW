package aceptaelreto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha, concepto, mes;
        int cantidad;
        while (sc.hasNext()) {
            int inicio = sc.nextInt();
            int money = sc.nextInt();

            if (inicio == 0 && money == 0) {
                break;
            }

            Map<String, Integer> ahorro = new HashMap<>();
            ahorro.put("01", inicio);

            for (int i = 0; i < money; i++) {
                fecha = sc.next();
                cantidad = sc.nextInt();
                concepto = sc.nextLine().trim();

                mes = fecha.substring(3, 5);

                if (!ahorro.containsKey(mes)) {
                    ahorro.put(mes, ahorro.get(fecha.substring(0, 2)));
                }

                if (cantidad > 0) {
                    ahorro.put(mes, ahorro.get(mes) + cantidad);
                } else {
                    ahorro.put(mes, ahorro.get(mes) + cantidad);
                }
            }

            String resultado = "";
            for (int i = 1; i <= 12; i++) {
                mes = String.format("%02d", i);
                resultado += ahorro.get(mes) + " ";
            }
            System.out.println(resultado.trim());
        }
        sc.close();
    }
}
