/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio3;

/**
 *
 * @author usuario
 */
public class Monedero {
    
    private float dinero;
    
    public Monedero(float dinero){   //constructor indicando valores
        this.dinero=dinero; 
    }
    
    public void guardar(float cantidad){//metodo para guardar o sumar al valor inicial
        dinero=dinero+cantidad;
    }
    
    public void sacar(float cantidad){
        String cadena=dinero<cantidad?"no puede sacar":"";//metodo para sacar o restar al valor inicial pero sin que pueda 
        System.out.println(cadena);                                                 //ser mayor al valor inicial y que nos muestre un mensaje en el caso de que sea mayor
        dinero=dinero<cantidad?dinero:dinero-cantidad;
    }
    
    public float getDinero(){//metodfo que nos muestra el valor
        return dinero;
    }
}
