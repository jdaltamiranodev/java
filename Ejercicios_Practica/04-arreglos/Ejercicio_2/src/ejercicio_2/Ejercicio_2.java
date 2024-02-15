/*
    Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en el 
    orden inverso al introducido.
*/
package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.print("Digite un número: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextFloat();
        }
        
        System.out.println("Mostrar los números en orden inverso");
        for (int i = 4; i > 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
}
