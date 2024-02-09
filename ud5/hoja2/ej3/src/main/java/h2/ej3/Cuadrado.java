/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2.ej3;

/**
 *
 * @author DAM122
 */
public class Cuadrado extends Forma {

    public Cuadrado() {
        
    }

    
    
    
    @Override
    public String identidad() {
        super.identidad(); 
        id = "cuadrado";
        return id;
    }
  
    @Override
    public String toString() {
        return String.format(id);
    }
    
    
    
}
