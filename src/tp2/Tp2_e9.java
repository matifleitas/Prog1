package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e9 {
	public static void main(String[] args) {
		char caract_user;
		/*char caract_digito;
		char caract_letra_minus;*/
		
		try {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese un caracter: ");
		caract_user = entrada.readLine().charAt(0);
		switch(caract_user) {
		case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
			System.out.println("El caracter "+caract_user+" es un digito");
		break;
		
		case 'a': case 'e': case 'i': case 'o': case 'u': 
			System.out.println("El caracter "+caract_user+" es vocal");
		break;
		default: 
			System.out.println("El caracter "+caract_user+" es consonente");
		}
		
		
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
}
