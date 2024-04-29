import java.util.Scanner;
import lib.FNumDAW;

public class Ej115 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;

		//Bucle de casos
		do {
			num = sc.nextInt();

			if (num!=0)	
			System.out.println(FNumDAW.kaprekar(num)?"SI":"NO");
			
		} while (num!=0);
	}
}
