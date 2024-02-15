/*
    Ejercicio 4: Leer 10 números enteros, guardarlos en un arreglo. Debemos 
    mostrarlos en el siguiente orden: el primero, el último, el segundo, el 
    penúltimo, el tercero, etc.
*/
package ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numeros[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            numero = scanner.nextInt();
            numeros[i] = numero;
        }
        
        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.println("\nnumero: " + numeros[i] + " desciende: " + numeros[(numeros.length - 1) - i]);
        }
    }
    
}
