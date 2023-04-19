package tp2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp_e7 {
	public static void main(String[] args) {
		char caracter_user;
		final char caracter = '*';
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter: ");
			caracter_user = entrada.readLine().charAt(0);
			while(caracter_user != '*') {
				switch(caracter_user) {
				case 'a': case 'e': case 'i': case 'o': case 'u': 
				System.out.println("Es un caracter vocal: "+caracter_user+" \n");break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				System.out.println("Es un caracter digito: "+caracter_user+" \n");break;
				}
				System.out.println("Ingrese un caracter: ");
				caracter_user = entrada.readLine().charAt(0);
			}
			System.out.println("Usted a salido de la funcion");
		} 
		catch (Exception exc) {
			System.out.println( exc );
		}
	}
}
