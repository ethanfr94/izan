/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       
        Scanner teclado=new Scanner(System.in);
        System.out.println("introduce un numero entero");
        int n=teclado.nextInt();
        System.out.println("introduce otro numero entero");
        int m=teclado.nextInt();
        int x=n%m;
        int y=x==0?0:m-x;
        System.out.println("a " +n +" hay que sumarle " +y+" para que sea multiplo de "+m);
        
    }
}
