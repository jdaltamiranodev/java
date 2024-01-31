/*Ejercicio 2. Pedir dos números y decir cual es el mayor o si son
  iguales.
*/
package ejercicio_2;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2: "));
        
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El " + numero1 + " es mayor");
        } else if(numero1 < numero2){
            JOptionPane.showMessageDialog(null, "El " + numero2 + " es mayor");
        }else{
            JOptionPane.showMessageDialog(null, "Son iguales");
        }
    }
    
}
