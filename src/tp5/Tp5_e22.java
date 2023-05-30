package tp5;

public class Tp5_e22 {
	public static final int MAX = 20;
	public static void main (String[] args) {
        int A[] = { 0, 0, 1, 2, 3, 4, 5, 0, 9, 0, 11, 0, 0, 1, 2, 3, 4, 5, 0, 0 };
        int P[] = { 0, 1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int R[] = { 0, 10, 3, 4, 87, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        
        imprimir_arreglo(A);
        reemplazar_ocurrencias(A, P, R);
        System.out.println(" ");
        imprimir_arreglo(A);
	}
	public static void reemplazar_ocurrencias(int[] A, int[] P, int[] R) {
		int ini_a = 0, fin_a = 0;
		int ini_p = 0, fin_p = 0;
		int ini_r = 0, fin_r = 0;
		ini_p = obt_ini_sec(P, fin_p +1);
		fin_p = obt_fin_sec(P, ini_p);
		ini_r = obt_ini_sec(R, fin_r + 1);
		fin_r = obt_fin_sec(R, ini_r);
		while(ini_a < MAX) {
			ini_a = obt_ini_sec(A, fin_a + 1);
			if(ini_a < MAX) {
				fin_a = obt_fin_sec(A, ini_a);
				if(fin_a < MAX) {
					int tamR = fin_r - ini_r + 1;
                    int tamA = fin_a - ini_a + 1;
                    if(hay_ocurrencia(A, P, ini_a, fin_a, ini_p) && tamA == tamR) {
                    	reemplazar(A, R, ini_a, fin_a, ini_r);
                    }
				}
			}
		}
	}	
	public static void reemplazar(int [] A, int[] R, int ini_a, int fin_a, int ini_r) {
		for(int i = ini_a; i <= fin_a; i++) {
			A[i] = R[ini_r];
			ini_r++;
		}
	}
	public static boolean hay_ocurrencia(int [] A, int [] pat, int ini_a, int fin_a, int ini_pat) {
		if(fin_a - ini_a + 1 == 1) {
			return false;
		}
		while(ini_a < fin_a && A[ini_a] == pat[ini_pat]) {
            ini_a++;
            ini_pat++;
		}
		return ini_a == fin_a;
	}
	
	public static void imprimir_arreglo(int[] arr) {
	    for (int i = 0; i < MAX; i++) {
	        System.out.print(arr[i] + "|");
	    }
	}
	public static int obt_ini_sec(int [] arr, int ini) {
		while(ini < MAX && arr[ini] == 0) {
			ini++;
		} 
		return ini;
	}
	public static int obt_fin_sec(int [] arr, int ini) {
		while(ini < MAX && arr[ini] != 0) {
			ini++;
		}
		return ini-1;
	}

}