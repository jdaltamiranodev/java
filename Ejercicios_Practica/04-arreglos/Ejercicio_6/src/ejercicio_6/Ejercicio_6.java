/*
    Ejercicio 6: Leer los datos correspondientes a dos tablas de 12 elementos
    númericos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de 
    la B, otros 3 de A, otros 3 de la B, etc.
*/
package ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arregloA[], arregloB[], arregloC[];
        
        arregloA = new int[12];
        arregloB = new int[12];
        arregloC = new int[24];
        
        System.out.println("Arreglo A:");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + ". Digite un número;");
            arregloA[i] = scanner.nextInt();
        }
        
        System.out.println("Arreglo A:");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + ". Digite un número;");
            arregloB[i] = scanner.nextInt();
        }
        
        int indiceC = 0;
        for (int i = 0; i < 12; i += 3) {
            // Tomar 3 elementos de la tabla A
            for (int j = 0; j < 3; j++) {
                arregloC[indiceC++] = arregloA[i + j];
            }

            // Tomar 3 elementos de la tabla B
            for (int j = 0; j < 3; j++) {
                arregloC[indiceC++] = arregloB[i + j];
            }
        }
        
        System.out.println("\nMostrar Tabla C");
        for (int i = 0; i < 24; i++) {
            System.out.println((i + 1) + ". posición: " + arregloC[i]);
        }
        
        
    }
    
}
