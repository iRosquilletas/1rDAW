import java.util.Scanner;
import java.util.Arrays;

public class Ej100 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char [] temp = new char[4];
		String texto;
		int casos;
		int num1;
		int num2;
		int numR;
		int cont;
		
		casos = sc.nextInt();
		sc.nextLine();

		//Bucle de casos
		for (int i = 1; i <= casos ; i++) {
			
			texto = sc.nextLine();
			cont = 0;
			
			while (!texto.equals("6174")){
				
				//Bucle de letras
				for (int j = 0; j < texto.length(); j++) {
					temp[j]  = texto.charAt(j);			
				}
				Arrays.sort(temp); //Ordenar digitos del array de menor a mayor
				
				num1 = Integer.parseInt(""+temp[0]+temp[1]+temp[2]+temp[3]); //Parsea a entero tras encadenar caracteres (Con "" fuerzo a que '+' sea concatenar cadenas y no sumar)
				num2 = Integer.parseInt(""+temp[3]+temp[2]+temp[1]+temp[0]);

//				System.out.println(texto+"-"+num2+"-"+num1);
				
				numR= num2-num1;
				texto=String.valueOf(numR);
				cont++;
				
			}
			
			//Pinta Iteraciones
			System.out.println(cont);
			
		}
	}
}