package tp6;

/*Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada, permita encontrar por cada fila
la posici�n de inicio y fin de la ante�ltima secuencia (considerar
comenzar a buscarla a partir de la �ltima posici�n de la fila).*/
public class Tp6_e12 {
	public static final int MAXFILA=4, MAXCOLUMNA=10;
	public static final char SEPARADOR = ' ';
	public static void main (String [] args) {
		char matchar [][] = {
							{' ', 'e', 'l', ' ', 'o', 'b', 'x', 'l', ' ', ' '},
	            			{' ', 'o', 'r', 'l', 't', ' ', 'u', 'p', 'c', ' '},
	            			{' ', 'r', 'u', 's', ' ', ' ', 'v', 'y', 's', ' '},
	            			{' ', 'q', 'p', 's', ' ', 'n', 'r', 'b', 'r', ' '}
							};
		imprimir_matriz_char(matchar);
		encontrar_anteult_sec(matchar);
	}
	public static void encontrar_anteult_sec(char [][] matchar) {
		for(int fila=0; fila<MAXFILA; fila++) {
			int ini=1, fin=MAXCOLUMNA, contador=0;
			while(ini > 0 && contador < 2) {
				ini=obt_ini_sec(matchar[fila], fin-1);
				if(ini > 0) {
					fin=obt_fin_sec(matchar[fila], ini);
					contador++;
				}
			}
			System.out.println("Para la fila, "+fila+" inicio en: "+fin+" fin en: "+ini);
		}
	}
	public static int obt_ini_sec(char [] arr, int ini) {
		while(ini > 0 && arr[ini] == SEPARADOR) {
			ini--;
		} return ini;
	}
	public static int obt_fin_sec(char [] arr, int ini) {
		while(ini > 0 && arr[ini] != SEPARADOR) {
			ini--;
		} return ini+1;
	}

	public static void imprimir_matriz_char(char [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			imprimir_arreglo_char(mat[fila]);
		System.out.println("");
		}
	}
	public static void imprimir_arreglo_char(char [] arr){
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print(arr[pos]+"|");
			}
		}
}
