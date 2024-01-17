/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

/**
 *
 * @author usuario
 */
public class Rectangulo {
    
    private int largo, ancho;
    
    public Rectangulo(){        
    }
    
    public Rectangulo (int largo, int ancho){//constructor con valores dados
        this.largo=largo;
        this.ancho=ancho;
    }
    
    public int getLargo(){//nos indica el largo
        return largo;
    }
    
    public int getAncho(){//nos indica el ancho
        return ancho;
    }
    
    public void setLargo(int largo){//nos permite cambiar el largo
        this.largo = largo;
    }
    
    public void setAncho(int ancho){//nos permite cambiar el ancho
        this.ancho = ancho;
    }
    
    public int area(){ //nos indica el area
     int area=getAncho()*getLargo();    
     return area; 
    }
    
    public float diagonal(){//nos indica la diagonal
        float diagonal=(float) Math.sqrt(Math.pow(largo, 2)+Math.pow(ancho, 2));
        return diagonal;
    }
}
