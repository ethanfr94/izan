/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Alumno {
    private String nombre_alumno;
    private double [] a;
    
    public Alumno (String nombre_alumno){
        this.nombre_alumno = nombre_alumno;
        a = new double [5];
        Scanner t;
        int n;
        System.out.println("introduce sus notas");
        
        for ( int i = 0; i < a.length; i++){
            n = new Scanner (System.in).nextInt();
            a[i] = n;
        }        
    }
    
    public double menor(){
        double min = a[0];
        for ( int i = 1; i < a.length; i++){
            if (a[i]<min){
                min = a[i];
            }
        }       
        return min;
    }
    
     public double mayor(){
        double max = a[0];
        for ( int i = 1; i < a.length; i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    
     public String mostrar (){
        double media = 0;
        for ( int i = 0; i < a.length; i++){
            media += a[i];
            } media /= a.length;
        String cadena = nombre_alumno.toUpperCase()+" Nota media: "+media;         
        
        return cadena;
    }
     
    
}
