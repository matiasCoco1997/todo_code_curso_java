import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioUno {

    /*
    * Realizar un programa que permita cargar 15 números en un vector. Una vez cargados, se necesita que el programa
    * cuente e informe por pantalla cuantas veces se cargó el número 3
    */

    private int listaDeNumeros [] = new int [15];
    private Scanner teclado = new Scanner(System.in);

    public EjercicioUno() {}

    public void ejecutarEjercicio(){
        int indice = 0;

        while(indice < 15){
            try {
                System.out.println("Ingrese un valor numérico");
                int numeroIngresado = teclado.nextInt();
                listaDeNumeros[indice] = numeroIngresado;
                indice++;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                teclado.next(); // Limpiar el buffer del scanner
                // No incrementamos el índice, así que pedirá de nuevo el mismo número
            }
        }

        System.out.println("La cantidad de veces que se encuentra el número 3 en el array es: " + contadorCantidadDeNumerosTres());
    }


    public int contadorCantidadDeNumerosTres(){
        int contadorDeTres = 0;

        for(int i = 0 ; i < listaDeNumeros.length ; i++){
            if(listaDeNumeros[i] == 3){
                contadorDeTres++;
            }
        }

        return contadorDeTres;
    }
}
