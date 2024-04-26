import java.util.Scanner;
public class pe2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pregunta;

        System.out.print("Cuantos boletos quieres?: ");
        pregunta = sc.nextInt();

        int unonumero1 = (int)(Math.random()* 100) + 1;
        int unonumero2 = (int)(Math.random()* 100) + 1;
        int unonumero3 = (int)(Math.random()* 100) + 1;
        int unonumero4 = (int)(Math.random()* 100) + 1;
        int unonumero5 = (int)(Math.random()* 100) + 1;
        int unonumero6 = (int)(Math.random()* 100) + 1;
        int unonumero7 = (int)(Math.random()* 100) + 1;
        
        System.out.printf("%d %d %d %d %d", unonumero1, unonumero2, unonumero3, unonumero4, unonumero5);
        System.out.printf( " + %d %d%n", unonumero6, unonumero7);

        for (int i = 1; i < pregunta; i ++){
            System.out.printf("%d %d %d %d %d", unonumero1, unonumero2, unonumero3, unonumero4, unonumero5);
              System.out.printf( " + %d %d%n", unonumero6, unonumero7);
        }
        sc.close();
    }
}

