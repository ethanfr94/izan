/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h1.ej1;

/**
 *
 * @author DAM122
 */
public class Pajaro {
    private String color;
    private int edad;
    private static int numPajaros;
    
    public Pajaro(){
        nuevoPajaro();
    }
    
    public Pajaro(String _color, int _edad){
        nuevoPajaro();
        color = _color;
        edad = _edad;        
    }
    
    private static void nuevoPajaro(){
        numPajaros++;
    }
    
    public static void muestraPajaro(){
        System.out.printf("el numero de pajaros es: %d",numPajaros);
    }
    
}
