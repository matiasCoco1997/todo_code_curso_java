package com.mycompany._ejerciciospracticos;

import java.util.Scanner;

public class EjerciciosPracticos {

    public static void main(String[] args) {
        int seleccion = -1;
        
        Scanner teclado = new Scanner(System.in);
        
        
        while(seleccion != 0){
            System.out.println("\n\n-----   Seleccione una opcion  -----");
            System.out.println("1) Ejecutar ejercicio 1.");
            System.out.println("2) Ejecutar ejercicio 2.");
            System.out.println("3) Ejecutar ejercicio 3.");
            System.out.println("4) Ejecutar ejercicio 4.");
            System.out.println("5) Ejecutar ejercicio 5.");
            System.out.println("0) Salir.");
            
            seleccion = teclado.nextInt();
            
            switch(seleccion){
                
                case 0:
                    System.out.println("-----   Finalizado  -----");
                    break;
                    
                case 1:
                    EjercicioUno ejercicioUno = new EjercicioUno(teclado);
                    ejercicioUno.ejecutarEjercicio();
                    break;
                    
                case 2:
                    System.out.println("1) Ejecutar ejercicio 1.");
                    break;
                    
                case 3:
                    System.out.println("1) Ejecutar ejercicio 1.");
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                default:
                    break;
            }
        }
    }
}
