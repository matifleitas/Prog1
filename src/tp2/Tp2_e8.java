package tp2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e8 {
	public static void main(String[] args) {
		int num_user = 9;
		final int num_priv = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while(num_user!=num_priv) {
			try {
				System.out.println("Ingrese un numero entero (0 para salir): ");
				num_user = Integer.valueOf(entrada.readLine());

				if(num_user==num_priv) {
					System.out.println("Saliste de la funcion");
				}
			} 	
			catch (Exception exc) {
			System.out.println(exc);
			}
		}
	}
}
