/*
    Ejercicio 16: Pide un número (que debe estar entre 0 y 10) y mostrar la 
    tabla de multiplicar de dicho número.
*/
package ejercicio_16;

import javax.swing.JOptionPane;

public class Ejercicio_16 {

    public static void main(String[] args) {
        int numero, resultado = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número "
                + "entre 0 y 10: "));
        
        for (int i = 0;i <= 12; i++) {
            resultado = numero * i;
            System.out.println( numero + " x " + i + " = " + resultado);
        }
    }
    
}
