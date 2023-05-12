package tp5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp5_e1 {
	public static int MAX = 15;
	public static void main (String[] args) {
		int [] arrenteros = new int [MAX];
		cargarArreglo(arrenteros);
		mostrarArreglo(arrenteros);
	}
	public static void cargarArreglo(int [] arrenteros) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (int pos=0; pos<MAX; pos++) {
				System.out.println("Ingrese el entero de la posicion " + pos + ": ");
				arrenteros[pos] = Integer.valueOf(entrada.readLine());
			}
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
	public static void mostrarArreglo(int [] arrenteros) {
		for (int pos=0; pos<MAX; pos++) {
			System.out.println("arrenteros["+pos+"]"+arrenteros[pos]);
		}
	}
}
