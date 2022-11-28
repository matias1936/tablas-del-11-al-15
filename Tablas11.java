//Escribir un programa que solicite los elementos de una matriz de tamaño 4 x 4.
//La aplicación debe decidir si la matriz introducida corresponde a una matriz mágica,
//que es aquella donde la suma de lo elementos de cualquier fila o de cualquier columna vale lo mismo.

package tablas1al7;

import java.util.Scanner;

public class Tablas1al7 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int patron = 0;
        final int TAM = 4;  
        int matriz [] [] = new int[TAM] [TAM];
        
for (int i = 0;  i < TAM; i++) {
    for (int j = 0; j < TAM; j++) {
        System.out.print("Elemento [" + i + "][" + j + "]: ");
        matriz [i] [j]= sc.nextInt();
    }
}

boolean esMagica = true;
for (int c = 0; c < TAM; c++){
    patron +=matriz [0][c];
}
for (int c = 0; c < TAM: c++) {
        int sumaColumna = 0;
        for (int f = 0; f < TAM; f++    ) {
            sumaColumna += matriz [f][c];
        }
        if (sumaColumna != patron){
            esMagica = false;
            
        }
        }
for (int f = 0; f < TAM; f++){
    int sumaFila = 0;
    for (int c = 0; c< TAM; c++){
        sumaFila += matriz[f][c];
        
    }
    if (sumaFila != patron){
        esMagica = false;
        
    }
}
if (esMagica) {
    System.out.println("La Matriz es mágica. ");
} else {
    System.out.println("La matriz no es mágica. :(");
    
}
    }
}
