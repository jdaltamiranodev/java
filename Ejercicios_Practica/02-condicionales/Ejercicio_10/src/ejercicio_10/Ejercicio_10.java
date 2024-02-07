/*
    Ejercicio 9: Pedir el día, mes y año de una fecha e indicar
    si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años
    bisiestos
*/
package ejercicio_10;

import javax.swing.JOptionPane;

public class Ejercicio_10 {

    public static void main(String[] args) {
        int dia, mes, anio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el anio: "));
        
        if(dia >= 1 && dia <= 31){
            if(mes >= 1 && mes <= 12){
                if(anio != 0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");
        }
    }
    
}
