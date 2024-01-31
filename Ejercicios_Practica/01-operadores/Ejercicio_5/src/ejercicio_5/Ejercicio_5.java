/*5. La calificación final de un estudiante de informatica se calcula 
con base a las calificaciones de cuatro aspectos de su rendimiento
académico: participación, primer examen parcial, segundo examen
parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación
final con ponderaciones del 10%, 25%, 25% y 40%. Hacer un programa que
calcule e imprima la calificación final obtenida por un estudiante.*/
package ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, examenFinal,
                notaFinal;
        
        // Pedir los datos necesarios
        System.out.print("Digite la nota de participación: ");
        participacion = entrada.nextFloat();
        System.out.print("Digite la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();
        System.out.print("Digite la nota del segundo examen parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.print("Digite la nota del examen final: ");
        examenFinal = entrada.nextFloat();
        
        // Sacar los calculos
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
        // Sumar las notas
        notaFinal = participacion + primerExamen + segundoExamen + 
                examenFinal;
        
        // Imprimir el resultado en pantalla
        System.out.print("La nota final es: " + notaFinal);
    }
    
}
