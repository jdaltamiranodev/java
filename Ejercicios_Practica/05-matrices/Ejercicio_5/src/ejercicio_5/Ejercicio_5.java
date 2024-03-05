/*
    Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma
    de cada fila y cada columna.
*/
package ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][], numeroFilas, numeroColumnas, sumaFilas, sumaColumnas;
        
        numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int[numeroFilas][numeroColumnas];
        
        System.out.println("Digite la matriz");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.print("\nLa matriz es: ");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        // Sumas las filas
        for (int i = 0; i < numeroFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < numeroColumnas; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila[" + i + "] es: " + sumaFilas);
        }
        System.out.println("");
        
        // Suma las columnas
        for (int i = 0; i < numeroFilas; i++) {
            sumaColumnas = 0;
            for (int j = 0; j < numeroColumnas; j++) {
                sumaColumnas += matriz[j][i];
            }
            System.out.print("\nLa suma de la columna[" + i + "] es: " + sumaColumnas);
        }
        System.out.println("");
    }
    
}
