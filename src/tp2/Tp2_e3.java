package tp2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e3 {
	public static void main (String[] args) {
		int num_user = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un numero entero mayor a 50: ");
			num_user = Integer.valueOf(entrada.readLine());
			if(num_user>50) {
				if((num_user%2 == 0)||(num_user%3 == 0)) {
					System.out.println(num_user);
				} 
				else {
					System.out.println("No es multiplo ni de 2, ni de 3");
				}
			} 
			else {
				System.out.println("Es menor a 50");
			}

		} catch (Exception exc) {
			System.out.println( exc );
		}
	}

}
