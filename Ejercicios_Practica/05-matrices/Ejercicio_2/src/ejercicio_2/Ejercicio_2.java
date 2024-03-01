/*
    Ejercicio 2: Crear y cargar dos matrices de tamaño 3 x 3, sumarlas y 
    mostrar su suma.
*/
package ejercicio_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrizUno[][], matrizDos[][], numeroFilas, numeroColumnas, 
                resultado = 0;
        
        numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
                + "númmero de filas: "));
        numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
                + "númmero de columnas: "));
        
        matrizUno = new int[numeroFilas][numeroColumnas];
        matrizDos = new int[numeroFilas][numeroColumnas];
        
        System.out.println("Llenar las matrices:");
        System.out.println("Llenar la matriz 1:");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]");
                matrizUno[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Llenar la matriz 2: ");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print("matriz[" + i + "][" + j + "]");
                matrizDos[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Sumar matriz 1 con matriz 2");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                resultado = matrizUno[i][j] + matrizDos[i][j];
                System.out.println("matrizUno[" + i + "][" + j + "] = " +
                        matrizUno[i][j] + "\nmatrizDos[" + i + "][" + j + "] = " +
                        matrizDos[i][j] + "\n" + matrizUno[i][j] + " + " +
                        matrizDos[i][j] + " = " + resultado);
            }
        }
    }
    
}
