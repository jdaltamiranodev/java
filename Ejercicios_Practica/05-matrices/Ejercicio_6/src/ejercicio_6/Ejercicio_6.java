/*
    Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera
    y transponerla en la segunda.
*/
package ejercicio_6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrizUno[][] = new int[5][9];
        int matrizDos[][] = new int[9][5];
        int auxiliar = 0, valorInicial = 10, 
                valorActual = valorInicial , 
                valorFinal = 56;
        
        //System.out.println("Llenar la matriz 1: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                //System.out.print("MatrizUno[" + i + "][" + j + "] : ");
                //matrizUno[i][j] = scanner.nextInt();
                //matrizUno[i][j] = (int) (Math.floor(Math.random()*(1 - 46 + 1) + 46));
                matrizUno[i][j] = valorActual;
                valorActual++;
                
                if(valorActual > valorFinal){
                    break;
                }
            }
            
            if(valorActual > valorFinal){
                break;
            }
        }
        
        // Imprimir la matriz 1:
        System.out.println("\nLa matriz 1 es:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizUno[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("\nFIN Matriz 1");
        
        // Trasponer Matriz 1 en la Matriz 2
        //System.out.println("\nTransponer matriz 1 en la matriz 2:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                matrizDos[i][j] = matrizUno[j][i];
            }
        }
        
        // Imprimir la Matriz 2 transpuesta
        System.out.println("\nImprimir la matriz 2 transpuesta:\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizDos[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}
