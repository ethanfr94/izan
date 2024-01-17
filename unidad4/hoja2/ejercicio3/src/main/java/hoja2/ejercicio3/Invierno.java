/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Invierno {
    private double [] a;
    
    public Invierno(int n){
        a = new double[n];
        
        System.out.println("introduce los valores del array");
        for ( int i = 0; i < a.length; i++){
           Scanner t = new Scanner (System.in);
           a[i] = t.nextDouble();
            }
        }
    
    public double tempMedia(){
        double media = 0;
        for ( int i = 0; i < a.length; i++){
            media += a[i];
            }
        return media/a.length;
    }
    
    public double [] fahrenheit(){
        double [] b = new double [a.length];
        for ( int i = 0; i < a.length; i++){
            b[i] = a[i] * 1.8 + 32;            
            }
        return b;
    }
    
    public String mostrar (double [] array){
        String cadena = "[ ";         
        for ( int i = 0; i < array.length; i++){
            
        cadena += array[i] + " "; 
    
        }
        cadena += " ]";
        return cadena;
    }

    public double[] getA() {
        return a;
    }
    
}
