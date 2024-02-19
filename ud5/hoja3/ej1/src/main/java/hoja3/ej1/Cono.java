/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ej1;

/**
 *
 * @author usuario
 */
public class Cono extends Figura {

    public Cono(int r, int h) {
        super(r, h);
    }

    @Override
    public double area() {
        double g = Math.sqrt(Math.pow(super.h, 2)+Math.pow(super.r, 2));
        double area = Math.PI*super.r*(super.r+g);
        
        return area;
    }

    @Override
    public double volumen() {
    
        double volumen = (Math.PI*Math.pow(super.r, 2)*super.h)/3;
        
        return volumen;    
    }

    
    
    
}
