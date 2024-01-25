// incremento decremento
package pkg04.incremento_decremento;

public class Incremento_decremento {

    public static void main(String[] args) {
        int x = 5, y;
        
        /* En el primer caso se asigna y luego incrementa porque se pone ++
           como sufijo
        ***En el segundo caso se incrementa x y luego se asigna a y. En
           este caso ++ se pone como prefijo */
        y = x++; // Se asigna el valor de x a y y despues se incrementa x en 1
        System.out.println(y); // 5
        System.out.println(x); // 6
        
        y = ++x; // Se incrementa x en 1 y despues se asigna a y
        
        System.out.println(y); // 7
        System.out.println(x); // 7
    }
    
}
