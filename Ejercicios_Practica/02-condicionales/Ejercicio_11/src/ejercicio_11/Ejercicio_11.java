/*
    Ejercicio 11: Construir un programa que simule el funcionamiento
    de una calculadora que puede realizar las cuatro operaciones 
    aritmeticas básicas (suma, resta, multiplicación y división)
    con valores numéricos enteros. El usuario debe especificar la 
    operación con el primer carácter del priemr parámetro de la
    línea de comandos: S o s para la suma, R o r para la resta, 
    M o m para la multiplicación, D y d para la división.
*/
package ejercicio_11;

import javax.swing.JOptionPane;

public class Ejercicio_11 {

    public static void main(String[] args) {
        int numeroUno, numeroDos, suma, resta, multiplicacion, division;
        char operacion;
        
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        operacion = JOptionPane.showInputDialog("Digite la operación que desea realizar: ").charAt(0);
        
        switch(operacion){
            case 's':
            case 'S': suma = numeroUno + numeroDos;
                      JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                      break;
            case 'r':
            case 'R': resta = numeroUno - numeroDos;
                      JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                      break;
            case 'm':
            case 'M': multiplicacion = numeroUno * numeroDos;
                      JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplicacion);
                      break;
            case 'd':
            case 'D': division = numeroUno / numeroDos;
                      JOptionPane.showMessageDialog(null, "La división es: " + division);
                      break;
            default: JOptionPane.showMessageDialog(null, "Error, ¡se equivoco de operación!");
        }
        
    }
    
}
