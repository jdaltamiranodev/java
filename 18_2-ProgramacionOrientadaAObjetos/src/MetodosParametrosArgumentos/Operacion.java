
package MetodosParametrosArgumentos;

import javax.swing.JOptionPane;

public class Operacion {
    // Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    // Métodos
    
    // Método para sumar ambos números
    public void sumar(int numeroUno, int numeroDos){
        suma = numeroUno + numeroDos;
    }
    
    // Método para restar ambos números
    public void restar(int numeroUno, int numeroDos){
        resta = numeroUno - numeroDos;
    }
    
    // Método para multiplicar ambos números
    public void multiplicar(int numeroUno, int numeroDos){
        multiplicacion = numeroUno * numeroDos;
    }
    
    // Método para dividir ambos números
    public void dividir(int numeroUno, int numeroDos){
        division = numeroUno / numeroDos;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}
