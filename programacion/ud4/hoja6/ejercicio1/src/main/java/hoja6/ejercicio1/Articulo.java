/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Articulo {
    private int cod, stock;
    private String desc;
    
    public Articulo(){
        Scanner teclado;
        System.out.print("codigo: ");
        cod = new Scanner(System.in).nextInt();System.out.println("");
        System.out.print("descripcion: ");
        desc = new Scanner(System.in).nextLine();System.out.println("");
        System.out.print("existencias: ");
        cod = new Scanner(System.in).nextInt();System.out.println("");
    }

    public int getCod() {
        return cod;
    }

    public int getStock() {
        return stock;
    }

    public String getDesc() {
        return desc;
    }
    
    
}
