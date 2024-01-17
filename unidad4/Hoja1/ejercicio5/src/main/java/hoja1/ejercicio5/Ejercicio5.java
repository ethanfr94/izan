/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio5;

/**
 *
 * @author usuario
 */
public class Ejercicio5 {

    public static void main(String[] args) {
       int [] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] b = new int [10];
        
        
        
        for (int i = 0; i<a.length; i++){
            b[a.length-i-1]=a[i];
        }
        
        a=b;
        
        for (int i = 0; i<=a.length-1; i++){            
            System.out.print(a[i]+" ");
        }
        
        
    }
}
