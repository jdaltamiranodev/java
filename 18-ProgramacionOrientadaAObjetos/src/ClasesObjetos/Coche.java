
package ClasesObjetos;

public class Coche {
    // Atributos
    String color;
    String marca;
    int km;
    
    // Método
    public static void main(String[] args){
        Coche coche = new Coche();
        coche.color = "Blanco";
        coche.marca = "Audi";
        coche.km = 0;
        
        System.out.println("El color del coche es: " + coche.color);
        System.out.println("El color del coche es: " + coche.marca);
        System.out.println("El color del coche es: " + coche.km);
        
        Coche cocheUno = new Coche();
        cocheUno.color = "Rojo";
        cocheUno.marca = "Ferrari";
        cocheUno.km = 100;
        
        System.out.println("\nEl color del coche es: " + cocheUno.color);
        System.out.println("El color del coche es: " + cocheUno.marca);
        System.out.println("El color del coche es: " + cocheUno.km);
        
    }
}
