/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2.ej3;

/**
 *
 * @author DAM122
 */
public class Circulo extends Forma {

    @Override
    public String toString() {
        return String.format(id);
    }

    @Override
    public String identidad() {
        id = "circulo";
       return id;
    }
    
    
    
}
