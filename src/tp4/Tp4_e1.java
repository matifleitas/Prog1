package tp4;

public class Tp4_e1 {
	public static void main(String[] args) {
	int numero = 3;
	obtenerFactorial(numero);
	}
		
	public static int obtenerFactorial(int numero){
		// obtiene el factorial de numero
		int resultado=numero;

		while (numero>0) {
			resultado*=--numero; //el error esta en que numero decrementa su resultado
		}
		System.out.println(resultado+" - "+numero);
		return resultado;
	}
	
	public static int obtenerSumatoria(int natural){
		// obtiene la sumatoria de los primeros n naturales
		int resultado=1;
		while (natural>0)
		resultado+=natural--;
			return resultado;
		}
}
