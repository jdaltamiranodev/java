/*Ejercicio 1: Hacer un programa que calcule e imrpima la suma de tres
calificaciones*/
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        
        // Guardar las 3 notas
        System.out.print("Digite 3 calificaciones: ");
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();
        
        suma = nota1 + nota2 + nota3;
        
        System.out.println("La summa es: " + suma);
    }
    
}
