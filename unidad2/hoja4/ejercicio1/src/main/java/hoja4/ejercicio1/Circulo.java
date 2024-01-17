/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

/**
 *
 * @author usuario
 */
public class Circulo {
    
    private float Radio;
    
    public Circulo(){//constructor por defecto
    }
    
    public Circulo(float Radio){//constructor con valores dados
        this.Radio=Radio;
    } 
    
    public float getRadio(){//metodo que nos indica el radio
        return Radio;
    }
    
    public void setRadio(float Radio){//metodo que nos permite cambiar el radio
        this.Radio=Radio;
    }
    
    
    
}
