/*
    Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros
    y una posición (entre 0 y 9). Eliminar el elemento situado en la posición
    dada sin dejar huecos.
*/
package ejercicio_12;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[10];
        int numero;
        
        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un númmero: ");
            arreglo[i] = scanner.nextInt();
        }
        
        do {
            System.out.print("Ingrese la posición (entre 0 y 9) que desea "
                    + " eliminar: ");
            numero = scanner.nextInt();
        }while(numero >= 10 || numero < 0);
        
        for (int i = 0; i < 9; i++) {
            if(i >= numero){
                arreglo[i] = arreglo[i + 1];
            }
        }
        System.out.println("Resultado: ");
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i] + " - ");
        }
    }
    
}
