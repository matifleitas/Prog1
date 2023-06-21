package tp6;

import java.util.Random;

/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada permita encontrar por cada fila la
posición de inicio y fin de la secuencia cuya suma de valores sea
mayor.*/
public class Tp6_e11 {
	static final int MAXFILA = 4, MAXCOLUMNA = 10, MINVALOR=0, MAXVALOR=9;
	public final static double probabilidad_numero=0.4;
	public static void main (String [] args) {
		int matint [][] = new int [MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_secuencias_int(matint);
		buscar_sec_mayor(matint);
		imprimir_matriz_int(matint);
	}
	public static void buscar_sec_mayor(int [][] matint) {
		//FOR que recorre todas las filas, incrementando fila
		for(int fila=0; fila < MAXFILA; fila++) {
			int ini=0, fin=-1, suma=0, suma_mayor=0, iniMayor=0, finMayor=0;
			while(ini < MAXCOLUMNA) {
			ini=obt_ini_sec(matint[fila], fin+1);
			if(ini < MAXCOLUMNA) {
				fin=obt_fin_sec(matint[fila], ini);
				suma = suma_de_sec(matint[fila], ini, fin);	
				if(suma > suma_mayor) {
					suma_mayor=suma;
					iniMayor=ini;
					finMayor=fin;
				}
			}
		}
			System.out.println("El valor de la secuencia mayor: "+suma_mayor+", ini en "+iniMayor+" fin en "+finMayor);
		}
	}
	public static int suma_de_sec(int [] arr, int ini, int fin) {
		int suma=0;
		while(ini<=fin) {
			suma+=arr[ini];
			ini++;
		} return suma;
	}

	public static int obt_ini_sec(int [] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] == 0) {
			ini++;
		} return ini;
	}
	
	public static int obt_fin_sec(int [] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] != 0) {
			ini++;
		} return ini-1;
	}
	
	public static void cargar_matriz_aleatorio_secuencias_int(int [][] mat){
	for (int fila = 0; fila < MAXFILA; fila++){
		cargar_arreglo_aleatorio_int(mat[fila]);
	}
		System.out.println("");
	}
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAXCOLUMNA-1] = 0;
			for (int pos = 1; pos < MAXCOLUMNA-1; pos++){
				if (r.nextDouble()>probabilidad_numero){
					arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
				}
				else{
					arr[pos]=0;
				}
			}
		}

	public static void imprimir_matriz_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			imprimir_arr_sec(mat[fila]);
			System.out.println("");
		}
	}
	public static void imprimir_arr_sec(int [] arr){
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print(arr[pos]+"|");
			}
	}
}
