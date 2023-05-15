package tp5;

import java.util.Random;

public class Tp5_e17 {
	public static final int MAX = 20;
	public static final int MINVALOR = 1;
	public static final int MAXVALOR = 9;
	public static final double probabilidad_numero = 0.4;
	public static void main(String [] args) {
		int [] arrint = new int [MAX];
		cargar_arreglo_aleatorio_secuencias_int(arrint);
		imprimir_arreglo_secuencias_int(arrint);

		obt_anteUltima_secuencia(arrint);
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

	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
	public static void obt_anteUltima_secuencia(int [] arrint) {
		int inicio = MAX-1;
		int contador = 0;
		int pos_ini = 0;
		int pos_fin = 0;
		while(arrint[inicio] == 0) {
			inicio --;
			arrint[inicio] = pos_fin;
		}
		while(arrint[pos_fin] != 0) {
			inicio--;
			arrint[inicio] = pos_ini;
		}
		contador++;
		if(contador == 2) {
			System.out.println("la pos de la anteultima sec es: "+pos_ini+" pos fin "+pos_fin);
		}
	}
}
assasad
