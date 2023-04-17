package tp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1_e12 {
	public static void main (String[] args) {
		int num_user1;
		int num_user2;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero: ");
			num_user1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el segundo numero entero: ");
			num_user2 = Integer.valueOf(entrada.readLine());
			System.out.println("Incrementacion al primer numero "+num_user1+1);
			System.out.println("Decrementacion del segundo numero "+(num_user2-1));
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}

}
