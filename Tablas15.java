//Escribir la función rellenaPares () a la que se le pasa como  parámetro  una  tabla que debe rellenar de la siguiente forma: 
//se leerá por teclado una serie de números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares.
//La función tiene que devolver la cantidad de impares desechados.

package tablas1al7;

import java.util.Scanner;
import java.util.Arrays;

public class Tablas1al7 {

 
    public static void main(String[] args) {
        int t[] = {2, 5, 5, -3, 0};
        int ignorados = rellenaPares(t);
        
        System.out.println("El número de impares ignorados es de: " + ignorados);
        System.out.println(Arrays.toString(t));
    }
    static int rellenaPares(int pares[]){
        Scanner sc = new Scanner(System.in);
        
        int i= 0;
        int imparesIgnorados = 0;
        
        while (i < pares.length){
            System.out.print("Introduzca un número: ");
            int num = sc.nextInt();
            if (num%2 ==0){
                pares[i] = num;
                i++;
            } else {
                imparesIgnorados++;
            }
        }
        return(imparesIgnorados);
            }
        }
    