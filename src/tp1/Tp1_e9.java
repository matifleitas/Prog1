package tp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1_e9 {
	public static void main (String[] args) {
		int num;
		int numero1 = 2;
		int numero2 = 3;
		int numero3 = 4;
		int resultado1;
		int resultado2;
		int resultado3;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero: ");
			num = Integer.valueOf(entrada.readLine());
			
			resultado1 = (num/numero1);
			//resultado1 = (num%numero1);
			resultado2 = (num/numero2);
			//resultado2 = (num%numero2);
			resultado3 = (num/numero3);
			//resultado3 = (num%numero3);
			System.out.println("El cociente del primer resultado es : "+resultado1+"\n");
			System.out.println("El cociente del segundo resultado es : "+resultado2+"\n");
			System.out.println("El cociente del tercer resultado es : "+resultado3+"\n");

			
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
	

}
