package tp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1_e7 {
	public static void main (String[] agrs) {
		int num1;
		int num2;
		int num3;
		int resultado;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero: ");
			num1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el segundo numero entero: ");
			num2 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el tercer numero entero");
			num3 = Integer.valueOf(entrada.readLine());
			resultado = ((num1/num2) - num3);
			
			System.out.println(resultado);
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
}
