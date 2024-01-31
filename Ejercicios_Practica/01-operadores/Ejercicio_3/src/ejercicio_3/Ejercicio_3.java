/* Guillermo tiene N dolares. Luis tiene la mitad de lo que posee 
Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo
juntos. Hacer un programa que calcule e imprima la cantidad de 
dinero que tienen entre los tres.
 */
package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        
        double dolaresGuillermo, dolaresLuis = 0, dolaresJuan = 0, 
                dolaresTotales = 0;
        
        System.out.print("Ingrese la cantidad de dolares que tiene Guillermo: ");
        dolaresGuillermo = entrada.nextDouble();
        
        dolaresLuis = dolaresGuillermo / 2;
        dolaresJuan = (dolaresLuis + dolaresGuillermo) / 2;
        
        dolaresTotales = dolaresGuillermo + dolaresLuis + dolaresJuan;
        
        System.out.println("Guillermo tiene: " + dolaresGuillermo + 
                " dolares. \nLuis tiene: " + dolaresLuis + 
                " dolares.\nJuan tiene: " + dolaresJuan + 
                " dolares\nEntre los tres tienen: " + dolaresTotales + 
                        " dolares.");
    }
    
}
