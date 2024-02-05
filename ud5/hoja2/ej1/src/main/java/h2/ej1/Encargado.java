/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2.ej1;

/**
 *
 * @author DAM122
 */
public class Encargado extends Empleado {
    
    public Encargado (int n){
        super(n);                
    }

    @Override
    protected int getSueldo() {
        return (int) (super.getSueldo()*1.1);
    }

    
    
    
}
