/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio2;

/**
 *
 * @author dam1
 */
public class Triangulo {
    private int lado1, lado2, lado3;    
    public Triangulo (int lado1, int lado2, int lado3){
    this.lado1=lado1;//constructor con valorers indicados
    this.lado2=lado2;
    this.lado3=lado3;
    }    
    public boolean esIsosceles() {//metodo que nos indica si almenos 2 de los lados son iguales
        return lado1==lado2||lado2==lado3||lado1==lado3;        
    }    
    public boolean esEquilatero() {//metodo que nos indica si todos los lados son iguales
        return lado1==lado2&&lado2==lado3;
     }  
    public int perimetro(){//metodo que nos indica el perimetro
        return lado1+lado2+lado3;
    }
}
