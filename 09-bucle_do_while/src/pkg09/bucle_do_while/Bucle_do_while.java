/*
    Ciclo do While

    do{
        Instrucciones;
    }while(condicion)
*/
package pkg09.bucle_do_while;

import java.util.Scanner;

public class Bucle_do_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1, contador;
        
        System.out.print("Digite el número hasta el que desea contar: ");
        contador = scanner.nextInt();
        
        do{
            System.out.println(i);
            i++;
        }while(i <= contador);
    }
    
}
