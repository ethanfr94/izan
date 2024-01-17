/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

/**
 *
 * @author usuario
 */
public class Circulo {
    
    private double radio;
    
    public Circulo(){//inicializa el objeto circulo con valor 0
    }
    
    public Circulo(double radio){//inicializa  el objeto circulo con el valor indicado
        this.radio=radio;
    }
    
    public double getRadio() {// nos muestra el radio del circulo
        return radio;
    }
    
    public void setRadio(double radio){//nos permite cambiar el radio del circulo
        this.radio=radio;
    }
    
    public double area(){
        return Math.PI*Math.pow(radio, 2);//nos muestra el area del circulo
    }
    public double longitud(){//nos muestra la longitud del circulo
        return 2*Math.PI*radio;
    }
    
    
}
