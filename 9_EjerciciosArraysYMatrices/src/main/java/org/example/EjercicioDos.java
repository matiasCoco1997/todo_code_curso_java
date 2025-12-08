package org.example;

import java.util.Scanner;

public class EjercicioDos {

    /*
    * En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria. Cada fila corresponde a
    * las notas y al promedio de cada alumno. Se necesita un programa que permita a un profesor cargar, en las 3
    * posiciones (columnas) de cada fila, las notas del alumno y que en la ultima columna se calculen los promedios.
    * Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente al
    * recorrido de la matriz.
    * */
    private int filas = 4;
    private int columnas = 4;
    private Double promedios [][] = new Double[filas][columnas];
    private Scanner teclado = new Scanner(System.in);

    public EjercicioDos() {
    }

    public void ejecutarEjercicio(){

        cargarNotas();
        mostrarNotas();
    }

    private void cargarNotas(){

        Double sumaDeNotas = 0.0;

        for(int i = 0; i < filas; i++){
            sumaDeNotas = 0.0;
            for(int j = 0; j < columnas; j++){
                if(j < 3){
                    System.out.println("Ingrese la nota "+ (j+1) +", para el alumno número " + (i+1) + " :");
                    promedios[i][j] = teclado.nextDouble();
                    sumaDeNotas += promedios[i][j];
                } else{
                    promedios[i][j] = sumaDeNotas / 3;
                }
            }
        }
    }

    private void mostrarNotas(){
        for(int i = 0; i < filas; i++){
            System.out.println("\nEl alumno número " + (i+1) + " tiene como notas:");
            for(int j = 0; j < columnas; j++){
                if(j < 3 ){
                    System.out.print(" / "+ promedios[i][j] + " / ");
                } else{
                    System.out.print(" Promedio = "+ promedios[i][j]);
                }
            }
        }
    }

}
