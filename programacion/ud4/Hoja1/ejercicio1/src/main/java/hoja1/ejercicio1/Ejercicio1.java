/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio1;

/**
 *
 * @author DAM122
 */
public class Ejercicio1 {

    public static void main(String[] args) {
         int i;
        //creamos y definimos el array con sus valores
        int[] a = {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2};
        //mostramos el valor de cada posicion del array     
        for (i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        //cambiamos el valor de cada posicion del array utilizando for diciendo que
        //i es cada una de las posiciones y que en cada ciclo cambia una posicion
        for (i = 0; i<a.length; i++){
            a[i] = -1;
            System.out.print(a[i]+" ");
        }                
        System.out.println("");
        //hacemos lo mismo que en el anterior for pero haciendo que los valores 
        //se creen aleatoriamente
        for (i = 0; i<a.length; i++){
            a[i] = (int) Math.floor(Math.random()*50);
            System.out.print(a[i]+" ");
        }
    }
}
