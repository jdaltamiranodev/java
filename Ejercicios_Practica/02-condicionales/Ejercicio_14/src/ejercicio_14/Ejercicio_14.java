/*
    Ejercicio 14: Hacer un programa que pase de KG a otra unidad
    de medida de masa, mostrar en pantalla un menú con las opciones
    posibles. 

    1. Libras
    2. Gramos
    3. Miligramo
    4. Salir
*/
package ejercicio_14;

import javax.swing.JOptionPane;

public class Ejercicio_14 {

    public static void main(String[] args) {
        float kilogramo, conversion = 0;
        int opcion;
        
        kilogramo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor en KG a convertir: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la unidad"
                + " de medida a la que desea convertir: \n" 
                + "1. Libras.\n" 
                + "2. Gramos.\n"
                + "3. Miligramos.\n"
                + "4. Salir.\n"));
        
        switch(opcion){
            case 1: conversion = (float) (kilogramo * 2.2046); 
                    JOptionPane.showMessageDialog(null, kilogramo + " equivale a: " + conversion + " Libra/s.");
                    break;
            case 2: conversion = kilogramo * 1000; 
                    JOptionPane.showMessageDialog(null, kilogramo + " equivale a: " + conversion + " Gramo/s.");
                    break;
            case 3: conversion = kilogramo * 1000000; 
                    JOptionPane.showMessageDialog(null, kilogramo + " equivale a: " + conversion + " Miligramos/s.");
                    break;
            case 4: break;
            default: JOptionPane.showMessageDialog(null, "La opción elegida es incorrecta, no esta en el menú. "); break;
        }
    }
    
}
