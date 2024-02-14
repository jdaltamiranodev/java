/*
    Eejercicio 7: Pedir números hasta que se introduzca uno negativo, 
    y calcular la media.
*/
package ejercicio_7;

import javax.swing.JOptionPane;

public class Ejercicio_7 {

    public static void main(String[] args) {
        int numero, elementos = 0, suma = 0;
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero >= 0){
            suma += numero;
            elementos++;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        
        if(elementos == 0){
            System.out.println("Error! La división por cero no es valida.");
        }else{
            media = (float) suma / elementos;
            System.out.println("La media es: " + media);
        }
    }
    
}
