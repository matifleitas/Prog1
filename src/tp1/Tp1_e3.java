package tp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1_e3 {
	public static void main (String[] args) {
		final int num_user1;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un valor entero: ");
			num_user1 = Integer.valueOf(entrada.readLine());
			System.out.println("Entero ingresado: "+ num_user1);
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
}
