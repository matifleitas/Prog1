package tp5;

import java.util.Random;

public class Tp5_e4 {
	public static final int MAX = 10;
	public static void main (String[] args) {
		char [] arrchar = new char [MAX];
		cargar_arr_aleatorio_char(arrchar);
		int pos = obt_pos_char_f(arrchar);
		imprimir_arreglo_char(arrchar);
		if(pos < 10) {
			System.out.println("La posicion en el arreglo donde se encuentra el caracter f es en el: "+pos);
		}else {
			System.out.println("El caracter f no esta en el arreglo");
		}
	}
	public static void cargar_arr_aleatorio_char(char [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(char)(r.nextInt(26) + 'a');
		}
	}
	public static int obt_pos_char_f(char [] arrchar) {
		char caract_buscado = 'f';
		int pos_char = 0;
		int pos = 0;
		while(pos < MAX) {
			if(arrchar[pos] == caract_buscado) {
				pos = pos_char;
			}
			pos++;
		}
		return pos_char;
	}
	public static void imprimir_arreglo_char(char [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
}
