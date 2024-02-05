/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        Circulo c1= new Circulo();
        Circulo c2=new Circulo(10);
        System.out.println("introduce un radio para c3: ");
        Circulo c3=new Circulo(teclado.nextDouble());
        c1.setRadio(5);
        System.out.println("el valor de c1 es: "+c1.getRadio());
        System.out.println("el valor de c3 es: "+c3.getRadio());
        System.out.printf("el area de c2 es: %.2f ",c2.area());
        System.out.printf("\nel area de c3 es %.2f y su longitud es %.2f",c3.area(), c3.longitud());
        
    }
}
