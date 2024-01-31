/*Construir un programa que calcule y muestre por pantalla las raíces de la 
ecuación de segundo grado de coeficientes reales.
ax^2 + bx + c = 0*/
package ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, xPositiva = 0, xNegativa  = 0;
        
        System.out.println("\t\t------- PROGRAMA DE LA ECUACIÓN "
                + " CUADRATICA -------");
        System.out.println("\t\t------- ax^2 + bx + c = 0 -------");
        
        System.out.print("Digite a: ");
        a = scanner.nextDouble();
        
        System.out.print("Digite b: ");
        b = scanner.nextDouble();
        
        System.out.print("Digite c: ");
        c = scanner.nextDouble();
        
        xPositiva = ( (-b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c) ) ) ) / 2 * a;
        xNegativa = ( (-b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c) ) ) ) / 2 * a;
        
        System.out.print("El resultado positivo es:  " + xPositiva + ".\n"
                + "El resultado negativo es: " + xNegativa + "\n");
    }
    
}
