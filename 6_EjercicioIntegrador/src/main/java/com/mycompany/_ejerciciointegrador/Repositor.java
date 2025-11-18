
package com.mycompany._ejerciciointegrador;

public class Repositor extends Empleado {
    //Los repositores cobran $15.890 + bono del 10%.
    
    private double bono;
    private double porcentajeBono = 0.1;
    
    public Repositor(String NombreEmpleado, String Categoria) {
        double salarioRepositor = 15.890;
        super(NombreEmpleado, Categoria, salarioRepositor);
        this.bono = super.getSalario() * porcentajeBono;
    }
    
    public double getSalarioTotal() {
        return super.getSalario() + this.bono;
    }
}
