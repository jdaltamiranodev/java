/*
    Ejercicio 10: Pedir 10 números y escribir la suma total.
*/
package ejercicio_10;

import javax.swing.JOptionPane;

public class Ejercicio_10 {

    public static void main(String[] args) {
        int numero, suma = 0;
        
        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            suma += numero;
        }
        
        JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
    
}
