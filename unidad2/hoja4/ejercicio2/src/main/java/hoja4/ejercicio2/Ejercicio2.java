/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio2;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
       Coche c1=new Coche("1234ABC",100);
       Coche c2=new Coche("5679DEF");
       
       c2.frena(10);
        System.out.println("c1= "+c2.MatrVeloc());
       
       c2.acelera(80);
        System.out.println("c2= "+c2.MatrVeloc());
       
        System.out.println("matricula de c1: "+c1.letras());
    }
}
