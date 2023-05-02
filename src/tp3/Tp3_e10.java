package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3_e10 {
	public static void main(String[] args) {
		int num_user = 0;
		num_user = obtenerNumValido();
	}
	
	public static int obtenerNumValido() {
		int num = 0;
		int MAX = 10;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			while(!(num>=1)&&(num<=10)) {
				System.out.println("Ingrese un numero entre 1 y 10: ");
				num = Integer.valueOf(entrada.readLine());
				verif_multiplo_3(num);
				verif_multiplo_5(num, MAX);
			} 
		} catch (Exception exc) {
			System.out.println( exc );
		}
		return num;
	}
	public static void verif_multiplo_3(int num) {
		char char_user;
		
		if((num%3) == 0) {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("Ingrese un caracter: ");
				char_user = entrada.readLine().charAt(0);
				if((char_user>='a')&&(char_user<='z')) {
					System.out.println("letra minuscula");
				}
				else if((char_user>='A')&&(char_user<='Z')) {
					System.out.println("letra mayuscula");
				}
				else if((char_user>='0')&&(char_user<='9')) {
					System.out.println("digito");
				}
				else {
					System.out.println("otro");
				}
			} catch (Exception exc) {
				System.out.println( exc );
			}
		} 
	}
	public static void verif_multiplo_5(int num, int MAX) {
		if ((num%5)==0) {
			int resultado = 0;
			for(int i=1; i<=MAX; i++) {//en los for de tablas de mult debo asignar el i = 1 y <= MAX
				int multiplicacion = (num*i);
				System.out.println(num+" * "+i+" = "+multiplicacion);
			}
		}
	}
}
