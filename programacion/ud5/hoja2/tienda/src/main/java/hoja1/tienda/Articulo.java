/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.tienda;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Articulo {
    protected String desc;
    protected int cod;
    protected double precio;

    public Articulo(String desc, int cod, double precio) {
        this.desc = desc;
        this.cod = cod;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("el articulo %s con el codigo %d tiene un precio de %,.2f€ " ,desc, cod, precio);
    }
    
   
    
    
    
    
    
    
}
