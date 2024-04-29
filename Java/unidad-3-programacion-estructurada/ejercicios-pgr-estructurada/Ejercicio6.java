/* Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la
semana. No se tendrán en cuenta los minutos ni los segundos. */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaUno, horaUno, diaDos, horaDos;
        int calcular;
        do {
            System.out.print("En qué día estás?(1/7): ");
            diaUno = sc.nextInt();
            System.out.print("En qué hora estás?(0/23): ");
            horaUno = sc.nextInt();

            if (diaUno < 1 || diaUno > 7 || horaUno < 0 || horaUno > 23) {
                System.out.println("Datos incorrectos");
            }
        } while (diaUno < 1 || diaUno > 7 || horaUno < 0 || horaUno > 23);

        do {
            System.out.print("En qué día estás?(1/7): ");
            diaDos = sc.nextInt();
            System.out.print("En qué hora estás?(0/23): ");
            horaDos = sc.nextInt();

            if (diaDos < diaUno || diaDos > 7 || horaDos < 0 || horaDos > 23) {
                System.out.println("Datos incorrectos");
            }
        } while (diaDos < diaUno || diaDos > 7 || horaDos < 0 || horaDos > 23);

        calcular = (diaDos - diaUno) * 24 + (horaDos - horaUno);

        System.out.println("Entre las " + horaUno + ":00h del " + diaUno + " y las " + horaDos + ":00h del " + diaDos
                + " hay " + calcular + " horas.");

        sc.close();
    }
}