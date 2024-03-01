/*
    Ejercicio 1: Crear y cargar una mtriz de tamaño n x m y decir si es simétrica
    o no.
*/
package ejercicio_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][], numeroFilas, numeroColumnas;
        boolean simetrica = true;
        
        numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
                + "número de filas: "));
        numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
                + "número de filas: "));
        
        matriz = new int[numeroFilas][numeroColumnas];
        System.out.println("Digite una matriz: ");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        if(numeroFilas == numeroColumnas){ // Si el númmero de filas es igual al número de columnas
            int i, j;
            i = 0;
            while(i < numeroFilas && simetrica == true){
                j = 0;
                while(j < i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica == true){
                JOptionPane.showMessageDialog(null, "La matriz es simétrica");
            }else{
                JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
            }
        }else{
            JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
        }
    }
    
}
