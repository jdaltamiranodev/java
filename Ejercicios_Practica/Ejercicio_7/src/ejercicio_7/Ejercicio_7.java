/*7. Construir un programa que dado un número total de horas, devuelva el número
de semanas, días y horas equivalentes.
Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.*/
package ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;
        
        System.out.print("Digite el número de horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / (24 * 7); // (24 * 7) = 168 horas a la semana
        dias = horasTotales % (24 * 7) / 24;
        horas = horasTotales % 24;
        
        System.out.println("\nEl equivalente es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
    }
    
}
