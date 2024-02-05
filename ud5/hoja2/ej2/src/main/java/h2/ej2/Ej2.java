/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h2.ej2;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Ej2 {

    public static void main(String[] args) {
    Scanner t;
    Articulo [] art = new Articulo [10];
    
    
    for (int i = 0; i < art.length; i++){
        if (art.length == art.length/2){
        System.out.println("introduce un mes de caducidad: ");
        int mes = new Scanner (System.in).nextInt();
        System.out.println("introduce un año de caducidad: ");
        int ano = new Scanner (System.in).nextInt();
        System.out.println("introduce descripcion del articulo");
        String desc = new Scanner (System.in).nextLine();
        System.out.println("introduce descripcion del articulo");
        double precio = new Scanner (System.in).nextDouble();
        art [i] = new Perecedero(mes, ano, String.valueOf(i), desc, precio);
        }
        else{
        System.out.println("introduce descripcion del articulo");
        String desc = new Scanner (System.in).nextLine();
        System.out.println("introduce descripcion del articulo");
        double precio = new Scanner (System.in).nextDouble();
        System.out.println("introduce descuento a aplicar (%)");
        double descuento = new Scanner (System.in).nextDouble();
        art [i] = new EnPromocion(descuento, String.valueOf(i), desc, precio);        
        }    
    }
     for (int i = 0; i < art.length; i++){
         art[i].datos();
     }
    
        
    
        
        
    }
    
    
}
