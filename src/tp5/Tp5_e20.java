package tp5;

public class Tp5_e20 {
	public static final int MAX = 20;
	public static final int MAX_PATRON = 4;
	public static void main (String [] args) {
		int [] arrint = {0, 4, 5, 8, 2, 0, 4, 7, 3, 3, 0, 0, 8, 1, 4, 0, 0, 0, 8, 9};
		int [] arrPatron = {4, 5, 8, 2};
		eliminar_ocurrencias(arrint, arrPatron);
	}
	public static void eliminar_ocurrencias(int [] arrint, int [] arrPatron) {
		int inicio = 0, fin = -1;
		
		while (inicio < MAX) { //mientras q ini sea menor que MAX
			inicio = obt_ini_Sec(arrint, fin + 1);
			if(inicio < MAX) { //si inicio es como maximo MAX-1, para no pasarse, de MAX
				fin = obt_fin_Sec(arrint, inicio);
				boolean resultado = analizarSecuencia(arrint, arrPatron, inicio, fin);
				if(resultado == true) {
					eliminarSecuencia(arrint, inicio, fin);
				}
			}
		}
		imprimir_arr_sec(arrint);
	}
	
    public static boolean analizarSecuencia(int[] arrint, int[] arrPatron, int inicio, int fin) {
    	int i = 0;
    	int tam = (fin-inicio)+1;
    	if(tam == MAX_PATRON) {
    		while(i < MAX_PATRON && arrint[inicio] == arrPatron[i]) {
    			i++;
    			inicio++;
    		}
    		if(i == MAX_PATRON) {
    			return true;
    		}
    	}
    	return false;
    }
 
    public static void eliminarSecuencia(int[] arrint, int ini, int fin) {
    	for(int i=ini; i<=fin; i++) { //iterar tantas veces como el largo del arr
			corrimiento_izquierda(arrint, ini, fin); //corr n veces
		}
    }
	public static int obt_ini_Sec(int[] arr, int inicio) {
        while (inicio < MAX && arr[inicio] == 0) {
            inicio++;
        }
        return inicio;
    }

    public static int obt_fin_Sec(int[] arr, int inicio) {
        while (inicio < MAX && arr[inicio] != 0) {
            inicio++;
        }
        return inicio - 1;
    }
    public static void corrimiento_izquierda(int [] arrint, int ini, int fin) {
    	while(ini<=fin) {
    		arrint[ini] = arrint[ini+1];
    		ini++;
    	}
    }

	public static void imprimir_arr_sec(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
}
