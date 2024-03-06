
package Operacion;

import javax.swing.JOptionPane;

public class Operacion {
    // Atributos
    int numeroUno;
    int numeroDos;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    // Métodos
    
    
    // Método para pedirle al usuario que nos digite 2 números
    public void leerNumeros(){
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    }
    
    // Método para sumar ambos números
    public void sumar(){
        suma = numeroUno + numeroDos;
    }
    
    // Método para restar ambos números
    public void restar(){
        resta = numeroUno - numeroDos;
    }
    
    // Método para multiplicar ambos números
    public void multiplicar(){
        multiplicacion = numeroUno * numeroDos;
    }
    
    // Método para dividir ambos números
    public void dividir(){
        division = numeroUno / numeroDos;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}
