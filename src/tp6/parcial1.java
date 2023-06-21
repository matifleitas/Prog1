package tp6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
/*
Sea una matriz de enteros de tamanio 4*12 de secuencias de numeros entre
1 y 9 (por cada fila), separadas por ceros. 
La matriz esta precargada (no implementar el metodo de carga), y ademas cada fila empieza y termina con uno
o mas separadores 0. Se pide realizar un programa que:
 reemplace de cada secuencia el mayor valor posee por lo que suma el contenido de la secuencia.
*/
public class parcial1 {
	public static final int MAXFILA=4, MAXCOLUMNA=12, MINVALOR=1, MAXVALOR=9;
	public final static double probabilidad_numero=0.4;
	public static void main (String[]args) {
		int matint [][] = new int [MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_secuencias_int(matint);
		imprimir_matriz_int(matint);
		System.out.println("-------------------");
		buscar_mayor_numero_par(matint);
		imprimir_matriz_int(matint);
	}
	public static void buscar_mayor_numero_par(int [][]matint) {
		for(int fila=0; fila<MAXFILA; fila++) {
			int ini=0, fin=-1, suma_sec=0, num_mayor=0;
			while(ini<MAXCOLUMNA) {
				ini=obt_ini_sec(matint[fila], fin+1);
				if(ini<MAXCOLUMNA) {
					fin=obt_fin_sec(matint[fila], ini);
					suma_sec=obt_suma_sec(matint[fila], ini, fin);
					num_mayor=obt_num_mayor(matint[fila], ini, fin);
					intercambiar_mayor_por_suma(matint[fila], suma_sec, num_mayor, ini, fin);
				}
			}
		}
	}
	public static void intercambiar_mayor_por_suma(int []arr, int suma_sec, int num_mayor, int ini, int fin) {
		for(int i=ini; i<=fin; i++) {
			if(arr[i] == num_mayor) {
				arr[i] = suma_sec;
			}
		}
	}
	public static int obt_num_mayor(int [] arr, int ini, int fin) {
		int num_mayor=0;
		for(int i=ini; i<=fin; i++) {
			if(arr[i] > num_mayor) {
				num_mayor = arr[i];
			}
		} return num_mayor;
	}
	public static int obt_suma_sec(int [] arr, int ini, int fin) {
		int suma=0;
		for(int i=ini; i<=fin; i++) {
			suma+=arr[i];
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
	
	public static int obt_num_user() {
		int num=0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero: ");
			num = Integer.valueOf(entrada.readLine());
		} catch(Exception exc) {
			System.out.println( exc );
		} return num;
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
