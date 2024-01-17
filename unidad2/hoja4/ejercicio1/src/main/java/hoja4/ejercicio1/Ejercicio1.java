/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Circulo c1=new Circulo();
        
        c1.setRadio(5.30F);
        System.out.printf("radio de c1 tras darle valor a un radio por defecto: %.2f\n",c1.getRadio());
        
        Circulo c2=new Circulo(10);
        System.out.printf("radio de c2 por valor dado: %.2f\n",c2.getRadio());
    }
}
