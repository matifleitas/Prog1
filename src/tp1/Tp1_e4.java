package tp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1_e4 {
	public static void main (String[] args) {
		int user_num1;
		int user_num2;
		int user_num3;
		int user_num4;
		int user_num5;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el numero 23: ");
			user_num1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el numero 4: ");
			user_num2 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el numero 2: ");
			user_num3 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el numero 100: ");
			user_num4 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el numero 3: ");
			user_num5 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Entero ingresado : " + user_num5);
			System.out.println("Entero ingresado : " + user_num4);
			System.out.println("Entero ingresado : " + user_num3);
			System.out.println("Entero ingresado : " + user_num2);
			System.out.println("Entero ingresado : " + user_num1);
		} catch (Exception exc){
			System.out.println( exc );
		}
	}
}

