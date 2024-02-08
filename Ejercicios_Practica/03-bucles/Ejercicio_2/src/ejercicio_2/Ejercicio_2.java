/*
    Ejercicio 2: Leer un número e indicar si es positivo o negativo,
    El proceso se repetirá hasta que se introduc¿zca un 0
*/
package ejercicio_2;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número si quiere saber si es positivo o negativo, para terminar presione cero (0): "));
        
        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El número: " + numero + " es positivo.");
            }else{
                JOptionPane.showMessageDialog(null, "El número: " + numero + " es negativo.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número si quiere saber si es positivo o negativo, para terminar presione cero (0): "));
        }
    }
    
}
