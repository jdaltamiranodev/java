/*
    Ejercicio 13: Hacer un programa que simule un cajero automatico
    con un saldo inicial de 1000 Dólares, con el siguiente menú
    de opciones:

    1. Ingresar dinero a la cuenta
    2. Retirar dinero de la cuenta
    3. Salir
*/
package ejercicio_13;

import javax.swing.JOptionPane;

public class Ejercicio_13 {

    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Bienvenido a su Cajero Automatico\n" 
                + "1. Ingresar dinero a la cuenta\n" 
                + "2. Retirar dinero de la cuenta\n" 
                + "3. Salir"));
        
        switch(opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta: "));
                    saldoActual = saldo_inicial + ingreso;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));
                    
                if(retiro > saldo_inicial){
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro.");
                }else{
                    saldoActual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                }
                break;
            
            case 3: break;
            default: JOptionPane.showMessageDialog(null, "Se equivoco de opción de menu"); break;
                    
        }
        
        
    }
    
}
