package com.mycompany._ejerciciointegrador;

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
        
        System.out.println( "El empleado " + repositor.getNombreEmpleado() + 
                            " posee la categoria " + repositor.getCategoria() +
                            " y tiene un salario de " + repositor.getSalarioTotal());
        
        System.out.println( "El empleado " + supervisor.getNombreEmpleado() + 
                            " posee la categoria " + supervisor.getCategoria() +
                            " y tiene un salario de " + supervisor.getSalarioTotal());
        
        System.out.println( "El empleado " + cajero.getNombreEmpleado() + 
                            " posee la categoria " + cajero.getCategoria() +
                            " y tiene un salario de " + cajero.getSalario());
        
    }
}
