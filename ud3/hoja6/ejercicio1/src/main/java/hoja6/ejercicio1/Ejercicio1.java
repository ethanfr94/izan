/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja6.ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Tarjeta t = new Tarjeta ("izan", "1234567890", 1000);
       t.desbloquea(1234);
      
       t.desbloquea(t.getPin());
       t.pagar(150, t.getPin(), "descripcion", true);
    }
}
