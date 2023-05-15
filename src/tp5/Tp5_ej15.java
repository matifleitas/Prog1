package tp5;

import java.util.Random;

public class Tp5_ej15 {
	public static final int MAX = 20;
	public static final int MINVALOR = 1;
	public static final int MAXVALOR = 9;
	public static final double probabilidad_numero = 0.4;
	public static void main (String [] args) {
		int [] arrint = new int [MAX];
		int inicio = 0;
		int fin = -1;
		cargar_arreglo_aleatorio_secuencias_int(arrint);
		inicio = obt_inicio_secuencia(arrint, fin+1);
		fin = obt_fin_secuencia(arrint, inicio);
		imprimir_arreglo_secuencias_int(arrint);
		System.out.println("La pos de inicio de la primera secuencia es: "+inicio+" y la pos final de la primera secuencia es: "+fin);
	}
	public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAX-1] = 0;
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=0;
			}
		}
	}
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
	public static int obt_inicio_secuencia(int [] arrint, int inicio) {
		while(inicio<MAX && arrint[inicio] == 0) { //while para asegurar q entre una vez
			inicio ++;
		} return inicio;
	}
	public static int obt_fin_secuencia(int [] arrint, int inicio) {
		while(inicio<MAX && arrint[inicio] != 0) {
			inicio++;
		} return inicio-1;
	}
}
