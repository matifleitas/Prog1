package tp3;

public class Tp3_e5 {
	public static void main(String[] args) {
		imprimir_num();
		System.out.println("Termino");
	}
	public static void imprimir_num() {
		final int num_MAX = 4;
			for(int num=1; num<=num_MAX; num++) {
				System.out.println("Numero: "+ num);
			}
		}
}