/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        String texto;
        int hormigas;
        int aranas;
        int cochinillas;
        int total;
        //obtener numro n y despues m
        texto=JOptionPane.showInputDialog("escribe numero de hormigas");
        hormigas=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("escribe numero de arañas");
        aranas=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("escribe numero de cochinilas");
        cochinillas=Integer.parseInt(texto);
        total=(hormigas*6)+(aranas*8)+(cochinillas*14);
        
        System.out.println("numero total de patas "+total );
        JOptionPane.showMessageDialog(null, "total de patas"+total);
    }
}
