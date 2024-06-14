/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int diasem;
        System.out.println("introduce un dia de la semana(1-7)");
        diasem=t.nextInt();
        String texto;
        texto=switch(diasem){
             case 1 -> "Lunes";
             case 2 -> "Martes";     
             case 3 -> "Miercoles"; 
             case 4-> "Jueves"; 
             case 5 -> "Viernes";
             case 6 -> "Sabado";
             case 7 -> "Domingo";
             default ->"no valido";
        };
                System.out.println("el dia de la semana es: "+texto);
    }
}
