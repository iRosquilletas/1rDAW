import java.util.Scanner;

public class pe1{
    public static void main(String[] agrs){
        Scanner  sc = new Scanner(System.in);
        String name, pregunta;
        int años;

        
        System.out.print("¿Cómo te llamas?: ");
        name = sc.next();

        System.out.printf("Hola %s!%n", name);

        System.out.print("Sabes programar?: ");
        pregunta = sc.next();
       

        if (pregunta.equals("Si")) {
            System.out.print("Cuantos años llevas programando?:" );
            años = sc.nextInt();
            if (años < 2){
                System.out.println("Novato!");
            } else if (años <6 && años >1) {
                System.out.println("Experto!");
            } else if (años > 5){
                System.out.println("Oh maestro, te adoramos!");
            } else {
                System.out.println("No valido");
            }

        } else if (pregunta.equals("No")){
            System.out.println("Vaya");

        } else for(int i = 1; i < 3; i ++){
            System.out.print("Sabes programar?: ");
            pregunta = sc.next();
            if (pregunta.equals("Si")) {
                System.out.print("Cuantos años llevas programando?:" );
                años = sc.nextInt();
                if (años < 2){
                    System.out.println("Novato!");
                    break;
                } else if (años <6 && años >1) {
                    System.out.println("Experto!");
                    break;
                } else if (años > 5){
                    System.out.println("Oh maestro, te adoramos!");
                    break;
                } else {
                    System.out.println("No valido");
                    break;
                }
            } 
        }
    
         System.out.println("Que vaya bien!");
         sc.close();
    }
}


