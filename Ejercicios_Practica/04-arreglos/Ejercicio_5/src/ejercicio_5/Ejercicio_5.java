/*
    Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas
    en una tercera de la forma: el 1° de A, el 1° del B, el 2° del A, el 2° del B, 
    etc.
*/
package ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[], b[], c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        // pedir arreglo a
        System.out.println("Digite el primer arreglo; ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            a[i] = scanner.nextInt();
        }
        
        // pedir el arreglo b
        System.out.println("\nDigite el segundo arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            b[i] = scanner.nextInt();
        }
        
        // mezclar areglo a y b en el arreglo c
        // iterador i para a y b - j para c
        
        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        System.out.println("\nEl tercer arreglo es:");
        for (int i = 0; i < 20; i++) {
            System.out.println(c[i] + " ");
        }
        System.out.println();
    }
    
}
