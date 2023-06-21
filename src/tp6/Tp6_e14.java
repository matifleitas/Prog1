package tp6;
/*Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada, elimine de cada fila todas las
ocurrencias de una secuencia patrón dada por un arreglo de
caracteres de tamaño igual al tamaño de columnas de la matriz
(sólo tiene esa secuencia con separadores al inicio y al final). Al

eliminar en cada fila se pierden los valores haciendo los
corrimientos.*/
public class Tp6_e14 {
	public static final int MAXFILA=4, MAXCOLUMNA=10;
	public static final int SEPARADOR=' ';
	public static void main (String [] args) {
        char[][] matchar = {
						{' ', ' ', ' ', ' ', 'o', 'b', 'x', 'l', ' ', ' '},
		    			{' ', 'r', 'r', 'l', 't', ' ', 'u', 'p', 'c', ' '},
		    			{' ', 'r', 'u', 's', ' ', ' ', 'r', ' ', 's', ' '},
		    			{' ', 'r', ' ', 's', ' ', 'n', 'r', 'b', 'r', ' '}
						};
        char [] patron = {' ', ' ', ' ', 'r', 'u', 's', ' ', ' ', ' ', ' '};
        eliminar_sec_patron(matchar, patron);
		imprimir_matriz_char(matchar);
	}
	public static void eliminar_sec_patron(char [] [] matchar, char[] patron) {
		for(int fila=0; fila<MAXFILA; fila++) {
			int ini=0, fin=-1,tam=0;
			while(ini < MAXCOLUMNA) {
				ini=obt_ini_sec(matchar[fila], fin+1);
				if(ini < MAXCOLUMNA) {
					fin=obt_fin_sec(matchar[fila], ini);
					tam=fin-ini+1;
					
					if(es_sec_patron(matchar[fila],patron, ini, fin, tam)) {
						eliminar_sec(matchar[fila], ini, fin);
						fin = ini;
					} 
				}
			}
		}
	}
	public static boolean es_sec_patron(char[] arr, char[] patron, int ini, int fin, int tam) {
		boolean es_patr=false;
		int iniPat=0, finPat=-1, tamPat=0;
		while(iniPat < MAXCOLUMNA) {
			iniPat=obt_ini_sec(patron, finPat+1);
			if(iniPat < MAXCOLUMNA) {
				finPat=obt_fin_sec(patron, iniPat);
				tamPat=finPat-iniPat+1;
				if((tam==tamPat) && (sonIguales(arr, patron, ini, fin, iniPat, finPat))) {
					es_patr=true;
				}
			}
		}
		
	 return es_patr;
	}
	public static boolean sonIguales(char [] arr, char [] patron, int ini, int fin, int finPat, int iniPat) {
		boolean es_igual=false;
		while(ini <= fin && arr[ini] == patron[iniPat]) {
			ini++;
		 	iniPat++;
		 	if(ini>fin) {
		 		es_igual=true;
		 	}
		 }
		 return es_igual;
	}
	public static void eliminar_sec(char[] arr, int ini, int fin) {
		for(int i=ini; i <= fin; i++) {
			corrimiento_izq(arr, ini);
		}
	}
	public static void corrimiento_izq(char [] arr, int ini) {
		while(ini < MAXCOLUMNA-1) {
			arr[ini] = arr[ini+1];
			ini++;
		} 
	}
	public static int obt_ini_sec(char [] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] == SEPARADOR) {
			ini++;
		} return ini;
	}
	
	public static int obt_fin_sec(char [] arr, int ini) {
		while(ini < MAXCOLUMNA && arr[ini] != SEPARADOR) {
			ini++;
		} return ini-1;
	}
	public static void imprimir_matriz_char(char [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			imprimir_arreglo_char(mat[fila]);
		System.out.println("");
		}
	}
	public static void imprimir_arreglo_char(char [] arr){
		for (int pos = 0; pos < MAXCOLUMNA; pos++){
			System.out.print(arr[pos]+"|");
		}
	}
}
