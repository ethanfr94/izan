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
    
    private static Luces general = Luces.OFF, bombilla = Luces.OFF;
    
   
    
    public Bombilla(){
       bombilla = Luces.ON;
    }
    
     public static void general(){
         if(general == Luces.ON){
             general = Luces.OFF;
             System.out.println("\tinterruptor general apagado");
         }
         else if(general == Luces.OFF){
             general = Luces.ON;
             System.out.println("\tinterruptor general encendido");
         }         
     }
     
     public void bombilla(){
        if(bombilla == Luces.ON){
             bombilla = Luces.OFF;
             System.out.println("\tinterruptor de bombilla apagado");
         }
         else if(bombilla == Luces.OFF){
             bombilla = Luces.ON;
             System.out.println("\tinterruptor de bombilla encendido");
         }
     }
    
     public void luce(){
         boolean luce;
         if(bombilla == Luces.ON && general == Luces.ON){
             System.out.println("\tla bombilla esta encendida");
         }
         else{             
             System.out.println("\tla bombilla esta apagada");
         }         
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
