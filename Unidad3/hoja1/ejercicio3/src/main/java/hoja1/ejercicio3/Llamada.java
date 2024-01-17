/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio3;

/**
 *
 * @author dam1
 */
public class Llamada {
    int duracion;
    
    public Llamada(){
    duracion=0;    
    }
    
     public float aPagar(int minutos, int segundos){         
         duracion=segundos+minutos*60;
         float precio;
         if(duracion<=60){
             precio=(float) 0.25;
         }
         else{           
         precio=(float) (0.25+(((duracion-60)/10))*0.1);                
     }
         return precio;
     }
     
}
