/*6. Hacer un programa que calcule el cuadrado de una suma*/
package ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, cuadrado = 0;
        
        System.out.println("\t\t---------PROGRAMA QUE CALCULA EL CUADRADO"
                + " DE UN NÚMERO---------");
        
        System.out.println("\t\t(a + b) = a ^ 2 + b ^ 2 + 2 * a * b");
        
        System.out.print("Digite el número a: ");
        a = scanner.nextDouble();
        
        System.out.print("Digite el número b: ");
        b = scanner.nextDouble();
        
        cuadrado = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;
        
        System.out.println("El cuadrado de la suma de: " + a + " x " + b + " es"
                + " igual a: " + cuadrado);
    }
    
}
