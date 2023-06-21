package tp6;
/*15. Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada elimine todas las secuencias que
tienen orden descendente entre sus elementos.*/
public class Tp6_e15 {
	public static final int MAXFILA=4, MAXCOLUMNA=10;
	public static final int SEPARADOR=' ';
	public static void main(String[]args) {
		char [][] matchar = {
								{' ', ' ', ' ', ' ', 'a', 'b', 'c', 'l', ' ', ' '},
				    			{' ', 'o', 'r', 'l', 't', ' ', 'x', 'p', 'c', ' '},
				    			{' ', 'r', 'u', 's', ' ', ' ', 'r', ' ', 's', ' '},
				    			{' ', 'z', 'y', 'x', ' ', 'n', 'r', 'b', 'r', ' '}
							};
		imprimir_matriz_char(matchar);
		eliminar_sec_descendente(matchar);
		System.out.println("------------------------");
		imprimir_matriz_char(matchar);
	}
	public static void eliminar_sec_descendente(char[][] matchar) {
		for(int fila=0; fila < MAXFILA; fila++) {
			int ini=0, fin=-1;
			while(ini < MAXCOLUMNA) {
				ini=obt_ini_sec(matchar[fila], fin+1);
				if(ini < MAXCOLUMNA) {
					fin=obt_fin_sec(matchar[fila], ini);
					if(es_descendente(matchar[fila], ini, fin)) {
						eliminar_sec(matchar[fila], ini, fin);
						fin = ini;
					}
				}
			}
		}
	}
	public static void eliminar_sec(char[] arr, int ini, int fin) {
		for(int i=ini; i<=fin; i++) {
			corrimiento_izq(arr, ini);
		}
	}
	public static void corrimiento_izq(char[]arr, int ini) {
		while(ini < MAXCOLUMNA-1) {
			arr[ini] = arr[ini+1];
			ini++;
		} 
	}
	public static boolean es_descendente(char[]arr, int ini, int fin) {
		while(ini <= fin && arr[ini] > arr[ini+1]) {
			ini++;
		} return ini>fin;
	}
	
	public static int obt_fin_sec(char[] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] != SEPARADOR) {
			ini++;
		} return ini-1;
	}
	
	public static int obt_ini_sec(char [] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] == SEPARADOR) {
			ini++;
		} return ini;
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
