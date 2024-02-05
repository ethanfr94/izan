/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio5;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int edadmenor=100, edadmayor=0;        
        for(int x=0;x<10;x++){
            Random r=new Random();
            int y=r.nextInt(100)+1;
            System.out.println("edad "+(x+1)+": "+y);   
            
            if (y > edadmayor){
                edadmayor=y;                
            }
            if (y < edadmenor){
                edadmenor=y;
            }            
        }
        System.out.println("la edad menor generada es: "+edadmenor+" y la mayor: "+edadmayor);
       
    }
}
