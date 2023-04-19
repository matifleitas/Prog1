package tp2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e6 {
	public static void main(String[] args) {
		final int MAX = 100;
		final int MIN = 1;
		int num_user;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)); 
			System.out.println("Ingrese un numero entre "+MIN+" y "+MAX+": ");
			num_user = Integer.valueOf(entrada.readLine());
			while((num_user>MIN)&&(num_user<MAX)) {
				if((num_user%2 == 0)&&(num_user%3 == 0)) {
					System.out.println("El numero ingresado es: "+num_user);
				}
				System.out.println("Ingrese un numero entre "+MIN+" y "+MAX+": ");
				num_user = Integer.valueOf(entrada.readLine());
			}
		} catch(Exception exc) {
			System.out.println( exc );
		}
		
		
	}

}
