import java.util.Scanner;
import lib.FNumDAW;

public class Ej210 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos;
		int total;
		String texto;
		
		
		casos = sc.nextInt();
		sc.nextLine();

		//Bucle de casos
		for (int i = 1; i <= casos ; i++) {
			
			texto = sc.nextLine();
			
			//Bucle de letras
			total = 0;
			for (int j = 0; j < texto.length(); j++) {
				total = total + (int)(texto.charAt(j)); //Sumo el valor ASCII de la letra
			}
			 //Pinta Primo de riesgo
			System.out.println(FNumDAW.anteriorPrimo(total));
			
		}
	}
}