package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3_e14 {
	public static void main(String[] args) {
		char char_user=obt_caract_user();
		obt_caract_valido(char_user);
	}
	
	public static char obt_caract_user() {
		char caracter=' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
		} catch (Exception exc) {
			System.out.println( exc );
		}
		return caracter;
	}
	public static void obt_caract_valido(char char_user) {
		while(char_user != '*') {
			imprimir_tipo_caract(char_user);
			char_user=obt_caract_user();
		}
		System.out.println("caracter: '*', no es valido");
	}
	public static void imprimir_tipo_caract(char char_user){
		if(char_user>='a'&&char_user<='z') {
			System.out.println(char_user+": Es caracter minuscula");
			switch(char_user) {
				case 'a': case'e': case 'i': case'o': case 'u':
				System.out.println("Es un caracter minuscula vocal"+"\n");
				break;
				default:
				System.out.println("Es consonante"+"\n");
			}
		}
		else if(char_user>='0'&&char_user<='9') {//poner los numeros entre '9' pq son digitos
			System.out.println(char_user+": Es caracter digito"+"\n");
		}
		else {
			System.out.println("Otro caracter");
		}
	}
}
