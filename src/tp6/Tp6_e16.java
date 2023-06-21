package tp6;

public class Tp6_e16 {
	public static final int MAXFILA=4, MAXCOLUMNA=10;
	public static final int SEPARADOR=' ';
	public static void main (String[] args) {
		char [][] matchar1 = {
								{' ', ' ', ' ', ' ', 'a', 'b', 'c', 'l', ' ', ' '},
				    			{' ', 'o', 'r', 'l', 't', ' ', 'x', 'p', 'c', ' '},
				    			{' ', 'r', 'u', 's', ' ', ' ', 'r', ' ', 's', ' '},
				    			{' ', 'z', 'y', 'x', ' ', 'n', 'r', 'b', 'r', ' '}
							 };
		char [][] matchar2 = {
								{' ', ' ', ' ', 'j', 'o', 'w', 'i', ' ', ' ', ' '},
				    			{' ', 't', 'v', ' ', 't', 'n', 'r', 'm', 'c', ' '},
				    			{' ', ' ', 'b', 's', ' ', ' ', 'r', 'p', 's', ' '},
				    			{' ', 'a', 'q', 'f', ' ', 'n', 'r', ' ', 'r', ' '}
			 				};
		imprimir_matriz_char(matchar1);
		imprimir_matriz_char(matchar2);
		obt_sec_mayor(matchar1, matchar2);
	}
	public static void obt_sec_mayor(char[][] matchar1, char[][] matchar2) {
		for(int fila=0; fila <= MAXFILA; fila++) {
			int ini = 0, fin =-1, iniMatchar2=0, finMatchar=-1;
			while(ini < MAXCOLUMNA) {
				ini=obt_ini_sec(matchar1[fila], fin+1);
				iniMatchar2=obt_ini_sec(matchar1[fila], finMatchar+1);
				if(ini < MAXCOLUMNA) {
					fin=obt_fin_sec(matchar1[fila], ini);
					finMatchar=obt_fin_sec(matchar1[fila], ini);
				}
			}
		}
	}
	public static int obt_ini_sec(char [] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] == SEPARADOR) {
			ini ++;
		} return ini;
	}
	public static int obt_fin_sec(char[] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] != SEPARADOR) {
			ini++;
		} return ini-1;
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
