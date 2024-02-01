/*
    Ejercicio 8: Pedir un númmero entre 0 y 99 999 y decir cuántas
    cifras tiene.
*/
package ejercicio_8;

import javax.swing.JOptionPane;

public class Ejercicio_8 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1 y 99 999: "));
        
        if (numero >= 0 && numero <= 9){
            JOptionPane.showMessageDialog(null, "El número tiene 1 cifra");
        }else if (numero >= 10 && numero <= 99){
                JOptionPane.showMessageDialog(null, "El número tiene 2 cifras.");
        }else if (numero >= 100 && numero <= 999){
                JOptionPane.showMessageDialog(null, "El número tiene 3 cifras.");
        }else{
            JOptionPane.showMessageDialog(null, "El número está fuera del rango especificado.");
        }
    }
    
}
