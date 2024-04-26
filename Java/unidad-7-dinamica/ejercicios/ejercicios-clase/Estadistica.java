import java.util.ArrayList;
import java.util.Scanner;

public class Estadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        String numero2;
        double numero, media, desviacionTipica;
        double suma = 0;
        double suma2 = 0;
        
        System.out.println("Introduce números o apreta 'q' para salir");

        while (true) {
            numero2 = sc.nextLine();

            if (numero2.equals("q")) {
                break;
            }
                numero = Double.parseDouble(numero2);
                numeros.add(numero);

                suma += numero;
                media = suma / numeros.size();

                suma2 += Math.pow(numero - media, 2);
                
                desviacionTipica = Math.sqrt(suma2 / numeros.size());

                System.out.printf("La media es: %f%n", media);
                System.out.printf("La desviación típica es: %f%n", desviacionTipica);
          
            }
            System.out.println("¡Qué tengas un buen día!");
            sc.close();
        }
    }

