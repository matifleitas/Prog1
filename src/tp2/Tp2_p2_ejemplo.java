package tp2;
/*Hacer un programa que mientras que el usuario cargue un número entero entre 0 y 1000 (no incluidos),
guarde el menor de los números ingresados. Al finalizar el ciclo imprima el menor por pantalla*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_p2_ejemplo {
	public static void main(String[] args) {
		final int MIN = 0, MAX = 1000;
		int numero;
		int menor = MAX;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un número entre "+MIN+" y "+MAX+", con otro valor sale del ciclo");
			numero = Integer.valueOf(entrada.readLine());
			while ((MIN < numero)&&(numero < MAX)){ 
				if (numero<menor){ //si num_user es menor al ultimo numero ingrsado, entra
					menor=numero; /*si entra al if guardar el numero de usuario como menor y asi 
									registrarlo como el mas chico registrado*/
				}
				System.out.println("Ingrese un número entre "+MIN+" y "+MAX+", con otro valor sale del ciclo");
				numero = Integer.valueOf(entrada.readLine());
			}
			}
		catch (Exception exc){
			System.out.println(exc);
		}
		if (menor != MAX){
			System.out.println("El menor ingresado es: " + menor);
		}
	}
}
