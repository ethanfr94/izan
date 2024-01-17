/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja9.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner t1=new Scanner(System.in);
        
        
        System.out.println("introduce una temperatura");
        float  temp=t1.nextFloat();
        
        Alarma a1=new Alarma(temp);
        
        System.out.println("la temperatura es de: "+a1.getTemperatura()+" grados");
        System.out.println("el timbre esta en "+a1.comprueba());  
        
        a1.normaliza();
        
        System.out.println("la temperatura es de: "+a1.getTemperatura()+" grados");
        System.out.println("el timbre esta en "+a1.comprueba());  

        
    
    }
}
     