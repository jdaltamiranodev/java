/*
    Ejercicio 1: Construir un programa que calcule el área y el perimetro de un 
    cuadrilatero dad la longitud de sus dos lados. Los valores de la longitud
    deberán introducirse por línea de ordenes. Si es un cuadro, sólo se 
    proporcionará la longitud de uno de los lados al constructor.
*/
package Ejercicio_1;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args){
        Cuadrilatero cuadrilatero;
        float ladoUno, ladoDos;
        
        ladoUno = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        ladoDos = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));
        
        if(ladoUno == ladoDos){
            cuadrilatero = new Cuadrilatero(ladoUno);
        }else{
            cuadrilatero = new Cuadrilatero(ladoUno, ladoDos);
        }
        
        System.out.println("El perimetro es: " + cuadrilatero.getPerimetro());
        System.out.println("El área es: " + cuadrilatero.getArea());
    }
}
