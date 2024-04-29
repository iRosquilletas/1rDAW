import java.util.Scanner;
import java.util.Stack;

public class calculadoraRpn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> pila = new Stack<>();

        System.out.print("Pon el número de lineas, puede ser entre 4 y 20: ");
        int numLineas = sc.nextInt();

        for (int i = 0; i < numLineas; i++) {
            System.out.print("Pon los números: ");
            String entrada = sc.next();

            if (esNumero(entrada)) {
                pila.push(Double.parseDouble(entrada));
            } else if (esOperador(entrada)) {
                if (pila.size() < 2) {
                    System.out.println("Error: No hay suficientes operandos para la operación.");
                    return;
                }

                double operand2 = pila.pop();
                double operand1 = pila.pop();

                switch (entrada) {
                    case "+":
                        pila.push(operand1 + operand2);
                        break;
                    case "-":
                        pila.push(operand1 - operand2);
                        break;
                    case "*":
                        pila.push(operand1 * operand2);
                        break;
                    case "/":
                        if (operand2 != 0) {
                            pila.push(operand1 / operand2);
                        } else {
                            System.out.println("No se puede entre cero");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Error, no valido");
                        return;
                }
            } else {
                System.out.println("No valido, ponlo otra vez");
                i--; // Decrementar el índice para repetir la entrada
            }
        }

        if (pila.size() == 1) {
            System.out.printf("Resultado final: %d", pila.pop());
        } else {
            System.out.println("Error");
        }

        sc.close();
    }

    private static boolean esNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private static boolean esOperador(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}