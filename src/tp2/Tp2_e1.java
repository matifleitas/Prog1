package tp2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e1 {
	public static void main (String[] agrs) {
		int num_user = 0;
		char letra_user;
		/*int crec_decrec1 = 0;
		int crec_decrec2 = 0;
		int crec_decrec3 = 0;*/
		try {
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("a) Ingrese un numero entero: ");
		num_user = Integer.valueOf(entrada.readLine());
		if(num_user>=0) {
			System.out.println("El numero ingresado "+num_user+" es positivo \n");
		}
		else {
			System.out.println("El numero ingresado: "+num_user+" es negativo \n");
		}
		
		System.out.println("b) Ingrese otro numero: ");
		num_user = Integer.valueOf(entrada.readLine());
		if(num_user>100) {
			System.out.println("El numero ingresado: "+num_user+" es GRANDE \n");
		} 
		else {
			System.out.println("El numero ingresad: "+num_user+" es CHICO \n");
		}
		
		System.out.println("c) Ingrese otro numero entero entre el numero 1 al 7");
		num_user = Integer.valueOf(entrada.readLine());
		if(num_user==1) {
			System.out.println("Lunes \n");
		} 
		else if (num_user==2){
			System.out.println("Martes \n");
		} 
		else if (num_user==3){
			System.out.println("Martes \n");
		}
		else if (num_user==4){
			System.out.println("Miercoles \n");
		}
		else if (num_user==5){
			System.out.println("Viernes \n");
		}
		else if (num_user==6){
			System.out.println("Sabado \n");
		}
		else if (num_user==7){
			System.out.println("Domingo \n");
		} 
		else {
			System.out.println("No se ingreso un numero, entre el 1 y 7 \n");
		}
		
		System.out.println("d) Inrgese una letra: ");
		letra_user = entrada.readLine().charAt(0);
		switch (letra_user){
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u':
			System.out.println("ES UNA VOCAL");
		break;
		default:
			System.out.println("No es una vocal");
		}
		/*System.out.println("e) Ingrese un numero entero: ");
		crec_decrec1 = Integer.valueOf(entrada.readLine());
		System.out.println("Ingrese el segundo numero entero: ");
		crec_decrec2 = Integer.valueOf(entrada.readLine());
		System.out.println("Ingrese el tercer numero entero: ");
		crec_decrec3 = Integer.valueOf(entrada.readLine());
		if(crec_decrec1 < crec_decrec2 )*/
	} catch (Exception exc) {
		System.out.println( exc );
	}
  }

}
