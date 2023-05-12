package tp5;

import java.util.Random;

public class Tp5_e3 {
	public static final int MAX = 10; //maximo de posiciones o largo de la matriz
	public static final int MAXVALOR = 99; //valores dentro de pos
	public static final int MINVALOR = 1;

	public static void main (String[] args) {
		int [] arrint = new int [MAX];
		cargar_arr_aleatorio(arrint);
		imprimir_arr_aleatorio(arrint);
		int promedio = calcular_promedio_arr(arrint);
		int elementos_mayores = calcular_elementos_mayores_prom(arrint, promedio);
		System.out.println("El promedio de los valores del arreglo es: "+promedio);
		System.out.println("La cantidad de elementos que estan por estan por encima del promedio son: "+elementos_mayores);
	}
	
	public static void cargar_arr_aleatorio(int [] arrint){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arrint[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	public static void imprimir_arr_aleatorio(int [] arrint){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrint[pos]);
		}
	}
	public static int calcular_promedio_arr(int [] arrint) {
		int suma = 0;
		
		for(int pos=0; pos<MAX; pos++) {
			suma += arrint[pos];
		}
		return suma / MAX;
	}
	public static int calcular_elementos_mayores_prom(int arrint [], int promedio) {
		int suma = 0;
		for(int pos=0; pos<MAX; pos++) {
			if(arrint[pos] > promedio) {
				suma++;
			}
		}
		return suma;
	}
}
