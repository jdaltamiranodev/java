/*
    Ejercicio 15: Leer 10 enteros ordenados de forma creciente. Leer N y buscarlo
    en la tabla. Se debe mostrar la posición en que se encuentra. Si no está,
    indicarlo con un mensaje.
*/
package ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[], numero;
        boolean creciente = true;
        
        arreglo = new int[10];
        
        do{
            // Pedir el arreglo
            System.out.println("Rellene el arreglo: +");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un número:");
                arreglo[i] = scanner.nextInt();
            }
            // Verificar si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if(arreglo[i] < arreglo[i + 1]){
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i + 1]){
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado. Digite nuevamente:");
            }
            
        }while(creciente == false);
        // pedimos el número a buscar
        System.out.println("\nDigite el número a buscar en el arreglo: ");
        numero = scanner.nextInt();
        
        int i = 0;
        while(i < 10 && arreglo[i] < numero){
            
            i++;
        }
        
        if(i == 10){
            System.out.println("\nNúmero no encontrado");
        }else{
            if(arreglo[i] == numero){
                System.out.println("\nNúmero encontrado, en la posición: " + i);
            }else{
                System.out.println("\nNúmero no encontrado.");
            }
        }
    }
    
}
