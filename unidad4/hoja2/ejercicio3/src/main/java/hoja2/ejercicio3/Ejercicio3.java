/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio3;

/**
 *
 * @author DAM122
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Invierno i = new Invierno(5);
        System.out.println(i.mostrar(i.getA()));
        System.out.println("la temperatura media es: "+i.tempMedia());
        System.out.println("la temperatura en fahrenheit es: ");
        System.out.println(i.mostrar(i.fahrenheit()));
        
    }
}
