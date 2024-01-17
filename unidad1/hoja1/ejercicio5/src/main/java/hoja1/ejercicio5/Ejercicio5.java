/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio5;

/**
 *
 * @author usuario
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        float x=5;
        float y=4;
        float suma = x+y;
        float resta= x-y;
        float multiplicacion=x*y;
        float division=x/y;
        double expX= Math.pow(x,2);
        double raizX= Math.sqrt(x);
                
        System.out.println("x+y= "+suma);
        System.out.println("x-y= "+resta);
        System.out.println("x*y= "+multiplicacion);
        System.out.println("x/y= "+division);
        System.out.println("x^2= "+expX);
        System.out.println("√x"+raizX);
    }
}
