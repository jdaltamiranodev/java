/*
Matriz:
    matriz[][];
*/
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matriz[][], numeroFilas, numeroColumnas;
        
        numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
                + "número de filas: "));
        numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
                + "número de columnas: "));
        
        matriz = new int[numeroFilas][numeroColumnas];
        
        System.out.println("Digite la matriz");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < numeroFilas; i++) { // Número de filas
            for (int j = 0; j < numeroColumnas; j++) { // Número de columnas
                //System.out.print(matriz[i][j]);
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
