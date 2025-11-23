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
        String nombreAux;
        int dniAux, edadAux;

        //input nombre
        System.out.println("Ingrese un nombre");
        nombreAux = teclado.nextLine();
        setNombre(nombreAux);

        //input dni
        System.out.println("Ingrese un número de dni");
        dniAux = Integer.parseInt(teclado.nextLine());
        setDni(dniAux);

        //input edad
        System.out.println("Ingrese una edad");
        edadAux = Integer.parseInt(teclado.nextLine());
        setEdad(edadAux);
        
        while( this.getDni() != 0 || !this.getNombre().equalsIgnoreCase("fin")){

            /*
                Menores A (de 6 a 10 años)
                Menores B (de 11 a 17 años)
                Juveniles (de 18 a 30 años)
                Adultos   (de 31 a 50 años)
                Adultos mayores (mayores de 50 años)
            */

            if( this.getEdad() >= 6 && this.getEdad() <= 10 ){
                System.out.println("El participante " + this.nombre +
                        "\nDNI: " + this.dni +
                        "\nPertenece a la categoría: Menores A, ya que su edad es: " + this.edad);
            }
            else if( this.edad >= 11 && this.edad <= 17 ){
                System.out.println("El participante " + this.nombre +
                        "\nDNI: " + this.dni +
                        "\nPertenece a la categoría: Menores B, ya que su edad es: " + this.edad);
            }
            else if( this.edad >= 18 && this.edad <= 30 ){
                System.out.println("El participante " + this.nombre +
                        "\nDNI: " + this.dni +
                        "\nPertenece a la categoría: Juveniles, ya que su edad es: " + this.edad);
            }
            else if( this.edad >= 31 && this.edad <= 50 ){
                System.out.println("El participante " + this.nombre +
                        "\nDNI: " + this.dni +
                        "\nPertenece a la categoría: Adultos, ya que su edad es: " + this.edad);
            }
            else if( this.edad > 50 ){
                System.out.println("El participante " + this.nombre +
                        "\nDNI: " + this.dni +
                        "\nPertenece a la categoría: Adultos mayores, ya que su edad es: " + this.edad);
            } else{
                System.out.println("Edad invalida, complete nuevamente los datos");
            }

            //reset auxiliares
            nombreAux = null;
            dniAux = -1;
            edadAux = -1;

            //input nombre
            System.out.println("Ingrese un nombre");
            nombreAux = teclado.nextLine();
            setNombre(nombreAux);

            //input dni
            System.out.println("Ingrese un número de dni");
            dniAux = Integer.parseInt(teclado.nextLine());
            setDni(dniAux);

            //input edad
            System.out.println("Ingrese una edad");
            edadAux = Integer.parseInt(teclado.nextLine());
            setEdad(edadAux);
        }

        System.out.println("-----   Fin de la ejecución del ejercicio 4   -----");
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
