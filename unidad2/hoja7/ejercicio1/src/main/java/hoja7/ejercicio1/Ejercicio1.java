/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja7.ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Rectangulo r1=new Rectangulo(2,4);
        
        System.out.println("el largo de r1 es: "+r1.getLargo());
        System.out.println("el ancho de r1 es: "+r1.getAncho());
        System.out.println("el area de r1 es: "+r1.area());
        System.out.printf("la diagonal de r1 es: %,.2f\n",r1.diagonal());
        
        r1.setLargo(15);
        r1.setAncho(20);
        
        System.out.println("el largo de r1 es: "+r1.getLargo());
        System.out.println("el ancho de r1 es: "+r1.getAncho());        
        System.out.println("el area de r1 es: "+r1.area());
        System.out.printf("la diagonal de r1 es: %,.2f\n",r1.diagonal());

        
    }
}
