/*
    Ejercicio 6: Hacer un programa que tome dos números y diga si
    ambos son pares o impares
*/
package ejercicio_3;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int numeroUno, numeroDos;
        
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 1: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 2:"));
        
        if(numeroUno % 2 == 0 && numeroDos % 2 == 0){
            JOptionPane.showMessageDialog(null, "Ambos números son pares.");
        }else if(numeroUno % 2 != 0 && numeroDos % 2 != 0){
            JOptionPane.showMessageDialog(null, "Ambos números son impares");
        }else{
            JOptionPane.showMessageDialog(null, "Uno de los números es par y el otro impar.");
        }
    }
    
}
