/* Una compañia de venta de carros usados, paga a su personal
de ventas un salario de $1000 USD mensuales, más una comisión
de $150 USD por cada carro vendido, más el 5% del valor de la 
venta por carro. Cada mes el contable de la empresa ingresa 
losdatos pertinentes en el sistema. Hacer un programa que calcule
e imprima el salario mensual de un vendedor dado
*/
package ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        
        final double SALARIO = 1000, COMISION = 150, 
                PORCENTAJE = 1.05;
        int carrosVendidos;
        double salarioMensual = 0; //porcentaje = 0
        
        System.out.print("Ingrese el número de carros vendidos"
                + " en el mes: ");
        carrosVendidos = entrada.nextInt();
        
        //porcentaje = 1.05 * (COMISION * carrosVendidos);
        
        salarioMensual = ((SALARIO + (COMISION * carrosVendidos)) 
                * PORCENTAJE);
        
        System.out.println("El salario del mes es: " + salarioMensual);
    }
    
}
