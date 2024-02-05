/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Caja {
    
    public static void acceso(){        
        Random r = new Random();
        int pass = r.nextInt(10000);
        int intentosMax=4;
        System.out.println(pass);
        Scanner t=new Scanner(System.in);
        
        for(int intento=1;intento<=intentosMax;intento++){
            System.out.println("introduce el codigo de acceso");
            int pin=t.nextInt();
            
            if (pin==pass){
                System.out.println("la caja fuerte  se ha abierto exitosamente");
            }
            else {
                int intentosrest= intentosMax-intento;
                System.out.println("lo siento esa no es la combinacion, le quedan "+intentosrest);
                ;
            }
        }
            
}

}
