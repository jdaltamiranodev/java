/*
    Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de 
    forma creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un 
    número N, e insertarlo en el lugar adecuado para que la tabla continúe 
    ordenada.
*/
package ejercicio_11;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[10];
        int numero, posicion = 0, j = 0;
        boolean creciente = false;
        
        System.out.println("Llenar el arreglo");
        do{
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Digite un número:");
                arreglo[i] = scanner.nextInt();
            }
            
            // Comprobar si el arreglo esta ordenado en forma creciente
            for (int i = 0; i < 4; i++) {
                if(arreglo[i] < arreglo[i + 1]){
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i + 1]){
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("\nEl arreglo no esta ordenado de forma creciente."
                + " vuelva a ordenar");
            }
        }while(creciente == false);
        System.out.println("\nDigite un elemento a insertar");
        numero = scanner.nextInt();
        
        while(arreglo[j] < numero && j < 5){
            posicion++;
            j++;
        }
        
        for (int i = 4; i < posicion; i--) {
            arreglo[i + 1] = arreglo[i];
        }
        
        arreglo[posicion] = numero;
        
        System.out.println("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(arreglo[i] + " - ");
        }
        System.out.println("");
    }
    
}
