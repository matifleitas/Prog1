package tp6;

import java.util.Random;

public class Tp6_bonus_track1 {
	public static final int MAXFILA=31, MAXCOLUMNA=7, MINVALOR=0, MAXVALOR=9;
	public final static double probabilidad_numero=0.4;
	public static void main (String[]args) {
		int matint [][] = new int [MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_secuencias_int(matint);
		rutinas_a_conocer(matint);
		imprimir_matriz_int(matint);
	}asddas
	public static void rutinas_a_conocer(int[][] matint) {
		for(int fila=0; fila < MAXFILA; fila++) { 
			int ini=0, fin=-1, cant_tickets=0, promedio_ticket=0, suma_total=0;;
			while(ini < MAXCOLUMNA) {
				ini=obt_ini_sec(matint[fila], fin+1);
				if(ini < MAXCOLUMNA) {
					fin=obt_fin_sec(matint[fila], ini);
					cant_tickets++;		
					cant_tickets += suma_total;
					promedio_ticket= cant_tickets / 7;
					System.out.println(suma_total   );
				}
			}
	
		}
	}
	public static int obt_promedio_tickets(int cant_tickets) {
		int promedio=0;
		int dia =7;
		promedio = cant_tickets / dia;
		return promedio;
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
