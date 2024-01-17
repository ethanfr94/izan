/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("entradas infantiles:");
        byte inf=teclado.nextByte();
        
        System.out.println("entradas adultos");
        byte ad=teclado.nextByte();
        
        float x=(float) (inf*15.50);//precio total entradas infantiles
        float y=(float) (ad*20);//precio total entradas adulto
        float importe=(float) ((x+y)>=100?(x+y)*0.95:(x+y));
        
        System.out.println("el importe total es de "+importe);
    }
}
