package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp_e17 {
	public static void main(String[] args) {
		int num_user = 0;
		int num_decrementar = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingresar un numero entero: ");
			num_user = Integer.valueOf(entrada.readLine());
			
			if((num_user >= 1)&&(num_user <= 10)) {
				num_decrementar = num_user;
				for(int i=0; i<num_decrementar; i++) {
					num_user--;
					System.out.println("Cuenta regresiva: "+num_user);
				}
				System.out.println("Resultado final es: "+num_user);
			} else {
				System.out.println("Ingreso un numero fuera de rango");
			}
		} catch(Exception exc) {
			System.out.println( exc );
		}
	}
}
