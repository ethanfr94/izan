/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h1.ej1;

/**
 *
 * @author DAM122
 */
public class Ej1 {

    public static void main(String[] args) {
        
        Integer[] a = new Integer [0];
        Contenedor<Integer> cont = new Contenedor(a);
        
        cont.insertarAlPrincipio(1);
        cont.insertarAlFinal(2);
        cont.insertarAlFinal(4);
        cont.extraerDelPrincipio();
        System.out.println(cont.toString());
       
    }
}
