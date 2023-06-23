package tp6;

public class e14_que_anda {
    public static final int MAXFILA = 3;
    public static final int MAXCOLUMNA = 9;  
    public static final char SEPARADOR = ' ';
    public static void main (String [] args){
    char [] arrPa =           {' ',' ',' ','a','b','c','d',' ',' '};

    char [][] matChar = {     {' ','a','b',' ','a','b','d','c',' '} ,
                              {' ','a','b',' ','a','b','c','e',' '},
                              {' ','a','b',' ','a','b','c','d',' '}             
                            };
    imprimir_matriz(matChar);
    System.out.println("-------------------");

    encontrar_secuencias(matChar, arrPa);             
    imprimir_matriz(matChar);
    }

    public static void encontrar_secuencias(char [][] matChar, char [] arrPa){
        for(int fila = 0; fila<MAXFILA; fila++){
    	int inicio =0, fin =0;
        while(inicio<MAXCOLUMNA){
            inicio = buscar_ini_secuencia(matChar[fila], fin+1);
            if(inicio<MAXCOLUMNA){
                fin = buscar_fin_secuencia(matChar[fila], inicio);
              
                if(es_secPatron(matChar[fila],inicio, fin, arrPa)){
                    eliminar_secuencias(matChar[fila],inicio, fin);
                    fin = inicio-2;
                    }    
                }
            }
        }
    }
    public static boolean es_secPatron(char [] arr, int inicio, int fin, char []arrPa) {
    	boolean es_patron=false;
    	int iniPat=0, finPat=-1;
    	while(inicio<MAXCOLUMNA){
            iniPat = buscar_ini_secuencia(arrPa, finPat+1);
            if(inicio<MAXCOLUMNA){
                finPat = buscar_fin_secuencia(arrPa, iniPat);
                if(fin-inicio+1==finPat-iniPat+1 && son_iguales(arr, inicio, fin, arrPa, iniPat)) {
                	es_patron = true;
                }
            }
    	}
    	return es_patron;
    }


    public static boolean son_iguales(char [] arr, int inicio, int fin, char [] arrPa, int inicio_pa){
        while(inicio<=fin && arr[inicio] == arrPa[inicio_pa]){
            inicio++;
            inicio_pa++;
        }return inicio>fin;
    }

    public static void eliminar_secuencias(char[] arr, int inicio, int fin){
        for(int i = inicio; i<=fin; i++){
            corrimiento_a_izq(arr, inicio);
            
        }
    }

    public static void corrimiento_a_izq(char [] arr, int inicio){
        while(inicio<MAXCOLUMNA-1){
            arr[inicio] = arr[inicio +1];
            inicio++; 
        }
    }

    public static int buscar_ini_secuencia(char [] arr, int pos){
        while(pos<MAXCOLUMNA && arr[pos] == SEPARADOR){
            pos++;
        }return pos;
    }

    public static int buscar_fin_secuencia(char [] arr, int pos){
        while(pos<MAXCOLUMNA && arr[pos] != SEPARADOR){
            pos++;
        }return pos-1;
    }

    public static void imprimir_matriz(char [][] matChar){
        for(int fila =0; fila<MAXFILA; fila++){
            imprimir_arr(matChar[fila]);
            System.out.println("");
        }
    }

    public static void imprimir_arr(char [] arr){
        for (int  pos= 0; pos<MAXCOLUMNA; pos++){
            System.out.print(arr[pos]+"|");
        }
    }

}