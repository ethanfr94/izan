/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ejercicio3;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Serie s1 = new Serie (5, '*');
        Serie s2 = new Serie (5, '+');
        System.out.printf("el resultado es: %,.2f\n",s1.resultado());
        System.out.printf("el resultado es: %,.2f\n",s2.resultado());
    }
}
