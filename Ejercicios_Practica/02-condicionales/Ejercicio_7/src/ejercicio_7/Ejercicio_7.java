/*
    Ejercicio 7: Pedir tres números y mostrarlos ordenados de 
    mayor a menor.
*/
package ejercicio_7;

import javax.swing.JOptionPane;

public class Ejercicio_7 {

    public static void main(String[] args) {
        int numeroUno, numeroDos, numeroTres;
        
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Digite el número uno: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número dos: "));
        numeroTres = Integer.parseInt(JOptionPane.showInputDialog("Digite el número tres: "));
        
        if(numeroUno > numeroDos && numeroUno > numeroTres){
            JOptionPane.showMessageDialog(null, "Orden: " + numeroUno + " - " + 
                    numeroDos + " - " + numeroTres);
        }else if(numeroUno > numeroTres && numeroTres > numeroDos){
            JOptionPane.showMessageDialog(null, "Orden: " + numeroUno + " - " + 
                    numeroTres + " - " + numeroDos);
        }else if(numeroDos > numeroUno && numeroDos > numeroTres){
            JOptionPane.showMessageDialog(null, "Orden: " + numeroDos + " - " + 
                    numeroUno + " - " + numeroTres);
        }else if(numeroDos > numeroTres && numeroTres > numeroUno){
            JOptionPane.showMessageDialog(null, "Orden: " + numeroDos + " - " + 
                    numeroTres + " - " + numeroUno);
        }else if(numeroTres > numeroUno && numeroUno> numeroDos){
            JOptionPane.showMessageDialog(null, "Orden: " + numeroTres + " - " + 
                    numeroUno + " - " + numeroDos);
        }else{
            JOptionPane.showMessageDialog(null, "Orden: "+ numeroTres + " - " + 
                    numeroDos + " - " + numeroUno);
        }
    }   
}
