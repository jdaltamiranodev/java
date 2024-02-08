/*
    Ciclo While

    while(condicion){
        Instrucciones;
    }
*/
package pkg08.bucle_while;

import java.util.Scanner;

public class Bucle_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, contador;
        
        System.out.println("Digite cuantos números quiere en pantalla");
        contador = scanner.nextInt();
        
        while(i < contador){
            System.out.println(i);
            i += 2;
        }
        
    }
    
}
