/*
    Ejercicio 1: Construir un programa que calcule el área y el perimetro de un 
    cuadrilatero dad la longitud de sus dos lados. Los valores de la longitud
    deberán introducirse por línea de ordenes. Si es un cuadro, sólo se 
    proporcionará la longitud de uno de los lados al constructor.
*/
package Ejercicio_1;

public class Cuadrilatero {
    // Atributos
    private float ladoUno;
    private float ladoDos;
    
    // Métodos

    // Método Constructor 1 (Cuadrilatero)
    public Cuadrilatero(float ladoUno, float ladoDos) {
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    // Método Constructor 2 (Cuadrado)
    public Cuadrilatero(float ladoUno) {
        this.ladoUno = this.ladoDos = ladoUno;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (ladoUno + ladoDos);
        
        return perimetro;
    }
    
    public float getArea(){
        float area = (ladoUno * ladoDos);
        
        return area;
    }
    
}
