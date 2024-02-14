/*
    Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes 
    necesita un programa para gestionar las facturas. En cada factura figura:
    el código del artículo, la cantidad vendida en litros y el precio por litro.
    Se pide de 5 facturas introducidas: Facturación total, cantidad en litros
    vendidos del artículo 1 y cuantas facturas se emitieron de más de $600 USD
*/
package ejercicio_17;

import javax.swing.JOptionPane;

public class Ejercicio_17 {

    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro, importeFactura, facturacionTotal = 0;
        
        for (int i = 0; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo No: "
                    + i + "\nDigite el código: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo No: " 
                    + i + "\nDigite la cantidad: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo "
                    + "No: " + i + "\nDigite el precio por litros: "));
            
            importeFactura = (float) litros * precioLitro;
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
