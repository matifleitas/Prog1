package tp5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Bonus_track_1_Tp5 {
	public static final int MAX = 20;
	public static void main(String[] args) {
		double [] arr = {0, 0, 3, 24, 203.56, 0, 0, 99, 2, 87.5, 0, 0, 0, 0, 12, 8,1233.4, 0, 0, 0};
		double importe = obt_valor();
		analisis_fin_semana(arr, importe);
	}
	public static void analisis_fin_semana(double [] arr, double importe) {
		int ini = 0, fin = -1;
		double cant_tickets=0, sum_importes=0, mayor_importe=0, mayor_cant_art=0;
		double menor_importe=2147483647, prom_importe = 0, ticket_cant_art = 2147483647, contador_tickets_mayor=0;
		while(ini < MAX) {
			ini=obt_ini_sec(arr, fin+1);
			int articulo = ini+1;
			if(ini < MAX) {
				fin=obt_fin_sec(arr, ini);
				double importe_ticket = arr[fin];
				cant_tickets++;
				sum_importes += importe_ticket;
				
				if(importe_ticket > mayor_importe) {
					mayor_importe = arr[ini];
				}
				if(arr[articulo] > mayor_cant_art) {
					mayor_cant_art = arr[articulo];
				}
				if(arr[articulo] < ticket_cant_art) {
					ticket_cant_art = arr[articulo];
				}
				if(importe_ticket < menor_importe) {
					menor_importe = importe_ticket;
				}
				if(importe < importe_ticket) {
					contador_tickets_mayor++;
				} 
				System.out.println("Contiene: "+arr[articulo]+" articulos");
				}
			prom_importe = sum_importes/2;
		}
		System.out.println("Promedio de venta por ticket es de: "+prom_importe+"\n");
		System.out.println("a)Se emitieron: "+cant_tickets+"\n");
		System.out.println("b)El importe total de ventas fue de: "+sum_importes+"\n");
		System.out.println("c)El id del ticket, de mayor importe es: "+mayor_importe+"\n");
		System.out.println("d)La mayor cantidad de articulos vendidos fue: "+mayor_cant_art+"\n");
		System.out.println("h)El menor importe fue de: "+menor_importe);
		System.out.println("i)Ticket con menor cantidad de articulos vendidos tuvo un total de: "+ticket_cant_art+"\n");
		System.out.println("La cantidad de tickets con importe mayor a: "+importe+" es, "+contador_tickets_mayor+"\n");
	}
	public static int obt_ini_sec(double [] arr, int ini) {
		while(ini<MAX && arr[ini] == 0.0) {
			ini++;
		} return ini;
	}
	public static int obt_fin_sec(double [] arr, int ini) {
		while(ini<MAX && arr[ini] != 0.0) {
			ini++;
		} return ini-1;
	}
	
	public static double obt_valor() {
		double valor = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un importe: ");
			valor = Double.valueOf(entrada.readLine());
		} catch (Exception exc) {
			System.out.println( exc );
		}
		return valor;
	}
}
