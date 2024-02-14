/*
    Ejercicio 20: Pedir un número N, introducir N sueldo, y mostrar el sueldo 
    máximo
*/
package ejercicio_20;

import javax.swing.JOptionPane;

public class Ejercicio_20 {

    public static void main(String[] args) {
        int numero, sueldos, sueldoMaximo = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número "
                + " de empleados"));
        for (int i = 0; i < numero; i++) {
            sueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite el sueldo "
                + " del empleado No. " + (i + 1)));
            if(sueldos > sueldoMaximo){
                sueldoMaximo = sueldos;
            }
            System.out.println("El sueldo del empleado No: " + (i + 1) + " es: "
                    + sueldos);
        }
        System.out.println("El sueldo máximo es: " + sueldoMaximo);
        
        
    }
    
}
