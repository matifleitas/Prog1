package tp5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp5_e9 {
	public static final int MAX = 10;
	public static void main (String[] args) {
		int arrint [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
		int num_user = obt_num_user(arrint);
		corrimiento_der_insertar_num(arrint, num_user);
		imprimir_arr_int(arrint);
	}
	public static void imprimir_arr_int(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
	public static int obt_num_user(int [] arrint) {
		int num = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingresar un numero entero: ");
			num = Integer.valueOf(entrada.readLine());
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
		return num;
	}
	public static void corrimiento_der_insertar_num (int [] arrint, int num_user) {
		int pos_insertar = 0;
		int indice = MAX-1;
		while(indice > pos_insertar) { //bucle hasta llegar a la pos_min=[0] de el arreglo
			arrint[indice] = arrint[indice-1];
			indice--;
			if(indice == pos_insertar) { //si indice esta en la pos = 0, entra
				arrint[indice] = arrint[num_user]; //cambia el valor de indice [0] 
			}									   //por el num_user
		}
	}
}
