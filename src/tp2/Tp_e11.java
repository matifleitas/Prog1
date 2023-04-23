package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp_e11 {
	public static void main (String[] agrs) {
		char caract_user;
		char caract_vocal;
		int suma_vocal = 0;
		boolean esValido = false;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));

		try {
			System.out.println("Ingrese un caracter: ");
			caract_user = entrada.readLine().charAt(0);
			while(!esValido) {
			if((caract_user >= 'a')&&(caract_user <= 'z')) {
				switch(caract_user) {
				case 'a': case 'e': case 'i': case 'o': case 'u':
					System.out.println("Ingresaste una vocal, guardada! "+caract_user);
					suma_vocal++;
					esValido = true;
				break;
				} 
			} 
		}
			//terminaaaar
		
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
	}
}
