/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio7;

/**
 *
 * @author usuario
 */
public class Ejercicio7 {

    public static void main(String[] args) {
         int mayor = 0;
        int [] a = new int [10];
        int [] b = new int [10];
        
        for (int i = 0; i<=a.length-1; i++){
            a[i] = (int) Math.floor(Math.random()*50);
            System.out.print(a[i]+" ");
            }System.out.println("");
        
        for (int i = 0; i<=a.length-1; i++){
            b[i]=a[i];         
            if (a[i]>mayor){
                mayor = b[i];    
               
            } System.out.print(b[i]+" ");
        }
    }
}
