package org.example;

import java.util.Scanner;

public class Vector {
    private Scanner teclado = new Scanner(System.in);

    public Vector() {
    }

    public void ejecutarEjercicio(){
        //Declaración de vectores
        int vector [] = new int [3]; //sin definir el límite de posisiones

        //Asignación (manual)
        /*
        vector[0] = 10;
        vector[1] = 20;
        vector[2] = 30;
         */

        //carga del vector
        for(int i = 0; i < vector.length ; i++ ){
            System.out.println("Ingrese el valor númerico para el índice: " + i);
            vector[i] = this.teclado.nextInt();
        }


        //recorrido del vector
        for(int i = 0; i < vector.length ; i++ ){
            System.out.println("Posicion ["+ i +"]: " + vector[i]);
        }

        System.out.println("--------------------    Fin clase arrays    --------------------");
    }
}
