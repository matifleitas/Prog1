package tp3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Tp3_e8 {
	public static void main(String[] args) {
		int num, num2;
		char caracter;
		num = obtenerNumero();
		num2 = obtenerNumero();
		caracter = obtenerCaracter();
		imprimirResultados(num, num2, caracter);
	}
	public static int obtenerNumero() {
		int num_user = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
			num_user = Integer.valueOf(entrada.readLine());			
		} catch (Exception exc) {
			System.out.println( exc );
		}
		return num_user;
	}
	public static char obtenerCaracter() {
		char char_user = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			try {
				System.out.println("Ingrese un caracter: ");
				char_user = entrada.readLine().charAt(0);			
			} catch (Exception exc) {
				System.out.println( exc );
			}
		return char_user;
	}
	public static void imprimirResultados(int num, int num2, char caracter) {
		if(caracter == 'a') {
			int suma = (num+num2);
			System.out.println("El resultado de la suma es: "+suma);
		}
		else if(caracter == 'b') {
			int resta = (num-num2);
			System.out.println("El resultado de la resta es: "+resta);
		}
		else if(caracter == 'c') {
			int multiplicacion = (num*num2);
			System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
		}
		else if(caracter == 'd') {
			int division = (num/num2);
			System.out.println("El resultado de la division es: "+division);
		}
		else {
			System.out.println("Ingreso un caracter no valido");
		}
	}
}