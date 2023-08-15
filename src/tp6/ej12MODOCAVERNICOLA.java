package tp6;

public class ej12MODOCAVERNICOLA {
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
		metodoPoronga(matchar);
	}
	public static void metodoPoronga(char[][] matchar) { 
		for(int fila=0; fila<MAXFILA; fila++) {
			int ini=0, fin=0, contador=0, i=MAXCOLUMNA-1;
			while(i > 0 && contador < 2) {
				//ini=obt_ini_sec(matchar[fila], i);
				while(matchar[fila][i] == SEPARADOR) {
					i--;
				} 
				ini=i;
				while(matchar[fila][i] != SEPARADOR) {
					i--;
				}
				fin=i+1;
				contador++;
			}
			System.out.println("Para la fila, "+fila+" inicio en: "+fin+" fin en: "+ini);
		}
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
