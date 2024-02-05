/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ej3;

/**
 *
 * @author usuario
 */
public class Aparatos {
    private static double consumoTotal;

    public static double consumo() {
        return consumoTotal;
    }
    
    private double potencia;
    private boolean encendido;

    public Aparatos(double potencia) {
        this.potencia = potencia;
        this.encendido = false;
    }
    
    public void on(){
        consumoTotal += potencia;
        System.out.println("encendido");        
    }
    
    public void off(){
        consumoTotal -= potencia;
        System.out.println("apagado");        
    }
    
}
