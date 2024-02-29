/*
    Ejercicio 16: se requiere desarrollar una aplicación que ayude
    a gestionar las notas de un centro educativo. Cada grupo (o clase)
    está compuesto por 5 alumnos. Se pide leer las notas del primer,
    segundo y tercer trimestre de un grupo. Debemos mostrar al final
    la nota media del grupo en cada trimestre, y la media del alumno
    que se encuentra en la posición N (N se lee por teclado).
*/
package ejercicio_16;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] primerTrimestre = new float[5];
        float[] segundoTrimestre = new float[5];
        float[] tercerTrimestre = new float[5];

        for(int j = 0;j < 3; j++){
            if(j == 0){
               System.out.print("NOTAS PRIMER PARCIAL\n"); 
            }else{
                if(j == 1){
                  System.out.print("NOTAS SEGUNDO PARCIAL\n");   
                }else{
                   System.out.print("NOTAS TERCER PARCIAL\n"); 
                }
            }
            for(int i=0;i<5;i++){
            System.out.print("Alumno["+(i+1)+"]: ");
            if(j == 0){
               primerTrimestre[i] = scanner.nextFloat();
            }else{
                if(j == 1){
                  segundoTrimestre[i] = scanner.nextFloat();  
                }else{
                   tercerTrimestre[i]=scanner.nextFloat(); 
                }
            }
           }
        }

        float mediaPrimer = 0 , mediaSegundo = 0, mediaTercer = 0;
        for(int i=0;i<5;i++){
              mediaPrimer += primerTrimestre[i];
              mediaSegundo += segundoTrimestre[i];
              mediaTercer += tercerTrimestre[i];
        } 
        int posicion;
        do{
           System.out.print("Ingrese la posicion del alumno[1-5]: ");
           posicion = scanner.nextInt(); 
        }while(posicion<1 || posicion>6);
        float media = (primerTrimestre[posicion - 1] + segundoTrimestre[posicion - 1] + tercerTrimestre[posicion - 1]) / 3;

        System.out.println("La media del Primer parcial es: "+mediaPrimer/5);
        System.out.println("La media del Segundo parcial es: "+mediaSegundo/5);
        System.out.println("La media del Tecer parcial es: "+mediaTercer/5);
        System.out.println("La media del Alumno es: "+media);
    }
}
