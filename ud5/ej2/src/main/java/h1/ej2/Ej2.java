/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h1.ej2;

/**
 *
 * @author DAM122
 */
public class Ej2 {

    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        System.out.println("comprobamos el estado de la bombilla");
        b1.luce();
        System.out.println("pulsamos el interruptor de la bombilla");
        b1.bombilla();
        System.out.println("volvemos a pulsar el interruptor de la bombilla");
        b1.bombilla();
        System.out.println("pulsamos el interruptor general");
        Bombilla.general();
        b1.luce();
        
    }
}
