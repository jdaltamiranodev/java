
package pkg01.entrada_salida_datos_joptionpane;

import javax.swing.JOptionPane;

public class Entrada_salida_datos_joptionpane {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
       decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
       
       JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
       JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
       JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
       JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        
    }
    
}
