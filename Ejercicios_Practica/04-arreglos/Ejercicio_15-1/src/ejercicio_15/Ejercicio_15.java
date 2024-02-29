/*
    Ejercicio 15: Leer 10 números enteros ordenados crecientemente.
    Leer N y buscarlo en la tablaa. Se debe mostrar la posición en
    que se encuentra. Si no está, indicarlo con un mensaje.
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
            System.out.println("Rellenar el arreglo");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un número: ");
                arreglo[i] = scanner.nextInt();
            }
            // Verificar si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if(arreglo[i] < arreglo[i + 1]){ // Creciente
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i + 1]){ // Decreciente
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, "
                        + "digite nuevamente\n");
            }
            
        }while(creciente == false);
        
        // Pedir número a buscar en el arreglo
        System.out.println("\nDigite el número a buscar en el arreglo");        
        numero = scanner.nextInt();
        
        // Buscamos el número en el arreglo.
        int i = 0;
        while(i < 10 && arreglo[i] < numero){
            i++;
        }
        
        if(i == 10){ // Se recorre todo el arreglo y no se encuentra el numero
            System.out.println("\nNúmero no encontrado");
        }else{
            if(arreglo[i] == numero){
                System.out.println("\nNúmero encontrado en la posición: " + (i + 1));
            }else{
                System.out.println("\nNúmero no encontrado");
            }
        }
    }
    
}
