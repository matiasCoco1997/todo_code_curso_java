
package com.mycompany._ejerciciointegrador;


public class Supervisor extends Empleado {
    
    private double porcentajeJubilacion = 0.11;
    private double jubilacion;
    
    public Supervisor(String NombreEmpleado, String Categoria) {
        double salarioSupervisor = 35560.20;
        super(NombreEmpleado, Categoria, salarioSupervisor);
        this.jubilacion = super.getSalario() * porcentajeJubilacion;
    }

    public double getSalarioTotal() {
        return super.getSalario() - this.jubilacion;
    }
    
    
    
    
    
}
