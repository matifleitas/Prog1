package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp_e15 {
	public static vid main (String[]args) {
		int num_user;
		int num_promedio = 0;
		int num_menor = 100;
		int num_mayor = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero(numero 0 para cortar): ");
			num_user = Integer.valueOf(entrada.readLine());
			while(num_user != 0) {
				num_promedio++;
				if(num_menor > num_mayor) {
					num_mayor = num_user;
				}
			}
			//terminaaaar
			
			
		} catch(Exception exc) {
			System.out.println( exc );
		}
	} 

}
