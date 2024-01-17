/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Triatlon a1 = new Triatlon(7, "izan", 3);
        Triatlon a2 = new Triatlon();
        System.out.println(a1.mostrar());
        System.out.println(a1.esSeleccionado());
        System.out.println(a2.mostrar());
        System.out.println(a2.esSeleccionado());
    }
}
