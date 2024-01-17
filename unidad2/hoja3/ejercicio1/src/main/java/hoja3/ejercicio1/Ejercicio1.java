/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        double dolares, euros;
        
        Finanzas f=new Finanzas();
        Finanzas f2=new Finanzas(1.10);
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("introduce una cantidad en dolares: ");
        dolares=teclado.nextDouble();
        euros=f.dolaresToEuros(dolares);
        System.out.printf("son %.2f€\n",euros);
        
        System.out.println("introduce una cantidad en euros: ");
        euros=teclado.nextDouble();
        dolares=f2.eurosToDolares(euros);
        System.out.printf("son %.2f\n", dolares);
       
         System.out.println("introduce una cantidad en dolares: ");
        dolares=teclado.nextDouble();
        euros=f2.dolaresToEuros(dolares);
        System.out.printf("son %.2f€\n",euros);
        
        System.out.println("introduce una cantidad en euros: ");
        euros=teclado.nextDouble();
        dolares=f2.eurosToDolares(euros);
        System.out.printf("son %.2f\n", dolares);
        
    }
}
