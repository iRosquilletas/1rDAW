/* Escribir un programa en Java que implemente el juego “Piedra, papel o tijeras, lagarto, Spock”. */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        int random = (int) (Math.random() * 5) + 1;

        System.out.print("Elige entre 1-piedra, 2-papel, 3-tijeras, 4-lagarto o 5-spock: ");
        respuesta = sc.nextInt();

        while (respuesta > 5 || respuesta < 1) {
            System.out.println("Dato no valido");
            System.out.print("Elige entre 1-piedra, 2-papel, 3-tijeras, 4-lagarto o 5-spock: ");
            respuesta = sc.nextInt();
        }
        if (respuesta == 1) {
            System.out.println("Has elegido piedra");
        } else if (respuesta == 2) {
            System.out.println("Has elegido papel");
        } else if (respuesta == 3) {
            System.out.println("Has elegido tijeras");
        } else if (respuesta == 4) {
            System.out.println("Has elegido lagarto");
        } else if (respuesta == 5) {
            System.out.println("Has elegido spock");
        }
        System.out.println("Es el turno de la máquina, escogiendo...");

        // Bug
        if (random < 1 || random > 5) {
            System.out.print("El servicio no funciona, vuelva en cuanto funcione.");
            System.exit(0);
        }

        if (random == 1) {
            System.out.println("Máquina eligio Piedra!");
        } else if (random == 2) {
            System.out.println("Máquina eligio Papel!");
        } else if (random == 3) {
            System.out.println("Máquina eligio Tijeras!");
        } else if (random == 4) {
            System.out.println("Máquina eligio lagartija!");
        } else if (random == 5) {
            System.out.println("Máquina eligio spock!");
        }

        // Empates
        if (respuesta == 1 && random == 1) {
            System.out.println("Empate! Los dos elegisteis piedra");
        } else if (respuesta == 2 && random == 2) {
            System.out.println("Empate! Los dos elegisteis papel");
        } else if (respuesta == 3 && random == 3) {
            System.out.println("Empate! Los dos elegisteis tijeras");
        } else if (respuesta == 4 && random == 4) {
            System.out.println("Empate! Los dos elegisteis tijeras");
        } else if (respuesta == 5 && random == 5) {
            System.out.println("Empate! Los dos elegisteis tijeras");
        }

        /*
         * 1 -> Piedra
         * 2 -> Papel
         * 3 -> Tijeras
         * 4 -> Lagartija Lagartija > Tijera y Spock
         * 5 -> Spock Spock > Tijera y piedra
         */

        // Ganador respuesta(usuario)
        else if (respuesta == 1 && random == 3) {
            System.out.println("Has elegido Piedra y la máquina eligió Tijeras, has ganado, felicidades!");
        } else if (respuesta == 1 && random == 4) {
            System.out.println("Has elegido Tijeras y la máquina eligió Lagartija, has ganado, felicidades!");
        } else if (respuesta == 2 && random == 1) {
            System.out.println("Has elegido Papel  y la máquina eligió Piedra, has ganado, felicidades!");
        } else if (respuesta == 2 && random == 5) {
            System.out.println("Has elegido papel y la máquina eligió Spock, has ganado, felicidades!");
        } else if (respuesta == 3 && random == 2) {
            System.out.println("Has elegido Tijeras y la máquina eligió Papel, has ganado, felicidades!");
        } else if (respuesta == 3 && random == 4) {
            System.out.println("Has elegido Tijeras y la máquina eligió Lagartija, has ganado, felicidades!");
        } else if (respuesta == 4 && random == 3) {
            System.out.println("Has elegido Lagartija y la máquina eligió Tijeras, has ganado, felicidades!");
        } else if (respuesta == 4 && random == 5) {
            System.out.println("Has elegido Lagartija y la máquina eligió Spock, has ganado, felicidades!");
        } else if (respuesta == 5 && random == 3) {
            System.out.println("Has elegido Spock y la máquina eligió Tijeras, has ganado, felicidades!");
        } else if (respuesta == 5 && random == 1) {
            System.out.println("Has elegido Spock y la máquina eligió Piedra, has ganado, felicidades!");
        }

        // Ganador máquina(random)
        else if (respuesta == 3 && random == 1) {
            System.out.println("La máquina eligio tijeras y tú has elegido piedra, has perdido. :(");
        } else if (respuesta == 4 && random == 1) {
            System.out.println("La máquina eligio lagartija y tú has elegido piedra, has perdido. :(");
        } else if (respuesta == 1 && random == 2) {
            System.out.println("La máquina eligio piedra y tú has elegido Papel, has perdido. :(");
        } else if (respuesta == 5 && random == 2) {
            System.out.println("La máquina eligio Spock y tú has elegido Papel, has perdido. :(");
        } else if (respuesta == 2 && random == 3) {
            System.out.println("La máquina eligio papel y tú has elegido Tijeras, has perdido. :(");
        } else if (respuesta == 4 && random == 3) {
            System.out.println("La máquina eligio lagartija y tú has elegido Tijeras, has perdido. :(");
        } else if (respuesta == 3 && random == 4) {
            System.out.println("La máquina eligio Tijeras y tú has elegido Lagartija, has perdido. :(");
        } else if (respuesta == 5 && random == 4) {
            System.out.println("La máquina eligio Spock y tú has elegido Lagartija, has perdido. :(");
        } else if (respuesta == 3 && random == 5) {
            System.out.println("La máquina eligio Tijeras y tú has elegido Spock, has perdido. :(");
        } else if (respuesta == 1 && random == 5) {
            System.out.println("La máquina eligio piedra y tú has elegido Spock, has perdido. :(");
        }

        sc.close();
    }

}
