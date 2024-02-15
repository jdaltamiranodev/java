/*
    Llnear un arreglo
*/
package pkg12.llenararreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LlenarArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementos;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        
        char[] letras = new char[elementos];
        
        System.out.println("Digite los elementos del arreglo");
        for (int i = 0; i < elementos; i++) {
            System.out.println((i + 1) + ". Digite un caracter: ");
            letras[i] = scanner.next().charAt(0);
        }
        
        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print(letras[i] + " ");
        }
    }
    
}
