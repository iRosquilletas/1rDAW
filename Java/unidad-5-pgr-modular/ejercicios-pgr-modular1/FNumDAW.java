package libreria;

/*Clase principal */
public class FNumDAW {

    /* 1 - Potencia */
    public static int potencia(int numero, int exponente) {
        int operacion = 1;
        for (int i = 1; i <= exponente; i++) {
            operacion = numero * operacion;
        }
        return operacion;
    }

    /* 2 - Contador de dígitos */
    public static int cuentaDigitos(int numero) {
        String numeroStr;
        int cantidadDigitos;
        numeroStr = Integer.toString(numero);
        cantidadDigitos = numeroStr.length();
        return cantidadDigitos;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int invertir(int numero) {
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        return invertido;
    }

    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        return original == invertido;
    }

    public static int digitoN(int numero, int posicion) {
        // Convertir el número a una cadena para acceder fácilmente a cada dígito
        String numeroStr = Integer.toString(numero);

        // Verificar si la posición está dentro del rango
        if (posicion >= 0 && posicion < numeroStr.length()) {
            // Obtener el dígito en la posición especificada
            char digitoChar = numeroStr.charAt(posicion);
            // Convertir el carácter a un entero
            return Character.getNumericValue(digitoChar);
        } else {
            // Si la posición está fuera del rango, devolver -1 (indicando un error)
            return -1;
        }
    }

    public static int posicionDeDigito(int numero, int digito) {
        if (digito < 0 || digito > 9) {
            System.out.println("El dígito debe ser un número entre 0 y 9.");
            return -1;
        }

        String numeroStr = Integer.toString(numero);

        for (int i = 0; i < numeroStr.length(); i++) {
            char digitoChar = numeroStr.charAt(i);
            int digitoEnPosicion = Character.getNumericValue(digitoChar);

            if (digitoEnPosicion == digito) {
                return i;
            }
        }

        System.out.println("El dígito no se encontró en el número.");
        return -1;
    }

    public static int parteNumero(int numero, int posicionInicial, int posicionFinal) {
        String numeroStr = Integer.toString(numero);

        if (posicionInicial < 0 || posicionFinal < posicionInicial || posicionFinal >= numeroStr.length()) {
            System.out.println("Posiciones no válidas.");
            return -1;
        }

        String trozoStr = numeroStr.substring(posicionInicial, posicionFinal + 1);

        return Integer.parseInt(trozoStr);
    }

    public static int pegaNumeros(int numero1, int numero2) {
        if (numero1 < 0 || numero2 < 0) {
            System.out.println("Los números deben ser no negativos.");
            return -1;
        }

        String resultadoStr = Integer.toString(numero1) + Integer.toString(numero2);

        // Verificar si la cadena es numérica antes de convertirla
        if (resultadoStr.matches("\\d+")) {
            return Integer.parseInt(resultadoStr);
        } else {
            System.out.println("Error al convertir el resultado a un número entero.");
            return -1;
        }
    }

    public static boolean kaprear(int numero) {
        if (numero < 1) {
            System.out.println("El número debe ser mayor o igual a 1.");
            return false;
        }

        // Elevar al cuadrado
        int cuadrado = numero * numero;

        // Convertir a cadena para facilitar la manipulación
        String cuadradoStr = Integer.toString(cuadrado);

        // Verificar todas las posibles divisiones del cuadrado
        for (int i = 1; i < cuadradoStr.length(); i++) {
            String parte1 = cuadradoStr.substring(0, i);
            String parte2 = cuadradoStr.substring(i);

            int numeroParte1 = Integer.parseInt(parte1);
            int numeroParte2 = Integer.parseInt(parte2);

            // Verificar si la suma de las partes es igual al número original
            if (numeroParte1 + numeroParte2 == numero) {
                return true;
            }
        }

        // Si no se encontró ninguna combinación válida
        return false;
    }

}
