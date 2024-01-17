/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

/**
 *
 * @author usuario
 */
public class Coche {    
    private String matricula;
    private int velocidad;    
    public Coche (String matricula){//constructor por defecto
        this.matricula=matricula;
        this.velocidad=0;
    }    
    public Coche (String matricula, int velocidad){//constructor al que indicamos los valores
        this.matricula=matricula;
        this.velocidad=velocidad;
    }        
    public void acelera(int valor){//metodo para incrementar la velocidad pero sin pasar de 120
        velocidad=velocidad+valor;
        velocidad=velocidad>120?120:velocidad;
    }    
    public void frena(int valor){//metodo para reducir la velocidad hasta 0
        velocidad=velocidad-valor;
        velocidad=velocidad<0?0:velocidad;
    }    
    public String letras(){
        return matricula.substring(4);//metodo qu nos muestra las letras de la matricula
    }    
    public String MatrVeloc(){
        return "matricula= "+matricula+", velocidad= "+velocidad;//metodo que nos muestra la matricula y la velocidad
    }
    
}
