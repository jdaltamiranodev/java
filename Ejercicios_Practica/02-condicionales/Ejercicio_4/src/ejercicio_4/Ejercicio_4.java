/*
    Ejercicio 4: En MegaPlazza se hace un 20% de descuento a los
    clientes cuya compra supere los $300. ¿Cuál será la cantidad que 
    pagará una persona por su compra?
*/
package ejercicio_4;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {
        double compra, descuento = 0;
        
        compra = parseDouble(JOptionPane.showInputDialog("Digite el monto de su compra"));
        
        descuento = compra * 1.2;
        
        JOptionPane.showMessageDialog(null, "El valor de la compra con descuento es: " + descuento);
    }
    
}
