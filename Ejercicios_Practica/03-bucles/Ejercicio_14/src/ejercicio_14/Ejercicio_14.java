/*
    Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay 
    mayores de $1000.
*/
package ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sueldo, sumaSueldos = 0;
        int mayorDeMil = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite el sueldo número " + (i + 1) + " : ");
            sueldo = scanner.nextFloat();
            sumaSueldos += sueldo;
            if(sueldo > 1000){
                mayorDeMil++;
            }
        }
        System.out.println("La suma de sueldos es: " 
                + sumaSueldos + 
                " y los sueldos mayores de $1.000 son: " + mayorDeMil);
    }
    
}
