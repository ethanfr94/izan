/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Doblar {

    public static void apuesta() {
        Scanner t = new Scanner(System.in);
        double apuesta;
        String respuesta;
        System.out.println("cuanto quieres apostar?");
        apuesta = t.nextDouble();
        
        System.out.println("has apostado: " + apuesta);

        do {
            Random r = new Random();
            int result = r.nextInt(2) + 1;
            System.out.println("el resultado es: " + result);

            if (result == 1) {
                System.out.println("has ganado: " + (apuesta * 2));
            } 
            else {
                
                System.out.println("lo has perdido todo");
            }
            
            System.out.println("volver a jugar? (s)");                            
                respuesta = t.next().toLowerCase();
            if(respuesta.equals("s")){                            
                System.out.println("cuanto quieres apostar esta vez?");
                apuesta = t.nextInt();
            }
            else{
                System.out.println("gracias por jugar, adios");
            }
        }while (respuesta.equals("s"));
    }

}
