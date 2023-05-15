package tp5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Tp5_e11 {
	public static final int MAX = 10;
	public static void main (String [] args) {
		int arrint [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
		int num_user = obt_num_user(arrint);
		int pos = obt_pos_num_user(arrint, num_user);//metodo que retorne pos del num si existe en el arr
		int numNoExiste = -1;
		if(pos != numNoExiste) {//si el num esta en el arr, hacer corrimiento izq en esa pos
			corrimiento_izquierda(arrint, pos);
			imprimir_arreglo_int(arrint);
		} else {
			System.out.println("El numero ingresado: "+num_user+" no esta en el arreglo");
		}
		
	}
	public static int obt_num_user(int [] arrint) {
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
			num = Integer.valueOf(entrada.readLine());
		} catch(Exception exc) {
			System.out.println( exc );
		} return num;
	}
	public static int obt_pos_num_user(int [] arrint, int num_user) {
		int indiceEliminar = -1;
		for(int pos=0; pos<MAX; pos++) {
			if(arrint[pos] == num_user) {
				indiceEliminar = pos;
			}
		} return indiceEliminar;
	}
	public static void corrimiento_izquierda(int [] arrint, int pos) {
		int indice = MAX-1;
		while(pos<indice) {
			arrint[pos] = arrint[pos+1];
			pos++;
		}
	}
	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
		System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
}
