
package Estatico;

public class Estatico {
    private static String frase = "Primera Fase";
    
    public static int sumar(int numeroUno, int numeroDos){
        int suma = numeroUno + numeroDos;
        
        return suma;
    }
    public static void main(String [] args){
        System.out.println(Estatico.frase);
        System.out.println("La suma es: " + Estatico.sumar(3, 4));
    }
}
