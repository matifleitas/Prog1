package tp5;

public class Tp5_e17 {
	public static final int MAX = 20;
	public static void main(String [] args) {
		int [] arrint = {0, 0, 0, 5, 3, 2, 0, 0, 5, 2, 0, 4, 2, 1, 0, 0, 4, 4, 0, 0};
		//cargar_arreglo_aleatorio_secuencias_int(arrint);
		imprimir_arreglo_secuencias_int(arrint);

		obt_anteUltima_secuencia(arrint);
	} 

	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
	public static void obt_anteUltima_secuencia(int [] arrint) {
	int ini = 0, fin = MAX-1;
	int iterar_dos_sec = 2;
		for(int i=0; i<=iterar_dos_sec; i++) {
			ini=obt_inicio_secuencia_desde_fin(arrint, fin);
			fin=obt_fin_secuencia_desde_fin(arrint, ini);			
		}
	}	
	//empezar a iterar desde el final e ignorar la primer secuencia, la segunda es la que quiero
	public static int obt_fin_secuencia_desde_fin(int [] arrint, int ini) {
		while (ini<MAX && arrint[ini] != 0) {
			ini--;
		} return ini+1;
	}
	public static int obt_inicio_secuencia_desde_fin(int [] arrint, int fin) {
		while(fin<MAX && arrint[fin] == 0) {
			fin--;
		} return fin;
	}
	no itera dos veces
}

