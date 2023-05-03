package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3_15 {
	public static void main(String[] args) {
		obt_sum_num();
	}
	
	public static int obt_sum_num() {
		int num = 1;
		int resultado = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(num != 0) {
				System.out.println("Ingresar un numero entero natural: ");
				num=Integer.valueOf(entrada.readLine());
				resultado=sumatoria_num(num);
				System.out.println("El resultado es: "+resultado);
			}
		}catch (Exception exc) {
			System.out.println( exc );
		}
		return resultado;
	}
	public static int sumatoria_num(int num) {
		int uno=1;
		int suma=(num+uno);
		
		return suma;
	}
}
