
package metodosRetornanValor;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        int numeroUno, numeroDos;
        
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        Operacion operacion = new Operacion();
        
        int suma = operacion.sumar(numeroUno, numeroDos);
        int resta = operacion.restar(numeroUno, numeroDos);
        int multiplicacion = operacion.multiplicar(numeroUno, numeroDos);
        int division = operacion.dividir(numeroUno, numeroDos);
        operacion.mostrarResultados(suma, resta, multiplicacion, division);
        
        System.out.println("\nImpresión desde el main");
        System.out.println("La suma es: " + operacion.sumar(numeroUno, numeroDos));
        System.out.println("La resta es: " + operacion.restar(numeroUno, numeroDos));
        System.out.println("La multiplicación es: " + operacion.multiplicar(numeroUno, numeroDos));
        System.out.println("La división es: " + operacion.dividir(numeroUno, numeroDos));
        
    }
}
