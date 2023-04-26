package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e20 {
	public static void main (String[] args) {
		int num_user;
		final int cant_MAX = 5;
		int num_negativo1, num_negativo2;
		int positivo1, positivo2, positivo3, positivo4, positivo5;
		char char_user;
		String text_user;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Ingresar un numero(0 para salir): ");
			num_user = Integer.valueOf(entrada.readLine());
			
			while(num_user != 0) {
				System.out.println("Ingrese un caracter que sea 'a', 'b' o 'c': ");
				char_user = entrada.readLine().charAt(0);
		
				if(char_user == 'a') {
					System.out.println("Escribe algo: ");
					text_user = entrada.readLine();
						System.out.println("Lo que escribio fue: "+text_user+"\n");
					num_user = 0;
				} 
				else if (char_user == 'b'){
					for(int i = 0; i<cant_MAX; i++) {
						System.out.println("Ingrese 5 numeros positivos: ");
						positivo1 = Integer.valueOf(entrada.readLine());
						positivo2 = Integer.valueOf(entrada.readLine());
						positivo3 = Integer.valueOf(entrada.readLine());
						positivo4 = Integer.valueOf(entrada.readLine());
						positivo5 = Integer.valueOf(entrada.readLine());
					
						if(positivo1<0||positivo2<0||positivo3<0||positivo4<0||positivo5<0) {
							System.out.println("Uno de los numero ingresado no es positivo"+"\n");
						}
						
						if((positivo1<positivo2)&&(positivo2<positivo3)
						  &&(positivo3<positivo4)&&(positivo4<positivo5)) {
							System.out.println("Fueron ingresados de manera ascendente"+"\n");
						} else {
							System.out.println("No fueron ingresados de manera ascendente"+"\n");
						}
						i=6;
					}
				}
				else if (char_user == 'c'){
					System.out.println("Ingrese dos numeros enteros negativos");
					num_negativo1 = Integer.valueOf(entrada.readLine());
					num_negativo2 = Integer.valueOf(entrada.readLine()); 
					
						if(num_negativo1>=0&&num_negativo2>=0) {
							int multiplicacion_c = (num_negativo1*num_negativo2);
							double raiz_cuadrada = Math.sqrt(multiplicacion_c);
							System.out.println("La raiz cuadrada de la multiplicacion es : "+raiz_cuadrada+"\n");
						} else {
							System.out.println("Error, se ingresaron enteros negativos");
						}
					}
				else if((char_user != 'a')||(char_user!='b')||(char_user!='c')) {
					System.out.println("Error, ingrese otro caracter: "+"\n");
					num_user = 1;
				}
			} 
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
	
}
