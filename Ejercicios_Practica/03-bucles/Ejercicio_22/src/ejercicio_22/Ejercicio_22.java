/*
    Ejercicio 22: Pedir 5 calificaciones de alumnos y decir al final si hay algún 
    suspendido.
*/
package ejercicio_22;

import javax.swing.JOptionPane;

public class Ejercicio_22 {

    public static void main(String[] args) {
        float calificaciones;
        int suspendidos = 0;
        
        for (int i = 0; i < 5; i++) {
            calificaciones = Float.parseFloat(JOptionPane.showInputDialog("Digite"
                    + " la calificación: "));
            
            if(calificaciones < 0 || calificaciones > 10 ){
                System.out.println("La calificación debe estar entre 0 y 10");;
            }else if(calificaciones <= 4){
                suspendidos++;
            }else if(calificaciones < 10){
                System.out.println("Aprobado, ¡FELICITACIONES!");
            }else{
                System.out.println("Fuera del rango");
            }
        }
        System.out.println("Número de suspendidos: " + suspendidos);
    }
    
}
