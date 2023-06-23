package tp6;

public class e14_que_anda {
    public static final int MAXFILA = 3;
    public static final int MAXCOLUMNA = 9;    
    public static void main (String [] args){
    char [] arrPa =           {' ',' ',' ','a','b','c','d',' ',' '};

    char [][] matChar = {     {' ','a','b',' ','a','b','d','c',' '} ,
                              {' ','a','b',' ','a','b','c','e',' '},
                              {' ','a','b',' ','a','b','c','d',' '}             
                            };
    imprimir_matriz(matChar);
    //imprimir_arr(arrPa);

        for(int fila = 0; fila<MAXFILA; fila++){
            encontrar_secuencias(matChar[fila], arrPa);
        }                    
        imprimir_matriz(matChar);



    }

    public static void encontrar_secuencias(char [] arr, char [] arrPa){
        int inicio =0;
        int fin =0;
        int inicio_pa= buscar_ini_secuencia(arrPa, fin);
        int fin_pa = buscar_fin_secuencia(arrPa, inicio_pa);
        int tamaño;
        int tamaño_p = fin_pa-inicio_pa+1;
        while(inicio<MAXCOLUMNA){
            inicio = buscar_ini_secuencia(arr, fin+1);
            if(inicio<MAXCOLUMNA){
                fin = buscar_fin_secuencia(arr, inicio);
                tamaño = fin-inicio+1;
                if(tamaño == tamaño_p){
                    if(encontrar_sec_iguales(arr,inicio, fin, arrPa, inicio_pa)){
                        eliminar_secuencias(arr,inicio, fin);
                        fin = inicio-2;
                    }    
                }
            }
        //System.out.println(fin);
        }
        
    }


    public static boolean encontrar_sec_iguales(char [] arr, int inicio, int fin, char [] arrPa, int inicio_pa){
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
        while(pos<MAXCOLUMNA && arr[pos] == ' '){
            pos++;
        }return pos;
    }

    public static int buscar_fin_secuencia(char [] arr, int pos){
        while(pos<MAXCOLUMNA && arr[pos] != ' '){
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