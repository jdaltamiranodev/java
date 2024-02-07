/*
    Ejercicio 12: Hacer un programa que pida una nota desde 0 a 10
    y la muestre de la siguiente forma: Insuficiente, Suficiente,
    Bien, Notable y Sobresaliente.
*/
package ejercicio_12;

import javax.swing.JOptionPane;

public class Ejercicio_12 {

    public static void main(String[] args) {
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota, recuerde que solo se califica del 1 al 10: "));
        
        if (nota >= 0 && nota <= 1){
            JOptionPane.showMessageDialog(null, "La nota es Insuficiente, debe estudiar mas la próxima vez.");
        }else if(nota > 1 && nota <= 5){
            JOptionPane.showMessageDialog(null, "La nota es Suficiente, aún debe estudiar mas para la próxima vez.");
        }else if(nota > 5 && nota <= 6){
            JOptionPane.showMessageDialog(null, "La nota es Bien, Le recomiendo seguir estudiando para la próxima vez.");
        }else if(nota > 6 && nota <= 9){
            JOptionPane.showMessageDialog(null, "La nota es Sobresaliente, Se ha esforzado bastante, enhorabuena!.");
        }else if(nota == 10){
            JOptionPane.showMessageDialog(null, "La nota es Notable, debería dar la clase usted ¡CRACK!.");
        }else{
            JOptionPane.showMessageDialog(null, "La nota ingresada no esta dentro del rango de 1 a 10.");
        }
    }
    
}
