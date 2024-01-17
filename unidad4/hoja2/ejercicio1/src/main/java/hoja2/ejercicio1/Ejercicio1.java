/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio1;

/**
 *
 * @author DAM122
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        System.out.println("array base");
        op.mostrar();
        op.multiplicar();
        System.out.println("array multiplicado por 2");
        op.mostrar();
        System.out.println("la suma de las posiciones pares es "+op.par());
    }
}
