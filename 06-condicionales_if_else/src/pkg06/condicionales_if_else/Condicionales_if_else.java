/*Condicionales if - else
        if(condicion) {
            instruccion1
        }else{
            instruccion2
        }*/

package pkg06.condicionales_if_else;

import javax.swing.JOptionPane;

public class Condicionales_if_else {

    public static void main(String[] args) {
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if (numero == dato){
            JOptionPane.showMessageDialog(null, "El número es 5");
        }else{
            JOptionPane.showMessageDialog(null, "El número es diferente de 5");
        }
        
        
    }
    
}
