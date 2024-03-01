/*
    Busqueda Secuencial:

    arreglo[] = {3, 1, 2, 5, 4}; dato = 2;
*/
package busquedasecuencial;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BusquedaSecuencial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = {4, 1, 5, 2, 3};
        int dato;
        boolean bandera = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número "
                + "a buscar: "));
        
        // Busqueda Secuencial
        int i = 0;
        while(i < arreglo.length && bandera == false){
            if(arreglo[i] == dato){
                bandera = true;
            }
            i++;
        }
        
        if(bandera == false){
            JOptionPane.showMessageDialog(null, "El número no se encuentra "
                    + "en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado"
                    + " en la posición: " + (i - 1));
        }
    }
    
}
