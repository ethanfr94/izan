/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio4;

/**
 *
 * @author dam1
 */
public class Billete {
    float distancia, estancia, precio;
    
    
    public Billete(int _distancia, int _estancia){
        distancia=_distancia;
        estancia=_estancia;        
    }
    
    public float importe(){
        if(distancia>800&&estancia>7){           
            precio=(float) ((distancia*0.6)*0.7);            
        }
        else{
            precio=(float) (distancia*0.6);
        }
        return precio;
    }
}
