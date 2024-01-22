
package tiposdedatos;

public class TiposDeDatos {

    public static void main(String[] args) {
        byte entero = 12; // tamaño 8 bits (1 byte) - rango (-128 - 127)
        short entero1 = 12345; // 16 bits (2 bytes) rango (-32.768 - 32.767)
        int entero2 = 123456789; // 32 bits (4 bytes) rango (-2.147.483.648 - 2.147.483.647)
        long entero3 = 1234567856; // 64 bits (8 bytes) rango (-9.223.372.036.854 - 9.223.372.854.775.807)
        float decimal = 3.45f; // 32 bits (4 bytes) rango (1.4e-045 - 3.4e+038)
        double doble = 5353; // 64 bits (8 bytes) rango (4.9e-324 - 1.8e+308)
        char caracter = 'a';
        boolean estado = true; // true o false
        
        System.out.println("----------Tipos de Datos primitivos:----------\n");
        System.out.println("Número entero: " + entero);
        System.out.println("Número entero: " + entero1);
        System.out.println("Número entero: " + entero2);
        System.out.println("Número entero: " + entero3);
        System.out.println("Número entero: " + decimal);
        System.out.println("Número Double: " + doble);
        System.out.println("Caracter: " + caracter);
        System.out.println("Booleano: " + estado);
        
        System.out.println("----------Tipos de Datos no primitivos:----------\n");
        Integer numero = null;
        String palabra = "Esta es una palabra";
        
        System.out.println("Númmero: " + numero);
        System.out.println("Palabra: " + palabra);
    }
    
}
