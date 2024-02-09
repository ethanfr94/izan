/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ej1;

/**
 *
 * @author usuario
 */
public abstract class Figura {
    
    protected int r, h;

    public Figura(int r, int h) {
        this.r = r;
        this.h = h;
    }
    
    public abstract double area();
    public abstract double volumen();
    
    
}
