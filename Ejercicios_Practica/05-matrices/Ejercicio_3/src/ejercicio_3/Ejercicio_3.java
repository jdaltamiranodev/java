/*
    Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
*/
package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int matriz[][] = new int[3][3];
        
        System.out.println("Digite la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        // Trasponiendo la matriz
        int auxiliar;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                auxiliar = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = auxiliar;
            }
        }
        
        System.out.println("\nLa matriz transpuesta es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
