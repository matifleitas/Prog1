package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3_e12 {
	public static void main (String[] args) {
		int num_user = obt_Num();
	}
	
	public static int obt_Num() {
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero entre 1 y 6: ");
			num=Integer.valueOf(entrada.readLine());
			
			if ((num>=1)&&(num<=6)){	
				lanzamiento_dado(num);
			} else {
				System.out.println("Ingreso un numero no valido");
			}
		} catch (Exception exc) {
				System.out.println( exc );
		}
		return num;
	}
	public static void lanzamiento_dado(int num_user) {
		int lanzamiento_MAX = 1000;
		int suma_mismo_numDado = 0;
		
		for(int i=0; i<lanzamiento_MAX; i++) {
			int dado = (int) (6*Math.random() + 1);
			System.out.println("Lanzamiento: "+i+"\n");
			System.out.println("La cara que salio fue: "+dado);
			if(dado == num_user) {
				suma_mismo_numDado ++;
			}
		}
		System.out.println("El numero salio: "+suma_mismo_numDado+", veces");
	}
}
