/*
    Ejercicio 6: Pedir números hasta que se teclee un cero (0),
    mostrar la suma de todos los números introducidos.
*/
package ejercicio_6;

import javax.swing.JOptionPane;

public class Ejercicio_6 {

    public static void main(String[] args) {
        int numero, suma = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un número: "));
        
        while(numero != 0){
            suma += numero;
            JOptionPane.showMessageDialog(null, "La suma es: " + suma);
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
    
}
