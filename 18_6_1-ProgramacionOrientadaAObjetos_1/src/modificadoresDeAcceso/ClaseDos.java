
package modificadoresDeAcceso;

public class ClaseDos {
    public static void main(String [] args){
        ClaseUno objeto = new ClaseUno();
        
        objeto.setEdad(10);
        System.out.println("La edad es: " + objeto.getEdad());
        
        objeto.setNombre("Alberto");
        System.out.println("El nombre es: " + objeto.getNombre());
    }
}
