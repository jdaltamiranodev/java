/*
    Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos
    pares de la primera, y a continuación los elementos impares.
*/
package ejercicio_13;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[10];
        int conteoPares = 0, conteoImpares = 0;
        
        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            arreglo[i] = scanner.nextInt();
            
            if(arreglo[i] % 2 == 0){
                conteoPares++;
            }else{
                conteoImpares++;
            }
        }
        
        // Crear los arreglos siguientes
        int par[] = new int[conteoPares];
        int impar[] = new int[conteoImpares];
        
        conteoPares = 0;
        conteoImpares = 0;
        
        for (int i = 0; i < 10; i++) {
            if(arreglo[i] % 2 == 0){
                par[conteoPares] = arreglo[i];
                conteoPares++;
            }else{
                impar[conteoImpares] = arreglo[i];
                conteoImpares++;
            }
        }
        
        System.out.println("\nArreglo pares: ");
        for (int i = 0; i < conteoPares; i++) {
            System.out.print(par[i] + " - ");
        }
        System.out.println("");
        
        System.out.println("\nArreglo impares: ");
        for (int i = 0; i < conteoImpares; i++) {
            System.out.print(impar[i] + " - ");
        }
        System.out.println("");
    }
    
}
