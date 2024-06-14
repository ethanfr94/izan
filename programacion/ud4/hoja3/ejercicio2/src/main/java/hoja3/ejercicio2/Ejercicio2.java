/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio2;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Curso c1 = new Curso(4);
       
        System.out.println(c1.iniciales());
        c1.desplaza();
        System.out.println(c1.iniciales());
        System.out.println(c1.verNombre(2));
        System.out.println(c1.esDaw());
    }
}
