/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado;
        Matriz m = new Matriz();    
        m.muestra();
        m.multiplica();
        m.muestra();
        int[] aspa = m.valoresAspa();
        for (int i = 0; i < aspa.length; i++) {
            System.out.print(aspa[i] + " ");        }        
        System.out.print("que tabla de multiplicar quieres ver? ");
        int n= new Scanner(System.in).nextInt();
        if (n>9 && n<0) {System.out.println("valor introducido no valido");}
        else {int[] tabla = m.tablaMultiplicar(n);
            for (int i = 0; i < tabla.length; i++) {
                System.out.print(tabla[i] + " ");}}}
    
}
