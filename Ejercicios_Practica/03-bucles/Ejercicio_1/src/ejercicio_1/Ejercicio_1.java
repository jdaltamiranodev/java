/*
    Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el
    proceso hasta que se introduzca un número negativo.
*/
package ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            
            JOptionPane.showMessageDialog(null, "El número " + numero + " elevado al cuadrado es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
    }
    
}
