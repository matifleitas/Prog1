package tp2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2_e19 {
	public static void main (String [] args) {
		int num_mes_user = 0;
		int febrero = 2;
		int num_anio_user = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		while (num_mes_user == 0) {
		try {
			System.out.println("Ingresar el numero de un mes: ");
			num_mes_user = Integer.valueOf(entrada.readLine());
			
			if(num_mes_user == febrero) {
				System.out.println("Ingresar un numero de año entre 2000 y 2019: ");
				num_anio_user = Integer.valueOf(entrada.readLine());
				if((num_anio_user>=2000)&&(num_anio_user<=2019)) {
					if((num_anio_user % 4 == 0) && ((num_anio_user % 100 != 0) || (num_anio_user % 400 == 0))) {
					  System.out.println("febrero: 29 dias");
				  } else {
					  System.out.println("febrero: 28 dias");
				  }
				}
			}
			switch(num_mes_user) {
				case 1: System.out.println("enero: 31 dias"); break;
				case 3: System.out.println("marzo: 31 dias"); break;
				case 4: System.out.println("abril: 30 dias"); break;
				case 5: System.out.println("mayo: 31 dias"); break;
				case 6: System.out.println("junio: 30 dias"); break;
				case 7: System.out.println("julio: 31 dias"); break;
				case 8: System.out.println("agosto: 31 dias"); break;
				case 9: System.out.println("septiembre: 30 dias"); break;
				case 10: System.out.println("octubre: 31 dias"); break;
				case 11: System.out.println("noviembre: 30 dias"); break;
				case 12: System.out.println("diciembre: 31 dias"); break;
			}
			if(num_mes_user > 12)  {
				System.out.println("No se ingreso un numero de mes"+"\n");
			}
			num_mes_user = 0;
			
		} catch (Exception exc) {
			System.out.println( exc );
		}
	}
}

	
}
