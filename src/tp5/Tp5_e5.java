package tp5;

public class Tp5_e5 {
	public static final int MAX = 10;
	public static void main (String[] args) {
		char [] arrchar = {'r', 'w', 'v', 'a', 's', 'f', 'b', 'n', 'm', 'z'};
		invertir_arreglo(arrchar);
		imprimir_arrchar(arrchar);
	}
	public static void imprimir_arrchar(char [] arrchar){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arrchar[pos]);
		}
	}
    public static void invertir_arreglo(char[] arrchar) {
    	int pos_fin = MAX-1;
        for (int pos = 0; pos < MAX / 2; pos++) { // se divide por 2 para cortar en la mitad
        	char temp = arrchar[pos_fin]; //guardar en temp, lo que esta en la pos[9]
        	arrchar[pos_fin] = arrchar[pos];// tiene que estar en la pos[9] lo que esta en la pos[0]
        	arrchar[pos] = temp;// tiene que estar en la pos[0] lo que esta en la pos[9] 
        	pos_fin--; //resto 1 para que la variable final para la sig sentencia
        }
    }
}

