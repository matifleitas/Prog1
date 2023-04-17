package tp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1_e10 {
	public static void main (String[] args) {
		int num_user1;
		int num_user2;
		boolean mayor;
		boolean multiplos;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Porfavor ingrese un numero entero: ");
			num_user1 = Integer.valueOf(entrada.readLine());
			System.out.println("Porfavor ingrese el segundo numero entero: ");
			num_user2 = Integer.valueOf(entrada.readLine());
			mayor = (num_user1 > num_user2);
			System.out.println("El primer numero es mayor al segundo numero: "+mayor);
			multiplos = ((num_user1 % 2 == 0) && (num_user2 % 2 == 0));
			System.out.println("Ambos son multiplos de dos: "+multiplos);
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
		
	}
}
