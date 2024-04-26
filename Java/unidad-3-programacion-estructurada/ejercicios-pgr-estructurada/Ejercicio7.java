
/* Escribir un programa en Java que implemente el juego “Piedra, papel o tijeras”. */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        int random = (int) (Math.random() * 3) + 1;

        // Usuario
        System.out.print("Elige entre 1-piedra, 2-papel o 3-tijeras: ");
        respuesta = sc.nextInt();

        while (respuesta > 3 || respuesta < 1) {
            System.out.println("Dato no valido");
            System.out.print("Elige entre 1-piedra, 2-papel o 3-tijeras: ");
            respuesta = sc.nextInt();
        }
        if (respuesta == 1) {
            System.out.println("Has elegido piedra");
        } else if (respuesta == 2) {
            System.out.println("Has elegido papel");
        } else if (respuesta == 3) {
            System.out.println("Has elegido tijeras");
        }

        // Máquina
        System.out.println("Es el turno de la máquina, escogiendo...");

        // Bug
        if (random < 1 || random > 3) {
            System.out.print("El servicio no funciona, vuelva en cuanto funcione.");
            System.exit(0);
        }

        if (random == 1) {
            System.out.println("Máquina eligio Piedra!");
        } else if (random == 2) {
            System.out.println("Máquina eligio Papel!");
        } else if (random == 3) {
            System.out.println("Máquina eligio Tijeras!");
        }

        // Empates
        if (respuesta == 1 && random == 1) {
            System.out.println("Empate! Los dos elegisteis piedra");
        } else if (respuesta == 2 && random == 2) {
            System.out.println("Empate! Los dos elegisteis papel");
        } else if (respuesta == 3 && random == 3) {
            System.out.println("Empate! Los dos elegisteis tijeras");
        }

        /*
         * 1 -> Piedra
         * 2 -> Papel
         * 3 -> Tijeras
         */

        // Ganador respuesta(usuario)
        else if (respuesta == 1 && random == 3) {
            System.out.println("Has elegido Piedra y la máquina eligió Pijeras, has ganado, felicidades!");
        } else if (respuesta == 2 && random == 1) {
            System.out.println("Has elegido Papel  y la máquina eligió Piedra, has ganado, felicidades!");
        } else if (respuesta == 3 && random == 2) {
            System.out.println("Has elegido Tijeras y la máquina eligió Papel, has ganado, felicidades!");
        }

        // Ganador máquina(random)
        else if (respuesta == 3 && random == 1) {
            System.out.println("La máquina eligio Piedra y tú Tijeras, has perdido.");
        } else if (respuesta == 1 && random == 2) {
            System.out.println("La máquina eligio Papel y tú piedra, has perdido.");
        } else if (respuesta == 2 && random == 3) {
            System.out.println("La máquina eligió tijeras y usted papel, has perdido.");
        }

        sc.close();
    }

}
