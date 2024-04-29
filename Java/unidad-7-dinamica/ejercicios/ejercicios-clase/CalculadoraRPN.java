import java.util.Scanner;
import java.util.Stack;

public class CalculadoraRPN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> pila = new Stack<>();
        String numero2;
        double numero, a, b, resultado;
        System.out.println("Calculadora RPN (Escribe 'q' para salir)");

        while (true) {

            System.out.print("Pila: ");
            for (double elemento : pila) {
                System.out.print(elemento + " ");
            }
            System.out.println();

            System.out.print("Introduce un número o apreta 'q' para salir ");
            numero2 = sc.nextLine();

            if (numero2.equals("q")) {
                System.out.println("¡Que tenga un buen día!");
                break;
            }
            try{
                numero = Double.parseDouble(numero2);
                pila.push(numero);
            } catch (NumberFormatException e){
                if (pila.size() >= 2 && ("+".equals(numero2) || "-".equals(numero2) || "*".equals(numero2) || "/".equals(numero2))) {
                    if (!pila.isEmpty()) {
                        b = pila.pop();
                        if (!pila.isEmpty()) {
                            a = pila.pop();
                            resultado = 0;
                            switch (numero2) {
                                case "+":
                                    resultado = a + b;
                                    break;
                                case "-":
                                    resultado = a - b;
                                    break;
                                case "*":
                                    resultado = a * b;
                                    break;
                                case "/":
                                    resultado = a / b;
                                    break;
                                default:
                                    System.out.println("Error");
                                    continue;
                            }
                            pila.push(resultado);
                        } else {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Error");
                    }
                    } else {
                        System.out.println("Error, no es valido");
                    }
                    
                }
                   
            }
            System.out.println("¡Que tenga un buen día!");
            sc.close();
        }

        
    }
