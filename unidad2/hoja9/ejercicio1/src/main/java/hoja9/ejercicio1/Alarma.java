/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio1;


/** 
 *
 * @author dam1
 */
public class Alarma {  
    enum Timbre{ ON, OFF}//valores que puede tener un atributo
    private float temperatura;
    private Timbre timbre;    
    public Alarma(float temperatura){
        this.temperatura=temperatura;//constructor
        timbre=timbre.OFF;
    }    
    public Timbre comprueba(){//metodo que segun la temperatura activa el timbre de una alarma
       timbre =temperatura>35||temperatura<10?timbre.ON:timbre.OFF;    //ternario que indica el valor de una variable en fincion del valor de la otra
       return timbre;             
    }    
    public Timbre normaliza(){//metodo que apaga un timbre encendido y establece una temperatura dada
        temperatura=timbre==timbre.ON?25:temperatura;
        return timbre=timbre.OFF;
    }    
    public Timbre getTimbre(){//nos indica el valor del atributo
        return timbre;
    }    
    public float getTemperatura(){//nos indica el valor del atributo
        return temperatura;
    }
}
