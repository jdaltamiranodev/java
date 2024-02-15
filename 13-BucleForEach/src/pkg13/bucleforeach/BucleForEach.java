/*
    Bucle For Each
*/
package pkg13.bucleforeach;

public class BucleForEach {

    public static void main(String[] args) {
        String[] nombres = {"Alejandro", "Maria", "Luisa", "Juan", "Jorge", "Flor", "Roberto"};
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
        for(String i: nombres){
            System.out.println("Nombre: " + i);
        }
    }
    
}
