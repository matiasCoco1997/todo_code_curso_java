package org.example;

import java.util.Scanner;

public class Matriz {
    private int matris [][] = new int [3][3];
    private Scanner teclado = new Scanner(System.in);

    public Matriz() {

    }


    public void ejecutarEjercicio(){
        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un valor en la fila = "+ i +"  | columna = " + j);
                matris[i][j]=teclado.nextInt();
            }
        }

        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor en la fila = "+ i +" y columna = " + j +" es de: " + matris[i][j]);
            }
        }
    }
}
