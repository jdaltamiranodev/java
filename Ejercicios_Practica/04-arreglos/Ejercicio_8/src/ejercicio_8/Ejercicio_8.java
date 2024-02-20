/*
    Ejercicio 8: Diseñar una aplicaci{on que declare uuna tabla de 10 elementos
    enteros. Leer mediante el teclado 8 númmeros. Despu{es se debe pedir un númmero
    y una posición, insertarlo en la posición indicada, desplazando los que estén
*/
package ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla[] = new int[10];
        int numero, posicion;
        
        System.out.println("Crear la Tabla:");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ". Ingrese un número: ");
            tabla[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();
        System.out.print("Ingrese una posición de 1 a 8: ");
        posicion = scanner.nextInt();
        
        // Validar la posición ingresada
        if (posicion < 1 || posicion > 10) {
            System.out.println("La posición ingresada no es válida. Debe estar "
                    + "entre 1 y 10.");
        } else {
            for (int i = tabla.length - 1; i > posicion - 1; i--) {
                tabla[i] = tabla[i - 1];
            }
            tabla[posicion - 1] = numero;
            for(int i = 0; i < tabla.length; i++){
                System.out.print(tabla[i] + ", ");
            }
            }
    } 
}
