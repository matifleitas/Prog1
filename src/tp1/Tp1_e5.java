package tp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1_e5 {
	public static void main (String[] args) {
		String nombre_user;
		int edad_user;
		float altura_user;
		String ocupacion_user;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese su nombre: ");
			nombre_user = entrada.readLine();
			System.out.println("Ingrese su edad: ");
			edad_user = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese su altura: ");
			altura_user = Float.valueOf(entrada.readLine());
			System.out.println("Ingrese su ocupacion: ");
			ocupacion_user = entrada.readLine();
			
			System.out.println("Su nombre es: "+nombre_user+"\n"+"Su edad es: "+edad_user+"\n"+"Su altura es: "+
					altura_user+"\n"+"Su ocupacion es: "+"\n"+ocupacion_user);
			
			
		}
		catch (Exception exc) {
			System.out.println( exc );
		}
	}

}
