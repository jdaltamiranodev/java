/*
    Ejercicio 21: Pedir 10 números, y mostrar al final si se ha intrducido
    alguno negativo.
*/
package ejercicio_21;

import javax.swing.JOptionPane;

public class Ejercicio_21 {

    public static void main(String[] args) {
        int numero;
        boolean hayNegativos = false;
        
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            
            if(numero < 0){
                hayNegativos = true;
            }
        }
        
        if(hayNegativos == true){
            System.out.println("Si existe al menos un número negativo.");
        }else{
            System.out.println("No existe ningún número negativo");
        }
    }
    
}
