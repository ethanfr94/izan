/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio4;

import javax.swing.JOptionPane;


/**
 *
 * @author usuario
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       String texto;
        float h,b;
        float area;
        texto=JOptionPane.showInputDialog("altura");
        h=Float.parseFloat(texto);
        texto=JOptionPane.showInputDialog("base");
        b=Float.parseFloat(texto);
        area=(h*b)/2;
        System.out.println("el area del triangulo es "+area);
    }
}
