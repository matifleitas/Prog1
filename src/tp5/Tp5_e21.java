package tp5;

public class Tp5_e21 {
	public static final int MAX = 15;
	public static void main (String [] args) {
		int [] arrint = {0, 0, 0, 5, 3, 2, 0, 8, 1, 3, 0, 0 ,2, 0 ,1 ,0};
		eliminar_sec_descendentes(arrint);
	}
	public static void imprimir_arr_sec(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
	public static void eliminar_sec_descendentes(int [] arrint) {
		int inicio=0, fin=-1;
		while(inicio < MAX) {
			inicio = obt_ini_sec(arrint, fin+1);
			if(inicio < MAX) {
				fin = obt_fin_sec(arrint, inicio);
				int tam = fin-inicio+1;
				boolean es_descendente = verificar_sec_sea_desc(arrint, inicio, fin, tam);
				if(es_descendente == true) {
					for(int i=inicio; i<=fin; i++) {
						corrimiento_izq(arrint, inicio, fin);
					}
				imprimir_arr_sec(arrint);
				} 
			}
		}
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
	public static boolean verificar_sec_sea_desc(int [] arrint, int inicio, int fin, int tam) {
		boolean desciende = false;
		int indice = inicio;
		int contador_desc = 0;
		while(indice<=fin) {
			if (arrint[indice] > arrint[indice+1]) { //preguntar si el que sigue es menor
				indice++; 	     //incrementar el indice
				contador_desc++; //incrementar contador
			}
			if(contador_desc == tam) {//preguntar si la cantidad de numeros en descendecia
				desciende = true;	  //es la misma que el tam y con eso corroborar que la
									  //sec completa es descendente 
			}
		}
		return desciende;
	}
	
	public static void corrimiento_izq(int [] arrint,int ini, int fin) {
		while(ini<=fin) {
			arrint[ini]=arrint[ini+1];
			ini++;
		}
	}
}

