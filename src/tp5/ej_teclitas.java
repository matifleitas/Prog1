package tp5;

public class ej_teclitas {
	public static final int MAX = 20;
	public static void main(String [] args) {
		int [] arr = {0, 67, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 33, 33, 33, 33, 0, 5, 98, 0};
	
		comprimir_sec_segundo_valor_negado(arr);
		mostrar_arreglo(arr);
 	}
	public static void comprimir_sec_segundo_valor_negado(int [] arr) {
		int ini=0, fin=-1, cantidad_repeticiones=0, ocurrencia_negada=0, tamanio=0, x_rep=1;
		while(ini < MAX) {
			ini=obt_ini_sec(arr, fin+1);
			if(ini < MAX) {
				fin=obt_fin_sec(arr, ini);
				tamanio=fin-ini+1;
				cantidad_repeticiones=obt_cantidad_rep(arr, ini, fin);
				if(cantidad_repeticiones > x_rep) {
					for(int i = ini; i<=tamanio-1; i++) {
						corrimiento_izquierda(arr, ini);
						fin--;
						if(ini==fin) {
							arr[ini+1] = ocurrencia_negada - tamanio;	
						}
					}
				}
			}
		}
	}
	public static int obt_cantidad_rep(int [] arr, int ini, int fin) {
		int cantidad_rep=0;
		while(ini<=fin) {
			if(arr[ini] == arr[ini+1]) {
				cantidad_rep++;
				ini++;
		}
	}
	return cantidad_rep;
	}
	public static int obt_ini_sec(int [] arr, int ini) {
		while(ini < MAX && arr[ini] == 0) {
			ini++;
		} return ini;
	}
	public static int obt_fin_sec(int [] arr, int ini) {
		while(ini < MAX && arr[ini] != 0) {
			ini++;
		} return ini-1;
	}
	public static void corrimiento_izquierda(int [] arr, int ini) {
		int indice = MAX-1;
		while(ini < indice) {
			arr[ini] = arr[ini+1];
			ini++;
		} 
	}
	public static void mostrar_arreglo(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
}

