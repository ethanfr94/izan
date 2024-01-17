/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

/**
 *
 * @author dam1
 */
public class Ticket {
    float kg;
    
    public Ticket(float _kg){
        kg=_kg;        
    }
    
    public String print(){
        if(kg<10){
        String cadena;
        cadena= "peso: "+kg+"\nimporte: "+kg*1.5;
                return cadena;
    }
    
        else{
        String cadena;
        cadena= "peso: "+kg+"\nimporte: "+kg*1.2;
                return cadena;
    }
}
    
}
