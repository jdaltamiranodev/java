/* Un programa que calcula e imprima el salario semanal de un empleado 
a partir de sus horas semanales trabajadas y de su salario por hora.
 */
package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasSemanales = 0;
        double salarioHora = 0, salarioSemanal = 0;
        
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        horasSemanales = scanner.nextInt();
        System.out.print("Ingrese el salario por hora: ");
        salarioHora = scanner.nextDouble();
        
        salarioSemanal = horasSemanales * salarioHora;
        
        System.out.println("el salario a  recibir es: " + salarioSemanal);
    }
    
}
