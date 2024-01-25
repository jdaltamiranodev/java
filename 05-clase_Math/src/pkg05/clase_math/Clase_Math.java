
package pkg05.clase_math;

public class Clase_Math {

    public static void main(String[] args) {
        // double raiz = Math.sqrt(36); // raaiz cuadrada
        double exponenete = 5, base = 2;  
        double resultado = Math.pow(base, exponenete); // Potenciación
        double numero = 4.56;  // debe ser double a long 
        long resultado1 = Math.round(numero); // redondeo de un numero 
        float numero1 = 9.8f;
        int resultado2 = Math.round(numero1);
        double numeroAleatorio = Math.random();
        
        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(numeroAleatorio);
    }
    
}
