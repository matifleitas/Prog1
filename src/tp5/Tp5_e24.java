package tp5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp5_e24{
	
	public static final int MAX = 20;
	public static void main (String [] args) {
		int [] arrint = {0, 0, 2, 3, 4, 0, 0, 0, 2, 3, 6, 7, 5, 0, 0, 3, 4, 5, 0, 0};
		
		int num = obtenerPosicionValida();
		obt_pos_de_sec(arrint, num);
	}
	public static void obt_pos_de_sec(int [] arrint, int num) {
		int ini=0, fin=-1;

		if (arrint [num] == 0) {
            System.out.println("No hay secuencia en esa pos");
        } 
		else {	
	        while (arrint[num] != 0) {
	            num--; //decremento hasta ini - 1, y asi poder aplicar obt_ini desde el principio
	        }
	        ini = obt_ini_sec(arrint, num);
	        fin = obt_fin_sec(arrint, ini);
	        imprimir_posiciones(ini, fin);
        }
	}
	public static void imprimir_posiciones(int ini, int fin) {
		System.out.println("La pos de inicio es: "+ini+" y la pos de fin es: "+fin);
		
	}
	public static int obt_ini_sec(int [] arrint, int ini) {
		while(ini < MAX && arrint[ini] == 0) {
			ini++;
		} return ini;
	}
	public static int obt_fin_sec(int [] arrint, int ini) {
		while(ini < MAX && arrint[ini] != 0) {
			ini++;
		} return ini - 1;
	}
	
	public static int obt_num_user() {
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingresar un numero enteroe entre 0 y 19: ");
			num = Integer.valueOf(entrada.readLine());
			
		} catch(Exception exc) {
			System.out.println( exc );
		}
		return num;
	}
    public static int obtenerPosicionValida(){
        int numero = -1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while(numero < 1 || numero > MAX-2){
            try{
                System.out.println("Ingrese una posición mayor a 0 y menor a " + (MAX-1)+": ");
                numero = Integer.valueOf(entrada.readLine()); 
                System.out.println(numero);
            }
            catch(Exception exc ){
                System.out.println( exc );
            }
        }
        return numero;
      }
}