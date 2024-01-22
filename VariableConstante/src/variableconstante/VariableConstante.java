
package variableconstante;

public class VariableConstante {

    public static void main(String[] args) {
        int numeroVariable = 10; // Se declara y asigna numeroVariable en 10
        System.out.println("Númmero variable: " + numeroVariable);
        numeroVariable = 20; // Se reasigna el valor de 20 a numeroVariable
        System.out.println("Númmero variable: " + numeroVariable);
        
        final int numeroConstante = 18; // Se declara numeroConstante y se asigna 18, la palabra final indica que el numero no va a cambiar durante al ejecución del programa
        System.out.println("Númmero constante: " + numeroConstante);
    }
    
}
