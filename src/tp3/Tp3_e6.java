package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3_e6 {
	public static void main(String[] args) {
		char char_user;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter: ");
			char_user = entrada.readLine().charAt(0);
			
			if((char_user>='a')&&(char_user<='z')) {
				imprimir_tabla_9();
			}
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
	public static void imprimir_tabla_9() {
		final int num_MAX = 10;
		int num = 9;
		for(int multiplo=1; multiplo<=num_MAX; multiplo++) {
			int resultado = (num*multiplo);
			System.out.println(num+" * "+multiplo+" = "+resultado);
		}
	}

}