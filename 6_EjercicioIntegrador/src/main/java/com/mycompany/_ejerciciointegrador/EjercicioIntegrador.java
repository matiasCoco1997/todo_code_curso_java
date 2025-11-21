package com.mycompany._ejerciciointegrador;

import java.util.Scanner;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        /*
        Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
        de los mismos pueden tener 3 categorias:
            1) Repositor
            2) Cajero
            3) Supervisor
        
        - Los repositores cobran $15.890 + bono del 10%.
        - Los cajeros cobran $25.630,89 fijos
        - Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
        
        Se necesita un programa que, depende del tipo de empleado del que se trate, calcule y
        muestre en pantalla el correspondiente sueldo
        */
        
        Repositor repositor = new Repositor("Matías Coco", "Repositor");
        Supervisor supervisor = new Supervisor ("Mariano Gutierrez", "Supervisor");
        Cajero cajero = new Cajero ("Mariana Costa", "Cajero");
        
        Scanner teclado = new Scanner(System.in);
        int categoria = 20;
        
        
        while(categoria != 0){
            System.out.println("************    Ingrese el tipo de categoria que desea ver  ************");
            System.out.println("1) Repositor");
            System.out.println("2) Supervisor");
            System.out.println("3) Cajero");
            System.out.println("0) Salir");

            categoria = teclado.nextInt();

            switch(categoria){

                case 1:
                    System.out.println( "El empleado " + repositor.getNombreEmpleado() + 
                                " posee la categoria " + repositor.getCategoria() +
                                " y tiene un salario de " + repositor.getSalarioTotal());
                    break;

                case 2:
                    System.out.println( "El empleado " + supervisor.getNombreEmpleado() + 
                                " posee la categoria " + supervisor.getCategoria() +
                                " y tiene un salario de " + supervisor.getSalarioTotal());
                    break;

                case 3:
                    System.out.println( "El empleado " + cajero.getNombreEmpleado() + 
                                " posee la categoria " + cajero.getCategoria() +
                                " y tiene un salario de " + cajero.getSalario());
                    break;
                    
                case 0:
                    System.out.println("Fin de programa");
                    break;

                default:
                    System.out.println("Debe ingresar un numero de categoria valido");
                    break;
            }
            

        }
  
    }
}
