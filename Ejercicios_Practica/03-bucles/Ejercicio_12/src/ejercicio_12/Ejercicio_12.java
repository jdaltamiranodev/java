/*
    Ejercicio 12: Pedir un número y calcular su factorial.
*/
package ejercicio_12;

import java.util.Scanner;


public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        long factorial = 1;
        System.out.print("Digite un númmero: ");
        numero = scanner.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
}
