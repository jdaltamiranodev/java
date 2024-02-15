/*
    Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a 
    continuación realizar la media de los números positivos, la media de los
    negativos y contar el número de ceros.
*/
package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numeros[] = new float[5];
        float sumaPositivos = 0, sumaNegativos = 0, mediaPositivos = 0, 
                mediaNegativos = 0;
        int conteoPositivos = 0, conteNegativos = 0, conteoCeros = 0;
        
        System.out.println("Guardand los números en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". Digite un número");
            numeros[i] = scanner.nextFloat();
            
            if(numeros[i] == 0){
                conteoCeros++;
            }else if(numeros[i] > 0){
                sumaPositivos += numeros[i];
                sumaPositivos++;
            }else{
                sumaNegativos += numeros[i];
                sumaNegativos++;
            }
        }
        
        // Media de los números positivos
        if(conteoPositivos == 0){
            System.out.println("No se puede sacar la media de los números positivos.");
        }else{
            mediaPositivos = sumaPositivos / conteoPositivos;
            System.out.println("La media de los números positivos es: " + mediaPositivos);
        }
        
        // Media de los números negativos
        if(conteNegativos == 0){
            System.out.println("No se puede sacar la media de los números negativos.");
        }else{
            mediaNegativos = sumaNegativos / conteNegativos;
            System.out.println("La media de los números negativos es: " + mediaNegativos);
        }
    }
    
}
