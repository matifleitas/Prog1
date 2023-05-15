package tp5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp5_e10 {
	public static final int MAX = 10;
	public static void main (String [] args) {
		int arrint [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
		int num_user = obt_num_user(arrint);
		buscar_num_en_arr(arrint, num_user);
		imprimir_arr_int(arrint);
	}
	public static void imprimir_arr_int(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
	public static int obt_num_user(int [] arrint) {
		int num = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
			num = Integer.valueOf(entrada.readLine());
		} catch(Exception exc) {
			System.out.println( exc );
		}	return num;
	} 
	public static void buscar_num_en_arr(int [] arrint, int num_user) {
		boolean numero = false;
		for(int pos=0; pos<MAX; pos++) {			
			if(arrint[pos] == num_user) {
				numero = true;
				corrimiento_izquierda(arrint, pos);
			} 
			arrint[pos] = arrint [pos+1];
		}
	}
	public static void corrimiento_izquierda(int [] arrint ,int pos) {
		int indice = MAX-1;
		while(pos<indice) {
			arrint[pos] = arrint[pos+1];
			pos++;
		}
	}
}
ss
