/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("introduce un numero entero");
        int n=teclado.nextInt();
        int x=n%7;
        int y=x==0?0:7-x;
        System.out.println("a " +n +" hay que sumarle " +y+" para que sea multiplo de 7");
    }
}
