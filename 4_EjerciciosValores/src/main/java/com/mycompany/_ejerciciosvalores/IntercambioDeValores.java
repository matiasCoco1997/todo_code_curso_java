package com.mycompany._ejerciciosvalores;

public class IntercambioDeValores {

    public static void main(String[] args) {
        
        /*
        ENUNCIADO:
        Realizar un programa que permita el intercambio de valores entre dos variables.
        Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20,
        realizar las acciones necesarias para que numero pase a valer 20 y numero2 pase a valer 35.
        Una vez realizado el cambio mostrar el resultado por pantalla.
        */
        
        int numeroUno = 35;
        int numeroDos = 20;
        int auxiliar = numeroDos;
        
        System.out.println("--------------Valores antes del intercambio--------------");
        System.out.println("Valor numero: " + numeroUno);
        System.out.println("Valor numero2: " + numeroDos);
        
        numeroDos = numeroUno;
        numeroUno = auxiliar;
        
        System.out.println("\n\n--------------Valores despues del intercambio--------------");
        System.out.println("Valor numero: " + numeroUno);
        System.out.println("Valor numero2: " + numeroDos);
    }
}
