package tp3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3_e16 {
	public static void main(String[] args) {
		int mes_ingresado=obtNumMes();
		corroborarMes(mes_ingresado);
	}
	public static int obtNumMes() {
		int num=0;
			BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
			try {
				while(num == 0) {
					System.out.println("Ingrese un numero de mes: ");
					num = Integer.valueOf(entrada.readLine());
				}
			} catch (Exception exc) {
					System.out.println( exc );
			}			
		return num;
	}
	
	public static void corroborarMes(int mes_ingresado) {
		switch(mes_ingresado) {
			case 1:
				System.out.println("Enero: 31 dias");
				break;
			case 2:
				System.out.println("Febrero: 28 dias");
				break;
			case 3:
				System.out.println("Marzo: 31 dias");
				break;
			case 4:
				System.out.println("Abril: 30 dias");
				break;
			case 5:
				System.out.println("Mayo: 31 dias");
				break;
			case 6:
				System.out.println("Junio: 30 dias");
				break;
			case 7:
				System.out.println("Julio: 31 dias");
				break;
			case 8:
				System.out.println("Agosto: 31 dias");
				break;
			case 9:
				System.out.println("Septiembre: 30 dias");
				break;
			case 10:
				System.out.println("Octubre: 31 dias");
				break;
			case 11:
				System.out.println("Noviembre: 30 dias");
				break;
			case 12:
				System.out.println("Diciembre: 31 dias");
				break;	
			default:
				System.out.println("Ingreso un numero de mes no valido");	
		}
		obtNumMes();
	}	
}



