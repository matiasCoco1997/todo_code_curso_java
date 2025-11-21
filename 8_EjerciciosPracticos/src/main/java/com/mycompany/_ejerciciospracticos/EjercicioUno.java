package com.mycompany._ejerciciospracticos;

import java.util.Scanner;

public class EjercicioUno {
    /*
        Realizar un programa que dado por teclado un límite numérico por teclado
        (por ejemplo 100) muestre en pantalla todos lso números hasta ese límite (empezando por 1).
    */
    private int ultimoNumero;
    private Scanner teclado;

    public EjercicioUno(Scanner teclado) {
        this.teclado = teclado;
    }
        
    public void ejecutarEjercicio(){
        System.out.println("Ingrese el limite (valor numerico):");
        this.ultimoNumero = this.teclado.nextInt();
        
        for( int i = 1 ; i <= ultimoNumero; i++){
            System.out.println(i);
        } 
    }
        
}
