
package metodosRetornanValor;

public class Operacion {
    // Métodos
    
    // Método para sumar ambos números
    public int sumar(int numeroUno, int numeroDos){
        int suma = numeroUno + numeroDos;
        
        return suma;
    }
    
    // Método para restar ambos números
    public int restar(int numeroUno, int numeroDos){
        int resta = numeroUno - numeroDos;
        
        return resta;
    }
    
    // Método para multiplicar ambos números
    public int multiplicar(int numeroUno, int numeroDos){
        int multiplicacion = numeroUno * numeroDos;
        
        return multiplicacion;
    }
    
    // Método para dividir ambos números
    public int dividir(int numeroUno, int numeroDos){
        int division = numeroUno / numeroDos;
        
        return division;
    }
    
    public void mostrarResultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}
