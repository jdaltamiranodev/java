/*
    Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación
    debe indicar si los números están ordenados de forma creciente, decreciente
    o si están desordenados.
*/
package ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente = false;
        
        System.out.print("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un número; ");
            arreglo[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            if(arreglo[i] < arreglo[i + 1]){
                creciente = true;
            }
            if(arreglo[i] > arreglo[i + 1]){
                decreciente = true;
            }
        }
        
        if(creciente == true && decreciente == false){
            System.out.println("\nEl arreglo esta en forma creciente.");
        }else if(creciente == false && decreciente == true){
            System.out.println("\nEl arreglo esta en forma decreciente.");
        }else if(creciente == true && decreciente == true){
            System.out.println("\nEl arreglo esta desordenado");
        }else if(creciente == false && decreciente == false){
            System.out.println("\nTodos los números del arreglo son iguales.");
        }
    }
    
}
