/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h5.ej4;

/**
 *
 * @author DAM122
 */
public class Ej4 {

    public static void main(String[] args) {
        Instrumento i1 = new Instrumento();
        Flauta f1 = new Flauta();
        Piano p1 = new Piano();
        
        i1.tocarNota();
        f1.tocarNota();
        p1.tocarNota();
        
        Instrumento i2 = f1;
        i2.tocarNota();
        Flauta f2 = (Flauta) i2 ;
        f2.tocarNota();
    }
}
