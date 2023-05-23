package tp5;

public class Tp5_e8 {
	public static final int MAX = 10;
	public static void main(String [] args) {
		int [] arrint = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
		int pos_corrimiento = 6;
		
		for(int pos = 0; pos < MAX; pos++) {
			if(pos == pos_corrimiento) {
				corrimiento_izquierda(arrint, pos_corrimiento);
			}
		}
		imprimir_arreglo_int(arrint);
	}
	public static void imprimir_arreglo_int(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
	public static void corrimiento_izquierda(int [] arrint, int pos_corrimiento) {
		int indice = MAX-1;
		while(pos_corrimiento < indice) {
			arrint[pos_corrimiento] = arrint[pos_corrimiento+1];
			pos_corrimiento++;
		}
	}
}