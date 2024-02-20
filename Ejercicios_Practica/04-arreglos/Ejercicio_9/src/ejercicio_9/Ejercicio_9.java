/*
    Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números
    enteros y la desplace una posición hacia abajo: el primero pasa a ser el
    segundo, el segundo pasa a ser el tercero y asi sucesivamente. El último
    pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
*/
package ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        
        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ". Digite un número: ");
            arreglo[i] = scanner.nextInt();
        }
        
        ultimo = arreglo[9];
        
        for (int i = 8; i >= 0; i--) {
            arreglo[i + 1] = arreglo[i]; 
        }
        
        arreglo[0] = ultimo;
        
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i + "- Número: " + arreglo[i]);
            
        }
    }
    
}
