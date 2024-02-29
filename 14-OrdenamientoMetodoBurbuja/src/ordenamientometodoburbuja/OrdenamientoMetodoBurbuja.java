/*
Métodos de ordenamiento: Método Burbuja
*/
package ordenamientometodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoMetodoBurbuja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[], elementos, auxiliar;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite la cantidad de elementos del arreglo: "));
        
        arreglo = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            System.out.print((i + 1) + ". Digite el númmero: ");
            arreglo[i] = scanner.nextInt();
        }
        
        // Método Burbuja
        for (int i = 0; i < (elementos - 1); i++) {
            for (int j = 0; j < (elementos - 1); j++) {
                if(arreglo[j] > arreglo[j + 1]){ // si numeroActual > numeroSiguiente
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
        
        // Mostrar el arreglo ordenado en forma creciente
        System.out.println("\nArreglo ordenado en forma creciente: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        
        System.out.println("\nPoner arreglo ordenado en forma decreciente");
        for (int i = (elementos - 1); i > 0 ; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
    }
    
}
