package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        //Declaración de vectores
        int vector [] = new int [3]; //sin definir el límite de posisiones

        //Asignación (manual)
        /*
        vector[0] = 10;
        vector[1] = 20;
        vector[2] = 30;
         */

        Scanner teclado = new Scanner(System.in);

        //carga del vector
        for(int i = 0; i < vector.length ; i++ ){
            System.out.println("Ingrese el valor númerico para el índice: " + i);
            vector[i] = teclado.nextInt();
        }


        //recorrido del vector
        for(int i = 0; i < vector.length ; i++ ){
            System.out.println("Posicion ["+ i +"]: " + vector[i]);
        }
    }
}