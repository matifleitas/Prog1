package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Tp3_e11 {
	public static void main(String[] args) {
		//int num_mayor = 0;
		int num_mayor = obt_20_Num();
		imprimir_mayor(num_mayor);
	}
	public static int obt_20_Num() {
		int num_MAX = 20;
		int num_ultimoValor = 0;
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0; i<num_MAX; i++) {
				System.out.println("Ingrese un numero entero: ");
				num_ultimoValor = Integer.valueOf(entrada.readLine());
				
				if(num_ultimoValor>=num) {
					num = num_ultimoValor;
				}
			}
		}catch(Exception exc) {
			System.out.println( exc );
		}
			return num;
	}
	
	public static void imprimir_mayor(int num_mayor) {
		System.out.println(num_mayor);
	}
}

