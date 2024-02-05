/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author usuario
 */
public class Finanzas {
     public double cambio;//dolares a euros
     
     public Finanzas(){//constructor indicando el valor del cambio por defecto
         cambio=1.06;
     }
     
     public Finanzas(double cambio){//constructor añadiendo un valor al cambio
         this.cambio=cambio;
     }    
     
     public double dolaresToEuros(double dolares){//metodo para pasar de dolares a euros
         return dolares/cambio;
     }
     
     public double eurosToDolares(double euros){//metodo para pasar de euros a dolares
         return euros*cambio;
     }
     
     
}
