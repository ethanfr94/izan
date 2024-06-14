
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

    @Override
    public String toString() {
        return String.format("el identificador de esta forma es: ",id);
    }
    
     @Override
    public void identidad() {
        id = "cuadrado";       
    }    
}
