package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3_e17 {
	public static void main(String[] args) {
		final char MIN_MINUS='a';
		final char MAX_MINUS='z';
		final int MIN=1;
		final int MAX=5;
		int loop=0;
		
		while(loop == 0) { //bucle para pedir devuelta caracter y numero
			char char_user=obtCaracter();
			//int num=ingresarNum();
	
			if((char_user>=MIN_MINUS)&&(char_user<=MAX_MINUS)) {
				int num=ingresarNum();
				if(num>=MIN&&num<=MAX) {
					imprimir_tabla(num);
				}
			} else {
				System.out.println("Caracter ingresado es: "+char_user);
			}
		}
	}
	
	public static char obtCaracter() {
		char caract=' ';
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
				System.out.println("Ingresar un caracter: ");
				caract=entrada.readLine().charAt(0);
				System.out.println("Caracter ingresado: "+caract);
			}
			catch(Exception exc) {
			System.out.println( exc );
		}
		return caract;
	}
	
	public static int ingresarNum() {
		int num=0;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingresar un numero entero: ");
			num=Integer.valueOf(entrada.readLine());	

		}	catch(Exception exc) {
				System.out.println( exc );
		}
		return num;
	}
	public static void imprimir_tabla(int num) {
		int MAX=10;
		int resultado;
		for(int i=1; i<=MAX; i++) {
			resultado = (i*num);
			System.out.println(num+" * "+i+" = "+resultado);
		}
	}
}


