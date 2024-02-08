/*
    Ciclo for
    
    for(inicialización; condición; aumento o decremento){
        Instrucciones;
    }
*/
package pkg10.bucle_for;

import java.util.Scanner;

public class Bucle_for {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador;
        
        System.out.print("Digite la cantidad de terminos: ");
        contador = scanner.nextInt();
        
        for(int i = 0; i <= contador; i++){
            System.out.println(i);
        }
    }
    
}
