package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e13 {
	public static void main (String[] agrs) {
		char caract_user;
		int num_user = 1;
		final int MIN = 1;
		final int MAX = 5;
		final int MAX_TABLA = 10;
		
		while(num_user!=0) {
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter: ");
			caract_user = entrada.readLine().charAt(0);
			if(caract_user>='a'&&caract_user<='z') {
				System.out.println("Ingrese un numero entero entre 1 y 5: ");
				num_user = Integer.valueOf(entrada.readLine());
				if(num_user>=1&&num_user<=5) {
					for(int i=1; i<=MAX_TABLA; i++) { //la variable i, seria el multiplo
						int multiplicador = num_user*i;
						System.out.println(num_user+" * "+i+" = "+multiplicador);
					}
				} else {
					System.out.println("No es un numero entre 1 y 5");
					num_user=1;
				}
			}
			
			
		}	catch ( Exception exc ) {
			System.out.println( exc );
		}
	
		}
	}
}
