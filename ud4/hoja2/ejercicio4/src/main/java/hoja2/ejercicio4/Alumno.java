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
    private String nombre_alumno;    private double [] notas;
    //creamos objeto alumno damos nombre por teeclado
    //e introducimos los valores del array notas por teclado
    public Alumno (String _nombre_alumno){
        nombre_alumno = _nombre_alumno;
        notas = new double [5];
        Scanner t;  int n;
        System.out.println("introduce sus notas");        
        for ( int i = 0; i < notas.length; i++){
            n = new Scanner (System.in).nextInt();
            notas[i] = n;  }  }
    
    public double menor(){
        double min = notas[0];
        for ( int i = 1; i < notas.length; i++){
            if (notas[i]<min){
                min = notas[i];
            }
        }       
        return min;
    }
    
     public double mayor(){
        double max = notas[0];
        for ( int i = 1; i < notas.length; i++){
            if (notas[i]>max){
                max = notas[i];
            }
        }
        return max;
    }
    
     public String mostrar (){
        double media = 0;
        for ( int i = 0; i < notas.length; i++){
            media += notas[i];
            } media /= notas.length;
        String cadena = nombre_alumno.toUpperCase()+" Nota media: "+media;         
        
        return cadena;
    }
     
    
}
