/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio6;

/**
 *
 * @author usuario
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int mayor = 0;
        int [] a = new int [10];
        for (int i = 0; i<a.length; i++){
            a[i] = (int) Math.floor(Math.random()*50);
            System.out.print(a[i]+" ");
            if (a[i]>mayor){
                mayor = a[i];
            }
        }
        System.out.println("");
        System.out.println("el numero mayor es: "+mayor);
    }
}
