package tp6;

public class ej_tipo_parcial {
	public static final int MAXFILA=3, MAXCOLUMNA=20;
	public static final int X=3, SEPARADOR=0;
	public static void main (String[]args) {
		int [][] matint = {
				            {0,-8,67,0,14,0,-4,33,0,5,98,0,0,0,0,0,0,0,0,0},
				            {0,0,25,25,0,-5,3,0,25,44,44,0,-4,1,0,0,0,0,0,0},
				            {0,44,44,44,0,-7,15,0,-4,9,0,12,0,0,0,0,0,0,0,0}
	        			};
		imprimir_matriz_int(matint);
		System.out.println("------------------------------------------------------");
		descomprimir_secuecias(matint);
		imprimir_matriz_int(matint);
	}
	public static void descomprimir_secuecias(int [][]matint) {
		for(int fila=0; fila<MAXFILA; fila++) {
			int ini=0, fin=-1, valor_positivo=0;
			while(ini < MAXCOLUMNA) {
				ini=obt_ini_sec(matint[fila], fin+1);
				if(ini < MAXCOLUMNA) {
					fin=obt_fin_sec(matint[fila], ini);	
					if(matint[fila][ini] < 0) {
						valor_positivo = volver_positivo_inicio(matint[fila], ini);
						descomprimir_sec(matint[fila], ini, fin, valor_positivo - 2);
						ini = obt_ini_sec(matint[fila], fin + (valor_positivo - 2));
					}
				}
			}
		}
	}
	public static int volver_positivo_inicio(int [] arr, int ini) {
		int ini_positivo=0;
		ini_positivo = arr[ini]*-1;
		return ini_positivo;
	}
	public static void descomprimir_sec(int [] arr, int ini, int fin, int valor_positivo) {
		int pixel_repetido = arr[fin];
		for(int i = 0; i < valor_positivo; i++) {
			corrimiento_derecha(arr, ini+1);
			arr[ini] = pixel_repetido;
			ini++;
		}
	}
	public static void corrimiento_derecha(int [] arr, int pos) { 
		int indice=MAXCOLUMNA-1;
		while(pos<indice) {
			arr[indice]= arr[indice-1];
			indice--;
		}
	}
	
	public static int obt_ini_sec(int [] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] == SEPARADOR) {
			ini++;
		} return ini;
	}
	public static int obt_fin_sec(int [] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] != SEPARADOR) {
			ini++;
		} return ini-1;
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
