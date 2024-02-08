/*
    Ejercicio 3: Leer números hasta que se introduzca un cero (0). 
    Para cada uno indicar si es par o impar
*/
package ejercicio_3;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número si quiere saber si es PAR ó IMPAR, para terminar presione cero (0): "));
        
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El número: " + numero + " es PAR.");
            }else{
                JOptionPane.showMessageDialog(null, "El número: " + numero + " es IMPAR.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número si quiere saber si es PAR ó IMPAR, para terminar presione cero (0): "));
        }
    }
    
}
