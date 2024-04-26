package arrays;

import java.util.Random;

public class funArray {

    public static int[] generaArrayInt(int n, int minimo, int maximo) {

        int[] array = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(maximo - minimo + 1) + minimo;
        }

        return array;
    }

    public static int minimoArrayInt(int[] array) {
        /*
         * Encuentra el valor mínimo en el array.
         *
         * Parameters:
         * - array: Array de números enteros.
         *
         * Returns:
         * - Valor mínimo en el array.
         */

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío o ser nulo.");
        }

        int minimo = array[0];
        for (int num : array) {
            if (num < minimo) {
                minimo = num;
            }
        }

        return minimo;
    }

    public static int maximoArrayInt(int[] array) {

        if (array == null || array.length == 0) {
            System.out.println("Error: El array no puede estar vacío o ser nulo.");
            throw new IllegalArgumentException("El array no puede estar vacío o ser nulo.");
        }

        int maximo = array[0];
        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
        }

        return maximo;
    }

    public static boolean mediaArrayInt(int[] array, int numero) {
        /*
         * Verifica si un número está dentro del array.
         *
         * Parameters:
         * - array: Array de números enteros.
         * - numero: Número a buscar.
         *
         * Returns:
         * - true si el número está en el array, false de lo contrario.
         */

        if (array == null) {
            System.out.println("Error: El array no puede ser nulo.");
            throw new IllegalArgumentException("El array no puede ser nulo.");
        }

        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }

        return false;
    }

    public static boolean estaEnArrayInt(int[] array, int numero) {
        /*
         * Verifica si un número está dentro del array.
         *
         * Parameters:
         * - array: Array de números enteros.
         * - numero: Número a buscar.
         *
         * Returns:
         * - true si el número está en el array, false de lo contrario.
         */

        if (array == null) {
            System.out.println("Error: El array no puede ser nulo.");
            return false;
        }

        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }

        return false;
    }

    public static int posicionEnArray(int[] array, int numero) {
        /*
         * Busca un número en el array y devuelve la posición (el índice) en la que se
         * encuentra.
         *
         * Parameters:
         * - array: Array de números enteros.
         * - numero: Número a buscar.
         *
         * Returns:
         * - La posición (el índice) del número en el array. Si no se encuentra,
         * devuelve -1.
         */

        if (array == null) {
            System.out.println("Error: El array no puede ser nulo.");
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i; // Se encontró el número, devuelve la posición (índice)
            }
        }

        return -1; // El número no se encontró en el array
    }

    public static int[] volteaArrayInt(int[] array) {
        /*
         * Invierte (da la vuelta) a un array.
         *
         * Parameters:
         * - array: Array de números enteros.
         *
         * Returns:
         * - Array invertido.
         */

        if (array == null) {
            System.out.println("Error: El array no puede ser nulo.");
            return null;
        }

        int longitud = array.length;
        int[] arrayInvertido = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            arrayInvertido[i] = array[longitud - 1 - i];
        }

        return arrayInvertido;
    }

}
