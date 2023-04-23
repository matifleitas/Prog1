package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp_e14 {
	public static void main (String[] args) {
		final int num_MAX = 10;
		int suma = 0;
		int num_user = 0;
	
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			for	(int i=0; i<num_MAX; i++) {
				System.out.println("Ingresar un numero entero: ");
				num_user = Integer.valueOf(entrada.readLine());
				if(num_user%2 == 0) {
					suma ++;
				}
			}
			System.out.println("Se han acumulado "+suma+" numeros pares");
			
		}	catch(Exception exc) {
			System.out.println( exc );
		}
	}

}
