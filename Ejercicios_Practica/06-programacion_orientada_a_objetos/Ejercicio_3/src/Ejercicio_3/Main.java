/*
    Construir un programa que dada una serie de vehículos caracterizados
    por su marca, modelo y precio, imprima las propiedades del vehículo
    más barato. Para ello, se deberán leer por teclado las características
    de cada vehículo y crear una clase que represente a cada uno de ellos.
*/
package Ejercicio_3;

import java.util.Scanner;

public class Main {
    public static int indiceVehiculoMasBarato(Vehiculo vehiculos[]){
        float precio;
        int indice = 0;
        
        precio = vehiculos[0].getPrecio();
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i].getPrecio() < precio){
                precio = vehiculos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
}
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceVehiculo;
        
        System.out.print("Digite la cantidad de vehículos: ");
        numeroVehiculos = scanner.nextInt();
        
        Vehiculo vehiculos[] = new Vehiculo[numeroVehiculos];
        
        for (int i = 0; i < vehiculos.length; i++) {
            scanner.nextLine();
            System.out.println("\nDigite las caracteristicas del Vehiculo " +
                    (i + 1) + ": ");
            System.out.print("Introduzca marca: ");
            marca = scanner.nextLine();
            System.out.print("Introduzca modelo: ");
            modelo = scanner.nextLine();
            System.out.print("Introduzca precio: ");
            precio = scanner.nextFloat();
            
            vehiculos[i] = new Vehiculo(marca, modelo, precio);
        }
        indiceVehiculo = indiceVehiculoMasBarato(vehiculos);
        System.out.print("\nEl vehiculo más barato es: ");
        System.out.print(vehiculos[indiceVehiculo].mostrarDatos());
        
    }
}
