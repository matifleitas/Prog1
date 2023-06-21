package tp6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Tp6_e13 {
	public static final int MAXFILA=4, MAXCOLUMNA=10, MINVALOR=0, MAXVALOR=9;
	public final static double probabilidad_numero=0.4;
	public static void main(String [] args) {
		int matint [][] = new int [MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_secuencias_int(matint);
		imprimir_matriz_int(matint);
		int numero=obt_num_user();
		buscar_sec_numUser(matint, numero);
		imprimir_matriz_int(matint);
	}
	public static void buscar_sec_numUser(int [][] matint, int numero) {
		for(int fila=0; fila<MAXFILA; fila++) {
			int ini=0, fin=-1, tam=0;
			while(ini < MAXCOLUMNA) {
				ini=obt_ini_sec(matint[fila], fin+1);
				if(ini < MAXCOLUMNA) {
					fin=obt_fin_sec(matint[fila], ini);
					tam=fin-ini+1;
					if(tam == numero) {
						eliminar_sec(matint[fila], ini, fin);
						fin = ini;
					}
				}
			}
		}
	}
	public static void eliminar_sec(int [] arr,  int ini, int fin) {
		for(int i=ini; i<=fin; i++) {
			corrimiento_izq(arr, ini);
		}
	}
	public static void corrimiento_izq(int [] arr, int ini) {
		while(ini<MAXCOLUMNA-1) {
			arr[ini] = arr[ini+1];
			ini++;
		}
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
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
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