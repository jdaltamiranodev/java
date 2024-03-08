// Encapsulamiento y métodos accesores
package modificadoresDeAcceso;

public class ClaseUno {
    private int edad;
    private String nombre;
    
    // Método Setter: establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    // Método Getter: obtener la edad
    public int getEdad(){
        return edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
