
package MetodosParametrosArgumentos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String [] args){
        int numeroUno, numeroDos;
        
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        Operacion operacion = new Operacion();
        
        operacion.sumar(numeroUno, numeroDos);
        operacion.restar(numeroUno, numeroDos);
        operacion.multiplicar(numeroUno, numeroDos);
        operacion.dividir(numeroUno, numeroDos);
        operacion.mostrarResultados();
    }
}
