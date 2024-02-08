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
public class Perecederos extends Articulo{

    private int mes;
    private int anio;

    public Perecederos(int mes, int anio, String desc, int cod, double precio) {
        super(desc, cod, precio);
        this.mes = mes;
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    
    
    @Override
    public String toString() {
        return super.toString().concat(String.format("caduca en %i / %i", mes, anio)); 
        
    }
    
    
    
    
    
}
