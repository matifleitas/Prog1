package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e18 {
	public static void main(String[] agrs) {
		int num_distinto0 = 0;
		int num_user1 = 0;
		int num_user2 = 0;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Porfavor ingrese un numero entero(0 para salir): ");
			num_distinto0 = Integer.valueOf(entrada.readLine());
			while(num_distinto0 != 0) {
				System.out.println("Ingresar un numero entero: ");
				num_user1 = Integer.valueOf(entrada.readLine());
				System.out.println("Ingresar otro numero entero: ");
				num_user2 = Integer.valueOf(entrada.readLine());
				if((num_user1 != 0)&&(num_user2 != 0)) {
					int division = num_user1/num_user2;
					System.out.println("("+num_user1+" / "+num_user2+")"+" = "+division);
				} else {
					System.out.println("Todo numero dividido 0 da como resultado = 0"+"\n");
				}
			} 
			System.out.println("Salio de la funcion");
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}

}
