/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        float a,b;
        boolean x;
        String y;
        System.out.println("primer numero");
        a=teclado.nextFloat();
        System.out.println("segundo numero");
        b=teclado.nextFloat();
        x=a==b;
        y=a==b? "es igual":"no es igual";
        
        System.out.println("son iguales "+x);
        System.out.println("son iguales "+y);
    }
}
