package tp5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp5_e25 {
	public static final int MAX = 20;
	public static void main (String [] args) {
		int [] arr = {0, 0, 2, 3, 4, 0, 0, 0, 2, 3, 6, 7, 5, 0, 0, 3, 4, 5, 0, 0};
		int [] arr_vacio = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0 , 0, 0, 0, 0};
		int numero = obt_num_user();
		buscar_sec_tam_numUser(arr, arr_vacio, numero);
	}
	public static void buscar_sec_tam_numUser(int [] arr, int [] arr_vacio, int numero) {
		int ini = 0, fin = -1;
		while(ini<MAX) {
			ini=obt_ini_sec(arr, fin+1);
			if(ini<MAX) {
				fin=obt_fin_sec(arr, ini);
				int tam_arr = fin-ini + 1;
				if(tam_arr == numero) {
					copiar_secuencia(arr, ini, fin, arr_vacio);
				} 
			}
		}
	}
	public static void copiar_secuencia(int [] arr, int ini, int fin, int [] arr_vacio) {
		int ini_vacio = 0;
		while(ini <= fin) {
			arr_vacio[ini_vacio] = arr[ini];
			ini++;
			ini_vacio++;
		}
		imprimir_arr_sec(arr_vacio);
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
	
	public static int obt_num_user() {
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
			num = Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			System.out.println( exc );
		}
		return num;
	}
	public static void imprimir_arr_sec(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
}
