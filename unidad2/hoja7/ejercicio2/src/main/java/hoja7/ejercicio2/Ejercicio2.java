/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja7.ejercicio2;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Triangulo t1= new Triangulo(2,3,2);
               String cadena= t1.esIsosceles()?"si":"no";

        System.out.println(cadena+" es isosceles");
               cadena= t1.esEquilatero()?"si":"no";

        System.out.println(cadena+" es equilatero");
        
        System.out.println("el perimetro es:"+t1.perimetro());
        
          Triangulo t2= new Triangulo(2,2,2);
        
        cadena= t2.esEquilatero()?"si":"no";
               
        System.out.println(cadena+" es equilatero");
        
        System.out.println("el perimetro es:"+t2.perimetro());
        
    }
}
