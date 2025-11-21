package com.mycompany._ejerciciospracticos;

import java.util.Scanner;

/*
    En la ciudad de Oberá, Misiones se realiza año a año la "Maratón del inmigrante"
    en el marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones el dia anterior
    a la carrera, por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber.
    Desde la Federación de Colectividades (Organismo que organiza), manifestaron que se solicitan los siguientes datos
    para la inscripción de cada participante: DNI, Nombre y Edad.
    En cuanto a las categorias posibles para una inscripción, se manejan las siguientes:

    Menores A (de 6 a 10 años)
    Menores B (de 11 a 17 años)
    Juveniles (de 18 a 30 años)
    Adultos   (de 31 a 50 años)
    Adultos mayores (mayores de 50 años)

    Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla
    a qué categoría debe ser inscripto. Cabe destacar que, al finalizar el día, para dar fin a las inscripciones,
    se debe ingresar un dni con el valor 0 y un nombre con la palabra "fin".

*/
public class EjercicioCuatro {
    
    private String nombre;
    private int edad;
    private int dni;
    private Scanner teclado;

    public EjercicioCuatro(Scanner teclado) {
        this.teclado = teclado;
    }
    
    
    
    public void ejecutarEjercicio(){
        String nombreIngresado = "nombre";
        int dniIngresado, edadIngresada;
        
        
        while( this.getDni() != 0 && !this.getNombre().equals("fin")){
            
            while( nombreIngresado.isBlank() ){
                System.out.println("Ingrese un nombre");
                nombreIngresado = teclado.nextLine();

                if( !nombreIngresado.isBlank() ){
                    setNombre(nombreIngresado);
                } else{
                    System.out.println("Ingrese un nombre valido");
                }
            }
            
            System.out.println("Ingrese un numero de dni");
            dniIngresado = teclado.nextInt();
            setNombre(nombreIngresado);


            if( this.getDni() == 0 && this.getNombre().equals("fin") ){

            }
        }
    }
    
    
    private void setEdad(int edad){
        this.edad = edad;
    }
    
    private void setDni(int dni){
        this.dni = dni;
    }
    
    private void setNombre(String nombre){
       this.nombre = nombre; 
    }

    private String getNombre() {
        return this.nombre;
    }

    private int getEdad() {
        return this.edad;
    }

    private int getDni() {
        return this.dni;
    }
}
