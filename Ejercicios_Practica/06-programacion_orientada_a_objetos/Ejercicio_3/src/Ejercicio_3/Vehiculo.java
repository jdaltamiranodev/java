/*
    Construir un programa que dada una serie de vehículos caracterizados
    por su marca, modelo y precio, imprima las propiedades del vehículo
    más barato. Para ello, se deberán leer por teclado las características
    de cada vehículo y crear una clase que represente a cada uno de ellos.
*/
package Ejercicio_3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String mostrarDatos(){
        return "Marca: " + this.marca + "\nModelo: " + this.modelo +
                "\nPrecio: $" + this.precio + "\n";
    }
}
