package tp5;

import java.util.Random;

public class Tp5_e16 {
	public static final int MAX = 20;
	public static final int MINVALOR = 1;
	public static final int MAXVALOR = 9;
	public static final double probabilidad_numero = 0.4;
	public static void main(String [] args) {
		int [] arrint = new int [MAX];
		cargar_arreglo_aleatorio_secuencias_int(arrint);
		int inicio = 0;
		int fin = -1;
		inicio = obt_inicio_secuencia(arrint, fin+1);
		fin = obt_fin_secuencia(arrint, inicio);
		
		imprimir_arreglo_secuencias_int(arrint);
		for(int)//preguntar como iterar todas las sec del arr y quedarte con la de maxValor
		obtener_suma_secuencia(arrint, inicio, fin);
		System.out.println(valor_secuencia_max);
	}
	public static void cargar_arreglo_aleatorio_secuencias_int(int [] arrint){
		Random r = new Random();
		arrint[0] = 0;
		arrint[MAX-1] = 0;
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arrint[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arrint[pos]=0;
			}
		}
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
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
	public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
		int suma = 0;
		while (inicio <= fin){
			suma+=arr[inicio];
			inicio++;
		}
		return suma;
		}
}
