//Definir una función que tome como parámetros dos tablas,
//la primera con los 6 números de una apuesta de la primitiva, y la segunda con los 6 números de la combinación ganadora.
//La función devolverá el número de aciertos

package tablas1al7;

import java.util.Scanner;
import java.util.Arrays;

public class Tablas1al7 {

 
    public static void main(String[] args) {
        int combinacionGanadora[] = {3, 13, 25, 33 , 41, 48};
        int apuesta[] = {3, 25, 41, 42, 45, 49};
        System.out.println("Aciertos: " + primitiva (combinacionGanadora, apuesta));
    }
    
    static int primitiva(int apuesta[], int premiado[]){
        int aciertos = 0;
        
        for (int a: apuesta){
            
            if (Arrays.binarySearch(premiado, a) >=0) {
                aciertos++;
            }
        }
        return (aciertos);
    }
    }
      