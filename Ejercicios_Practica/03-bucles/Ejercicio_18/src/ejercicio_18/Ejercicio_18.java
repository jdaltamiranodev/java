/*
    Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que
    no se introduce el precio por litro. Solo existen tres productos con precios:

    1 - 0.6 $/litro
    2 - 3 $ / litro
    3 - 1,25 € / litro
*/
package ejercicio_18;

import javax.swing.JOptionPane;

public class Ejercicio_18 {

    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0, tipoProducto;
        float precioLitro = 0, importeFactura = 0, facturacionTotal = 0;
        
        for (int i = 0; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo No: "
                    + i + "\nDigite el código: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo No: " 
                    + i + "\nDigite la cantidad: "));
            tipoProducto = Integer.parseInt(JOptionPane.showInputDialog("Articulo "
                    + "No: " + i + "\nDigite el tipo de producto: "));
            
            switch(tipoProducto){
                case 1: precioLitro = 0.6f / (float)litros; break;
                case 2: precioLitro = 3 / (float)litros; break;
                case 3: precioLitro = 1.25f / (float)litros; break;
                default: System.out.println("Ingreso un dato incorrecto"); break;
            }
            
            importeFactura = precioLitro;
            facturacionTotal += importeFactura; // Suma iterativa de las facturas
            
            if(codigo == 1){
                litrosArticulo1 += litros;
            }
            if(importeFactura > 600){
                conteoMas600++;
            }
        }
        
        System.out.println("Resumen de ventas:");
        System.out.println("Facturacion Total: :" + facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: " + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a 600: " + conteoMas600);
    }
    
}
