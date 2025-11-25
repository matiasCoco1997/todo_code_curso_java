package org.example;

public class Main {
    static void main() {
        //Declaración de vectores
        int vector [] = new int [5]; //sin definir el límite de posisiones

        //Asignación (manual)
        vector[0] = 10;
        vector[1] = 20;
        vector[2] = 30;

        System.out.println("Posicion [0]: " + vector[0]);
        System.out.println("Posicion [1]: " + vector[1]);
        System.out.println("Posicion [2]: " + vector[2]);
    }
}