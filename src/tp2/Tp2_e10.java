package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e10 {
	public static void main(String[] args) {
		int num_user = 9;
		final int MIN = 1;
		final int MAX = 10;
		int suma = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			while((num_user>=MIN)&&(num_user<=MAX)) {
				System.out.println("Ingrese un numero entero entre 1 y 10 inclusive: ");
				num_user = Integer.valueOf(entrada.readLine());
				
				if((num_user>=MIN)&&(num_user<=MAX)) {
					suma += num_user;
				}
			}
			System.out.println("La suma total de los numero es: "+suma);
			
			
		} catch (Exception exc) {
		
	}
		
	}	
	
}
