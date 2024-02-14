/*
    Ejercicio 8: Pedir un número N, y mostrar todos los números
    del 1 al N
*/
package ejercicio_8;

import javax.swing.JOptionPane;

public class Ejercicio_8 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
    
}
