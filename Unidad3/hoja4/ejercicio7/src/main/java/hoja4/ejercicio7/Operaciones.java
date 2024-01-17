/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio7;

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
public class Operaciones {
    int n;
    
    public Operaciones(int n){
        this.n=n;
    }
    
    public void cifras(){//contar el numero de cifras del numero
      int c = String.valueOf(n).length();
        System.out.println("el numero "+n+" tiene "+c+" cifras");  
    }
    
    public void multiplos(){// mostrar los 10 primeros multiplos
        for (int x=1; x<=10;x++){
            System.out.println(n+" x "+x+" = "+n*x);
        }            
    }
    
    public void perfecto(){//decir si el numero es perfecto
        int sumadiv = 0;
        for(int x=1; x < n; x++){
            if (n % x == 0){
                sumadiv += x;
            }
        }
            if (sumadiv == n){
                System.out.println("el numero es perfecto");
            } else{
                System.out.println("el numero no es perfecto");
            }
        
            
    }
}
