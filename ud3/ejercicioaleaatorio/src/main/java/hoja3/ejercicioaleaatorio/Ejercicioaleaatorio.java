/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3.ejercicioaleaatorio;
import java.util.Random;

/**
 *
 * @author dam1
 */
public class Ejercicioaleaatorio {

    public static void main(String[] args) {
        System.out.println("utilizando la clase math");
        int numero = 200, numero2 = 100;
        int x;
        x = (int) Math.floor(Math.random() * numero);
// x será un número entre 0 y N-1
        System.out.println(x);

        x = (int) Math.floor(Math.random() * numero) + 1;
// x será un número entre 1 y N
        System.out.println(x);

        x = (int) Math.floor(Math.random() * (numero - numero2 + 1)) + numero2;
//x será un número entre M y N ambos incluidos y siendo M mayor que N
        System.out.println(x);

        System.out.println("utilizando la clase random");

        Random r = new Random();
        int y;
        y = r.nextInt(numero);
// y será un número entre 0 y N-1
        System.out.println(y);
        y = r.nextInt(numero) + 1;
// y será un número entre 1 y N
        System.out.println(y);

        y = r.nextInt(numero - numero2 + 1) + numero2;
//y será un número entre M y N ambos incluidos y siendo M mayor que N
        System.out.println(y);

    }
}
