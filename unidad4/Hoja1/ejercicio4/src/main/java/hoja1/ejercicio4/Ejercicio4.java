/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio4;

/**
 *
 * @author usuario
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int [] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] b = new int [10];
        
        for (int i = 0; i<a.length; i++){
            b[a.length-i-1]=a[i];
        }
        
        for (int i = 0; i<=a.length-1; i++){            
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i<=b.length-1; i++){
            System.out.print(b[i]+" ");
        }
    }
}
