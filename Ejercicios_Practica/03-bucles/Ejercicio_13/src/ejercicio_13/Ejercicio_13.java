/*
    Ejercicio 13: Pedir 10 números. Mostrar la media de los números
    positivos, la media de los números negativos y la cantidad de 
    ceros.
*/
package ejercicio_13;

import javax.swing.JOptionPane;

public class Ejercicio_13 {

    public static void main(String[] args) {
        int numero, sumaPositivos = 0, conteoPositivos = 0,
                sumaNegativos = 0, conteoNegativos = 0, 
                conteoCeros = 0;
        float mediaPositivos, mediaNegativos;
        
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            
            if(numero == 0){
                conteoCeros++;
            }else if(numero >= 0){
                sumaPositivos += numero;
                conteoPositivos++;
            }else{
                sumaNegativos++;
                conteoNegativos++;
            }
        }
        
        if(conteoPositivos == 0){
            System.out.println("No se puede sacar la media de los positivos");
        }else{
            mediaPositivos = (float) sumaPositivos / conteoPositivos;
            System.out.println("La media de los números positivos es: " + mediaPositivos);
        }
        
        if(conteoNegativos == 0){
            System.out.println("No se puede sacar la media de los negativos.");
        }else{
            mediaNegativos = (float) sumaNegativos / conteoNegativos;
            System.out.println("");
        }
        
        System.out.println("La cantidad de ceros es: " + conteoCeros);
    }
    
}
