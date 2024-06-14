/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Donar {
    
    public static double donativo(double y){
         Scanner t=new Scanner (System.in);
      double x=y;  
      int c=1;        
      System.out.println("has donado: "+y+" la colecta asciende a: "+x);

       for(x=y;x<=600;c++){           
            System.out.println("cuanto quieres donar: ");
            y=t.nextDouble();
            x+=y;
            System.out.println("has donado: "+y+" la colecta asciende a: "+x);
            if (x>600){
                System.out.println("enhorabuena hemos superado el objetivo tras "+c+" donaciones");
            }
        }
       return x;
    }
    }
