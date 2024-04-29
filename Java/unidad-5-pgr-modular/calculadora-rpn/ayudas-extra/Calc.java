import java.util.Scanner;
import java.util.Arrays;

public class Calc {
	
	public static void limpia() {
		System.out.print("\033[H\033[2J");  
	}
	
	public static void sube(double[] stack) {
		for (int i = stack.length-1; i > 0; i--) {
			stack[i] = stack[i-1];
		}
	}

	public static void baja(double[] stack) {
		for (int i = 1; i < stack.length-1; i++) {
			stack[i] = stack[i+1];
		}
		stack[stack.length-1] = 0.0;
	}
	
	public static void main (String[] args) {
	
		boolean sigue = true;
		int n_stack = 4;
		double[] stack;
		String dato;
		Scanner sc = new Scanner (System.in);

		do {
			System.out.print("Filas: ");
			n_stack = sc.nextInt();
			sc.nextLine();
		} while (n_stack > 20 || n_stack < 4);
		
		stack = new double[n_stack];
		Arrays.fill(stack, 0.0);

		while (sigue) {
		
			limpia();
			for (int i = stack.length-1; i >= 0; i--) {
				System.out.printf("%02d:%20f\n", i+1, stack[i] );
			}

			System.out.print(": ");
			
			dato = sc.nextLine();
		
			if (dato.equals("+")){
				stack[0] = stack[1] + stack[0];
				baja(stack);
				
			} else if (dato.equals("-")) {
				stack[0] = stack[1] - stack[0];
				baja(stack);
				
			} else if (dato.equals("*") ){
				stack[0] = stack[1] * stack[0];
				baja(stack);
				
			} else if (dato.equals("/")) {
				stack[0] = stack[1]  / stack[0];
				baja(stack);
				
			} else if (dato.equals("q")) {
				limpia();
				sigue = false;
			} else {
				sube(stack);
				stack[0] = Double.valueOf(dato);
			}
		
		}
				
	}
	
}