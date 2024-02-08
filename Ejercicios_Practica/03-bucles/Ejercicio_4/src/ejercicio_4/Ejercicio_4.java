/*
    Ejercicio 4: Pedir números hasta que se teclee uno negativo,
    y mostrar cuántos números se han introducido.
*/
package ejercicio_4;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {
        int numero, repeticionNumero = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero >= 0){
            repeticionNumero++;
            JOptionPane.showMessageDialog(null, "Se han introducido " + repeticionNumero + " repeticiones.");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        
        JOptionPane.showMessageDialog(null, "Total repeticiones: " + repeticionNumero);
    }
    
}
