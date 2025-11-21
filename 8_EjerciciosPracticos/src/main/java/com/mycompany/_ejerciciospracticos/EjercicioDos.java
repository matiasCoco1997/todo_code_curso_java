
package com.mycompany._ejerciciospracticos;

import java.util.Scanner;

/*
    Realizar un programa que muestre por pantalla los números
    del 200 al 250 saltando de dos en dos
    La secuencia deberia ser: 200...202...204...etc
*/
public class EjercicioDos {
    private Scanner teclado;
    private int inicio = 200;
    private int limite = 250;

    public EjercicioDos(Scanner teclado) {
        this.teclado = teclado;
    }
    
    public void ejecutarEjercicio(){      
        while(inicio <= limite){
            System.out.println(inicio);
            inicio = inicio + 2;
        }   
    }
    
}
