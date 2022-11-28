//Crear una tabla bidimensional de tamaño 5 x 5 y rellenarla de la siguiente forma: la posición [n, m] debe contener n + m.
Después se debe mostrar su contenido

package tablas1al7;

import java.util.Scanner;

public class Tablas1al7 {

 
    public static void main(String[] args) {
        int t [] [];
        t = new Int[5][5];
        
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++){
        t[i][j] = i + j;
        
    }
}
System.out.println("Tabla: ");
for (int i = 4; i >= 0; i--){
    System.out.println();
    for (int j = 0; j < 5; j++){
        System.out.println(t[i][j]+ " ");
    }
}
    }
}