
package com.mycompany._ejerciciospracticos;

import java.util.Scanner;

/*
 *  Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado
    hasta que se ingrese la plabra "salir"
 */
public class EjercicioTres {
    private Scanner teclado = new Scanner(System.in);
    private String palabra = "";

    public EjercicioTres() {
    }
    
    public void ejecutarEjercicio(){
        System.out.println("Ingrese una palabra o ingrese 'salir' para volver al incio");
        while( !palabra.equals("salir") ){
            if(!palabra.isBlank()){
                System.out.println("La palabra ingresada fue: " + this.getPalabra());   
                System.out.println("Ingrese una palabra");
            }
            
            this.setPalabra(teclado.nextLine());
        }
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    } 

    public String getPalabra() {
        return palabra;
    }

}
