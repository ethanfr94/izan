/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h1.ej2;

/**
 *
 * @author DAM122
 */
public class Bombilla {
    
    private static Estado general = Estado.OFF, bombilla = Estado.OFF;
    
   
    
    public Bombilla(){
       bombilla = Estado.ON;
    }
    
     public static void general(){
         if(general == Estado.ON){
             general = Estado.OFF;
             System.out.println("\tinterruptor general apagado");
         }
         else if(general == Estado.OFF){
             general = Estado.ON;
             System.out.println("\tinterruptor general encendido");
         }         
     }
     
     public void bombilla(){
        if(bombilla == Estado.ON){
             bombilla = Estado.OFF;
             System.out.println("\tinterruptor de bombilla apagado");
         }
         else if(bombilla == Estado.OFF){
             bombilla = Estado.ON;
             System.out.println("\tinterruptor de bombilla encendido");
         }
     }
    
     public void luce(){
         boolean luce;
         if(bombilla == Estado.ON && general == Estado.ON){
             System.out.println("\tla bombilla esta encendida");
         }
         else{             
             System.out.println("\tla bombilla esta apagada");
         }         
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
