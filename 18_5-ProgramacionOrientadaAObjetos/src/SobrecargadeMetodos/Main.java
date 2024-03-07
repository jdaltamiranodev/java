
package SobrecargadeMetodos;

public class Main {
    public static void main(String [] args){
        Persona persona = new Persona("Alberto", 30);
        
        persona.correr();
        
        Persona personaUno = new Persona("43453454");
        personaUno.correr(100);
    }
}
