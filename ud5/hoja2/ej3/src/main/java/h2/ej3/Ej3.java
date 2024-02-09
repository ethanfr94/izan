/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h2.ej3;

/**
 *
 * @author DAM122
 */
public class Ej3 {

    public static void main(String[] args) {
        Circulo ci = new Circulo();
        Cuadrado cu = new Cuadrado();
        Rombo ro = new Rombo();
        Triangulo tr = new Triangulo();
        System.out.println("cambiamos el id de cada elemento");
        ci.identidad();
        cu.identidad();
        ro.identidad();
        tr.identidad();
        System.out.println(ci.toString());
        System.out.println(cu.toString());
        System.out.println(ro.toString());
        System.out.println(tr.toString());
    }
}
