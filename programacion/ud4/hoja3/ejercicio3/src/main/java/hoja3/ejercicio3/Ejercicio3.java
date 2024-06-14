/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio3;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Comunidad c1 = new Comunidad ("andalucia", 4);
        System.out.println(c1.mostrar());
        System.out.println(c1.sorteo());
        System.out.println(c1.buscar("sevilla"));
        System.out.println(c1.buscar("badajoz"));

    }
}
