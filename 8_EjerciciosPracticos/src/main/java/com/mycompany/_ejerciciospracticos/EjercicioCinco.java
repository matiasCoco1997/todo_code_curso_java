package com.mycompany._ejerciciospracticos;
import java.util.Scanner;

/*
 * Enunciado: Crear un arbolito navideño con "*" de 4 niveles.
 * El primer nivel debera tener un solo asterisco, el segundo nivel debera tener 3 asteriscos, el tercer nivel
 * debera tener 5 asteriscos y por último el cuarto nivel debera tener 7 asteriscos.
 * Pista, el tablero es de 7 espacios x 7 espacios
 * */

public class EjercicioCinco {
    private int altura;
    private Scanner teclado;

    public EjercicioCinco(Scanner teclado) {
        this.teclado = teclado;
    }

    public void ejercutarEjercicio (){

        System.out.println("Ingrese el valor de altura del arbol navideño o 0 para salir:");
        setAltura(Integer.parseInt(teclado.nextLine()));

         while (this.getAltura() > 0 ){
             for(int filas = 0; filas < this.altura; filas++){

                 for(int espacios = 0; espacios < (altura - filas - 1); espacios++){
                     System.out.print(" ");
                 }

                 for(int asteriscos = 0; asteriscos < ((filas*2) + 1); asteriscos++){
                     System.out.print("*");
                 }

                 System.out.println("");
             }

             System.out.println("Ingrese el valor de altura del arbol navideño o 0 para salir:");
             setAltura(Integer.parseInt(teclado.nextLine()));
         }

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
