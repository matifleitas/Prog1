package tp5;

import java.util.Random;

public class Tp5_e16 {
	public static final int MAX = 15;
	public static final int MINVALOR = 1;
	public static final int MAXVALOR = 9;
	public static final double probabilidad_numero = 0.4;
	public static void main(String [] args) {
		int [] arrint ={0, 0, 0, 5, 3, 2, 0, 8, 5, 2, 0, 0 ,2, 0 ,1 ,5};
		imprimir_arreglo_secuencias_int(arrint);		
		sec_max_valor(arrint);
	}
	public static int obt_inicio_secuencia(int [] arrint, int inicio) {
		while(inicio<MAX && arrint[inicio] == 0) { //while para asegurar q entre una vez
			inicio ++;
		} return inicio;
	}
	public static int obt_fin_secuencia(int [] arrint, int inicio) {
		while(inicio<MAX && arrint[inicio] != 0) {
			inicio++;
		} return inicio-1;
	}
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
	public static void sec_max_valor(int [] arrint) {
		int inicio=0, fin=-1, secValorMax=-1, contador=0, posIni=0, posFin=0;
		while(inicio < MAX) {
			inicio = obt_inicio_secuencia(arrint, fin+1);
			if(inicio < MAX) {
				fin = obt_fin_secuencia(arrint, inicio);
				contador = obt_valor_sec(arrint, inicio, fin);
				if(contador > secValorMax) {
					secValorMax = contador;
					posIni = inicio;
					posFin = fin;
				}
			}
		}
		System.out.println("El valor de la sec max es de: "+secValorMax+" con pos ini, "+posIni+" y pos fin en, "+posFin);
	}
	public static int obt_valor_sec(int [] arrint, int inicio, int fin) {
		int contador = 0;
		while(inicio<=fin) {
			contador += arrint[inicio];
			inicio ++;
		}
		return contador;
	}
}
