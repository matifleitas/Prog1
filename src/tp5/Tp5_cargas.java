package tp5;
import java.util.Random;

public class Tp5_cargas {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [] arrint = new int [MAX];
		
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
	}
	
	public static void cargar_arreglo_aleatorio_int(int [] arrint) {
		Random r = new Random();
		for(int pos=0; pos<MAX; pos++) {
			arrint[pos]=(r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
		}
	}
	public static void imprimir_arreglo_int(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
		System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
}
