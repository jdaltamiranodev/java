/*
    Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 
    números enteros y desplace N posiciones en el arreglo (N es digitado por
    el usuario).
*/
package ejercicio_10;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla[] = new int[10];
        int posicion, ultimoNumero;
        
        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Ingrese un númmero: ");
            tabla[i] = scanner.nextInt();
        }
        
        System.out.print("\nIngrese la posición en la que desea añadir el otro"
                + " número: ");
        posicion = scanner.nextInt();
        
        ultimoNumero = tabla[posicion];
        
        // Desplazar elementos
        for (int i = posicion; i > 0; i--) {
            tabla[i] = tabla[i - 1];
        }
        
        tabla[0] = ultimoNumero;
        
        // Imprimir arreglo final
        System.out.println("\nEste es el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " = [ " + tabla[i] + " ]");
        }
    }
    
}
