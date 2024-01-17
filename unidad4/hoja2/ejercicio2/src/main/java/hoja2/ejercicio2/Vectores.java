/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Vectores {
    private int [] a;
    
    public Vectores(){
        Scanner t;
        a = new int[5];
        for ( int i = 0; i < a.length; i++){
            t = new Scanner (System.in);
            System.out.println("inserte el valor de la posicion "+i);
            a[i] = t.nextInt();
        }
    }
    
    public int menor(){
        int min = a[0];
        for ( int i = 1; i < a.length; i++){
            if (a[i]<min){
                min = a[i];
            }
        }       
        return min;
    }
    
     public int mayor(){
        int max = a[0];
        for ( int i = 1; i < a.length; i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
     
     public double media(){
         double media = 0;
        for ( int i = 0; i < a.length; i++){
            media += a[i];
            }
        return media/a.length;
        }
}
