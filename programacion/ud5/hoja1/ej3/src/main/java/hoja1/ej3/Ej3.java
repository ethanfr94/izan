/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ej3;

/**
 *
 * @author usuario
 */
public class Ej3 {

    public static void main(String[] args) {
        Aparatos bombilla = new Aparatos(150);
        Aparatos plancha = new Aparatos(2000);
        System.out.println("el consumo total es de: "+Aparatos.consumo());
        bombilla.on();
        plancha.on();
        System.out.println("el consumo total es de: "+Aparatos.consumo());
        bombilla.off();
        System.out.println("el consumo total es de: "+Aparatos.consumo());
    }
}
