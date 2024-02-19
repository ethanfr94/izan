/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ej1;

/**
 *
 * @author usuario
 */
public class Ej1 {

    public static void main(String[] args) {
        
        Cono co = new Cono(2,4);
        Cilindro ci = new Cilindro(2, 4);
        
        System.out.printf("el area del cono es %,.2f\n",co.area());
        System.out.printf("el volumen del cono es %,.2f\n", co.volumen());
        System.out.printf("el area del cilindro es %,.2f\n",ci.area());
        System.out.printf("el volumen del cilindro es %,.2f\n",ci.volumen());
        
    }
}
