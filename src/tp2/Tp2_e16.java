package tp2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e16 {
	public static void main(String[] args) {
		int num_caract_MAX = 15;
		int seguidilla_caract = 0;
		int max_seguidilla = 0;
		char caract_user;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
			for(int i=0; i<num_caract_MAX; i++) {
				System.out.println("Ingrese un caracter: ");
				caract_user = entrada.readLine().charAt(0);
				if(caract_user == 'a') {
					seguidilla_caract ++;
					if(seguidilla_caract > max_seguidilla) {
						max_seguidilla = seguidilla_caract;
					} 
				} 
				else {
					seguidilla_caract = 0;
				}
			}	
			System.out.println("Maxima cantidad de 'a' seguidas fueron: "+max_seguidilla);
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
		
	}
}
