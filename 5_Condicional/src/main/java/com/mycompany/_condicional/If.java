/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._condicional;

/**
 *
 * @author Proyecto2020
 */
public class If {

    public static void main(String[] args) {
        int numUno = 5;
        int numDos = 10;
        int valor = numUno;
        
        if(numUno > numDos){
            System.out.println("El valor numUno es mayor a numDos");
        } else{
            System.out.println("El valor numDos es mayor a numUno");
        }
        
        
        for(int i = 0 ; i < 2 ; i++){
           
            if( i == 1 ){
                valor = numDos;
            }
                       
            if( valor > 5 ){
                System.out.println("El valor es mayor a 5 - valor actual = " + valor);
            } else{
                System.out.println("El valor es menor a 5 - valor actual = " + valor);
            }
        }
    }
}
