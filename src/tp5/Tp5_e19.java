package tp5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp5_e19 {
	public static final int MAX = 15;
	public static void main (String [] args) {
		int [] arrint = {0, 0, 0, 5, 3, 2, 0, 0, 5, 2, 0, 0 ,2, 0 ,0};
		int num = obt_num_user(arrint);
		buscar_sec_tam_numUser(arrint, num);
	}
	public static void imprimir_arr_sec(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
	public static int obt_num_user(int [] arrint) {
		int num = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
			num = Integer.valueOf(entrada.readLine());
		} catch(Exception exc) {
			System.out.println( exc );
		}
		return num;
	}
	public static void buscar_sec_tam_numUser(int [] arrint, int num) {
		int ini=0, fin=-1;
		while(ini < MAX) {
			ini = obt_ini_sec(arrint, fin+1);
			if(ini < MAX) {
				fin = obt_fin_sec(arrint, ini);
				int tam = fin-ini+1;
				if(tam == num) {
					for(int i=ini; i<=fin; i++) { //iterar tantas veces como el largo del arr
						corrimiento_izquierda(arrint, ini, fin); //corr n veces
					}
				}
			}
		}
		imprimir_arr_sec(arrint);
	}
	public static int obt_ini_sec(int [] arrint, int inicio) {
		while(inicio<MAX && arrint[inicio] == 0) {
			inicio++;
		}
		return inicio;
	}
	public static int obt_fin_sec(int [] arrint, int inicio) {
		while(inicio<MAX && arrint[inicio] != 0) {
			inicio++;
		}
		return inicio-1;
	}
	public static void corrimiento_izquierda(int [] arr, int ini, int fin) {
		while(ini<=fin) {
			arr[ini]=arr[ini+1];
			ini++;
		}
	}
}
