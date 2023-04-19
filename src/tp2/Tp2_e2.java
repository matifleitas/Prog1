package tp2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e2 {
	public static void main (String[] args) {
		int num_mes = 0;
		int num_anio = 0;
		boolean bisiesto = false;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el numero de un mes: ");
			num_mes = Integer.valueOf(entrada.readLine());
			if(num_mes == 2) {
				System.out.println("Ingresar numero del anio: ");
				num_anio = Integer.valueOf(entrada.readLine());
				if((num_anio % 4 == 0) && ((num_anio % 100 != 0) || (num_anio % 400 == 0))) {
					bisiesto = true;
					System.out.println("El anio es bisisesto");
				} else {
					System.out.println("El anio no es bisiesto");
				}
			}
			switch (num_mes) {
			case 1: 
				System.out.println("Enero: 31 dias");break;
			case 2: 
				System.out.println("Febrero: 28 dias");break;
			case 3: 
				System.out.println("Marzo: 31 dias");break;
			case 4: 
				System.out.println("Abril: 30 dias");break;
			case 5: 
				System.out.println("Mayo: 30 dias");break;
			case 6: 
				System.out.println("Junio: 31 dias");break;
			case 7: 
				System.out.println("Julio: 31 dias");break;
			case 8: 
				System.out.println("Agosto: 31 dias");break;
			case 9: 
				System.out.println("Septiembre: 30 dias");break;
			case 10: 
				System.out.println("Octubre: 31 dias");break;
			case 11: 
				System.out.println("Noviembre: 30 dias");break;
			case 12: 
				System.out.println("Diciembre: 31 dias");break;
			default: 
				System.out.println("No existe mes con el numero "+num_mes);
			}
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
}
