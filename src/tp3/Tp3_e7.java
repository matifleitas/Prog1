package tp3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Tp3_e7 {
	public static void main(String[] args) {
		int numValido;
		numValido = obtener_num_valido();
	}
	public static int obtener_num_valido() {
		int num_user = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try {
				while(num_user == 0) {
					System.out.println("Ingrese numero entero, distinto de 0: ");
					num_user = Integer.valueOf(entrada.readLine());
				}
				imprimir_suma();
			} catch(Exception exc) {
				System.out.println( exc );
			}
	  
		return num_user;
	}
	public static void imprimir_suma() {
		int resultado_suma = 0;
		int calculo_suma;
		int MAX = 200;
		for(int sumatoria=1; sumatoria<=MAX; sumatoria++) {
			System.out.println(sumatoria+"\n"+" + ");
			calculo_suma = (sumatoria+sumatoria);
			resultado_suma += calculo_suma;
		}
		System.out.println("El resultado obtenido por la sumatoria es: "+resultado_suma);
	}
}