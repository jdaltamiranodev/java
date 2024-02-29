/*
    Métodos de Ordenamiento: Ordenamiento por Inserción
*/
package ordenamientoporinsercion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenamientoPorInsercion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[], numeroElementos, posicion, auxiliar;
        
        numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos: "));
        arreglo = new int[numeroElementos];
        
        System.out.println("Digite el arreglo:");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            arreglo[i] = scanner.nextInt();
        }
        
        // Ordenamiento por inserción
        for (int i = 0; i < numeroElementos; i++) {
            posicion = i;
            auxiliar = arreglo[i];
            
            while(posicion > 0 && (arreglo[posicion - 1] > auxiliar)){
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }
            arreglo[posicion] = auxiliar;
        }
        
        System.out.println("Orden ascendente");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
        
        System.out.println("Orden descendente");
        for (int i = (numeroElementos - 1); i >= 0  ;i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
    }
    
}
