package tp5;

import java.util.Random;

public class Tp5_e6 {
	public static final int MAX = 10;
	public static final int MINVALOR = 1;
	public static final int MAXVALOR = 99;
	public static void main (String[] args) {
		int [] arrint = new int [MAX];
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
		int pares = obt_cant_pares(arrint);
		if(pares != 0) {
			System.out.println("En el arreglo hay una cantidad de: "+pares+" numeros enteros, pares");
		} else {
			System.out.println("En el arreglo no hay numero pares");
		}
	}
	public static void cargar_arreglo_aleatorio_int(int [] arrint){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arrint[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	public static void imprimir_arreglo_int(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
	public static int obt_cant_pares(int [] arrint) {
		int cant = 0;
		for (int pos=0; pos<MAX; pos++) {
			if(arrint[pos] % 2 == 0) {
				cant++;
			}
		}
		return cant;
	}
}
