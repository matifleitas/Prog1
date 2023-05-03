package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3_e17 {
	public static void main(String[] args) {
		obtCaracter();
		int num=ingresarNum();
		if(num>=1&&num<=5) {
			imprimir_tabla(num);
		}
	}
	public static char obtCaracter() {
		char caract=' ';
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingresar un caracter: ");
			caract=entrada.readLine().charAt(0);
			System.out.println("Caracter ingresado: "+caract);
		}catch(Exception exc) {
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

		}catch(Exception exc) {
			System.out.println( exc );
		}
		return num;
	}
	public static void imprimir_tabla(int num) {
		int resultado;
		//int multiplo = 1;
		for(int i=1; i<=10; i++) {
			resultado = (i*num);
			System.out.println(num+" * "+i+" = "+resultado);
		}
	}
}


