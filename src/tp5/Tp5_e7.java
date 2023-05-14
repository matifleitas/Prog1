package tp5;

public class Tp5_e7 {
	public static final int MAX = 10;

	public static void main(String [] args) {
		int [] arrint = {9, 7, 2, 3, 5, 2, 1, 2, 4, 1};
		int pos_corrimiento = 4;
		encontrar_pos_arr(arrint, pos_corrimiento);
		imprimir_arreglo_int(arrint);
		
	}
	public static void imprimir_arreglo_int(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
	public static void encontrar_pos_arr(int [] arrint, int pos_corrimiento) {
		for(int pos = 0; pos < MAX; pos++) {
			if(pos == pos_corrimiento) {
				corrimiento_derecha(arrint, pos_corrimiento);
			}
		}
	}
	public static void corrimiento_derecha(int [] arrint, int pos_corrimiento) {
		int indice=MAX-1; //empiezo desde MAX-1 ya que la pos 10 no existe
		while(indice > pos_corrimiento) { //hasta no llegar a la pos no paro de hacer corrimientos
			arrint[indice] = arrint[indice-1]; //arrint[indice] se transforma en arrint[indice-1]
			indice--;//variable indice se decrementa 1 para que haga lo mismo con la pos siguiente
		}
	}
}
