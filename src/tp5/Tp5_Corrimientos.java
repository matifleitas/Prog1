package tp5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5_Corrimientos {
	public static final int MAX = 10, MAXVALOR=10, MINVALOR=1;

	public static void main(String[] args) {
	    int [] arr = new int [MAX] ;
	    int pos_user = obt_num_user(arr);
	    cargar_arreglo_aleatorio_int(arr);
	    imprimir_arreglo_int(arr);
	    corrimiento_derecha(arr, pos_user);
	    correrDerecha(arr, pos_user);
	    corrimiento_izquierda(arr, pos_user);
	    correrIzquierda(arr, pos_user);
	    System.out.println("----------------------");
	    imprimir_arreglo_int(arr);
	}
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);  
		}
	}
	
	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	
	public static void correrDerecha (int []arr, int pos){
	    for (int i = MAX-1;i>pos && i>0;i--){
	      arr[i]=arr[i-1];
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
}