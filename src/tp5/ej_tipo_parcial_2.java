package tp5;

public class ej_tipo_parcial_2 {
	public static final int MAX = 21;
	public static final int N = 2;
	public static void main (String[] args) {
		int [] arr = {-1, 12, 22, 44, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 57, -1};
		int [] pat = {-1, -1, -1, -1, -1, -1, -1, -1, 23, 34, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		analizar_patrones_repetidos(arr, pat);
		imprimir_arr_sec(arr);
	}
	public static void analizar_patrones_repetidos(int [] arr, int [] pat) {
		int ini = 0, fin= -1, cant_repetidos=0;
		
		while(ini < MAX) {
			ini=obt_ini_sec(arr, fin+1);
			if(ini < MAX) {
				fin=obt_fin_sec(arr, ini);
				int tam_arr = fin-ini+1;
				if(es_sec_patron(pat, ini, fin, arr, tam_arr)) {
					cant_repetidos++;
					if(cant_repetidos < N) {
						for(int i=0; i<tam_arr; i++) {
							corrimiento_izquierda(arr, ini);
						}
					}
				} 
			}
		}
	}
	public static boolean es_sec_patron(int []pat, int ini, int fin, int [] arr, int tam_arr) {
		int ini_pat=0, fin_pat=-1;
		boolean es_igual = false;
		while(ini_pat < MAX) {
			ini_pat = obt_ini_sec(pat, fin_pat+1);
			if(fin_pat < MAX) {
				fin_pat = obt_fin_sec(pat, ini_pat);
				int tam_pat = fin_pat-ini_pat + 1;
				if(tam_arr == tam_pat) {
					while(ini <= fin && arr[ini] == pat[ini_pat]) {
						ini++;
						ini_pat++;
						if(ini > fin) {
							es_igual = true;
						}
					}
				}
			}
		}
		return es_igual;
	}
	public static void corrimiento_izquierda(int [] arr, int ini) {
		int indice = MAX-1;
		while(ini < indice) {
			arr[ini] = arr[ini+1];
			ini++;
		} 
	}
	public static int obt_ini_sec(int[] arr, int ini) {
		while(ini<MAX && arr[ini] == -1) {
			ini++;
		} 
		return ini;
	}
	public static int obt_fin_sec(int [] arr, int ini) {
		while(ini<MAX && arr[ini] != -1) {
			ini++;
		}
		return ini-1;
	}
	public static void imprimir_arr_sec(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
}
