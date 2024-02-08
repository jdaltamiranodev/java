/*
    Ejercicio 5: Realizar un juego para adivinar un número. Para 
    ello generar un número aleatorio entre 0-100, y luego ir pidiendo
    números indicando "es mayor" o "es menor" según sea mayor o menor
    con respecto a N. El proceso termina cuando el usuario acierta y
    muestra el número de intentos.
*/
package ejercicio_5;

import javax.swing.JOptionPane;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;
        
        aleatorio =(int) (Math.random() * 100);
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            
            if(aleatorio > numero){
                System.out.println("Digite un número mayor.");
            }else{
                System.out.println("Digite un número menor.");
            }
            contador++;
        }while(numero != aleatorio);
        
        System.out.println("\nGenial!! Adivinaste el número en: " + contador + " intentos.");
    }
    
}
