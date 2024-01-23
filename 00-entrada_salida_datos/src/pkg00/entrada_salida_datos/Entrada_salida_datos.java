
package pkg00.entrada_salida_datos;

import java.util.Scanner;

public class Entrada_salida_datos {

    public static void main(String[] args) {
        // Me gusta definir el objeto con el mismo nombre de la clase
        // Scanner scanner = new Scanner(System.in);
        // Pero en este ejemplo le voy a poner entrada
        Scanner entrada = new Scanner(System.in);
        int numero; // entero
        float numero1; // float
        double numero2; // double
        String cadena; // String
        char letra; // char
        
        // Entrada entero
        System.out.println("Digite un numero entero: ");
        //numero = scanner.nextInt();
        numero = entrada.nextInt();
        
        // Entrada float
        System.out.println("Digite un numero decimal: ");
        numero1 = entrada.nextFloat();
        
        // Entrada double
        System.out.println("Digite un numero Double: ");
        numero2 = entrada.nextDouble();
        
        // Entrada cadena
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        
        // Entrada cadena
        System.out.println("Digite un caracter: ");
        letra = entrada.next().charAt(0);
        
        System.out.println("El numero entero es: " + numero);
        System.out.println("El numero decimal es: " + numero1);
        System.out.println("El numero double es: " + numero2);
        System.out.println("La cadena es: " + cadena);
        System.out.println("El caracter es: " + letra);
    }
    
}
