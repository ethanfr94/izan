/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio7;

import java.util.Scanner;


/**Programa que nos pide un número entero positivo y luego nos permita realizar la opción que
pulsemos en el siguiente menú:

1.- contar cuantas cifras tiene
2.- escriba sus 10 primeros múltiplos
3.- decir si es perfecto
4.- salir

Cada una de estas opciones del menú, estarán resueltas en métodos en una clase aparte
denominada Operaciones. Esta clase tiene un atributo de tipo entero, que se inicializa con un
constructor por parámetros. Las operaciones se realizan sobre este atributo.
Un número perfecto, es cuando la suma de los divisores de un número es igual al propio número.
El menor número perfecto es el 6. Sus divisores son 1,2 y 3, se cumple que 1+2+3=6
El siguiente número perfecto es el 28. Sus divisores son 1,2,4,7 y 14, se cumple 1+2+4+7+14=28
 *
 * @author usuario
 */
public class Ejercicio7 {

    public static void main(String[] args) {
      Scanner t = new Scanner (System.in);
        
        byte opcion=0;
        do{
            System.out.println("introduce un numero positivo");
        int n = t.nextInt();
            
        Operaciones op = new Operaciones (n);
        
        System.out.println("\telige una accion");
        System.out.println("1. contar las cifras del numero");
        System.out.println("2. escribir sus 10 primeros multiplos");
        System.out.println("3. es pefecto?");
        System.out.println("4. adios");
        
        if (op.n > 0){
            opcion = t.nextByte();
        
        
            switch (opcion){
                case 1 -> op.cifras();
                case 2 -> op.multiplos();
                case 3 -> op.perfecto();
                case 4 -> System.out.println("salir");
                default -> System.out.println("opcion no valida");
            }   
        }
        else{
            System.out.println("el numero  no es positivo");
        }
        }while (opcion != 4);
    
    }
}


