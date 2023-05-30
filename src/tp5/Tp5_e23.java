package tp5;
/*Hacer un programa que invierta el orden de la última secuencia
en un arreglo.*/
public class Tp5_e23 {
	public static final int MAX = 20;
	public static void main (String [] args) {
		int [] arrint = {0, 0, 0, 5, 3, 2, 0, 0, 5, 2, 0, 0 ,0, 4, 3, 5, 6, 0, 0, 0};
		invertir_oden_ult_sec(arrint);
		imprimir_arr_sec(arrint);
	}
	public static void imprimir_arr_sec(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
			System.out.print("\n");
	}
	public static void invertir_oden_ult_sec(int [] arrint) {
		int ini=0, fin=MAX-1;
		if(ini < MAX) {
			ini = obt_ini_sec(arrint, fin);//busco desde el final del arr(ini es fin)
			fin = obt_fin_sec(arrint, ini); //busco desde el final del arr(fin es ini)
			invertir_orden_sec(arrint, ini, fin);
		}
	}
	public static void invertir_orden_sec(int [] arrint, int ini, int fin) {
        while (fin < ini) { //fin contiene el valor de inicio mirando el arr desde izquierda a derecha
            int temp = arrint[fin]; //guardar en temp mi primer valor del inicio
            arrint[fin] = arrint[ini];//el primer valor de la sec se transforma en el ultimo
            arrint[ini] = temp;//el ultimo valor pasa a valer lo que estaba en el primero
            fin++;
            ini--;
        }
        
	}
	public static int obt_ini_sec(int [] arrint, int ini) {
		while(ini < MAX && arrint[ini] == 0) {
			ini--;
		} return ini;
	}
	public static int obt_fin_sec(int [] arrint, int ini) {
		int indice=-1;
		while(ini > indice && arrint[ini] != 0) {
			ini--;
		} return ini+1;
	}
}
