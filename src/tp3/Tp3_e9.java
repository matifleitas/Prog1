package tp3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Tp3_e9 {
	public static void main(String[] args) {
		char caract_user = ' ';
		int num_user = obtenerNum();
		corroborarChar(num_user, caract_user);
	}
	public static int obtenerNum() {
		int num = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			while((num <= 1)&&(num <= 10)) {
				System.out.println("Ingresar numero entero: ");
				num = Integer.valueOf(entrada.readLine());
			}
		} catch (Exception exc) {
			System.out.println( exc );
		}
		return num;
	}
	
	public static void corroborarChar(int num_user, char caract_user) {
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			try {
				System.out.println("Ingrese un caracter: ");
				caract_user = entrada.readLine().charAt(0);
				if((caract_user>='a')&&(caract_user<='z')) {
					System.out.println("letra minuscula");
				}
				else if((caract_user>='A')&&(caract_user<='Z')) {
					System.out.println("letra mayuscula");
				}
				else if((caract_user>='0')&&(caract_user<='9')) {
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
