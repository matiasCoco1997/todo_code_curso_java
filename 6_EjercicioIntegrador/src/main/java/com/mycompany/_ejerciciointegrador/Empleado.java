package com.mycompany._ejerciciointegrador;

public class Empleado {
    private String Categoria;
    private String NombreEmpleado;
    private double salario;
    
    public Empleado(String NombreEmpleado, String Categoria,  double salario) {
        this.NombreEmpleado = NombreEmpleado;
        this.Categoria = Categoria;
        this.salario = salario;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
