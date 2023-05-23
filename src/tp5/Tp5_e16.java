package tp5;

public class Tp5_e16 {
	public static final int MAX = 15;
	public static void main(String [] args) {
		int [] arrint ={0, 0, 5, 3, 2, 0, 8, 5, 2, 0, 0, 2, 0, 1, 0};
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
		int inicio=0, fin=-1, secValorMax=-1, contador=0, iniMayor=0, finMayor=0;
		while(inicio < MAX) {
			inicio = obt_inicio_secuencia(arrint, fin+1);
			if(inicio < MAX) {
				fin = obt_fin_secuencia(arrint, inicio);
				contador = obt_valor_sec(arrint, inicio, fin);
				if(contador > secValorMax) {
					secValorMax = contador;
					iniMayor = inicio;
					finMayor = fin;
				}
			}
		}
		System.out.println("El valor de la sec max es de: "+secValorMax+" con pos ini, "+iniMayor+" y pos fin en, "+finMayor);
	}
	
	public static int obt_valor_sec(int [] arrint, int inicio, int fin) {
		int contador = 0;
		for(int i=inicio; i<=fin; i++) { //recorrer con for pq conozco el fin, usar WHILE
			contador += arrint[i];	     //solo si no conozco el fin
		}
		return contador;
	}
	
}
