/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package h3.ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Izan Franco Anduaga
 */
public class P {
public static int introEntero(String msg){
        Scanner t = new Scanner(System.in); 
        int x = 0;        
            try{
                System.out.println(msg);
                x = Integer.parseInt(t.nextLine());
                return x;
            }catch(InputMismatchException e) {
                System.out.println("introduce un numero valido");
            }  
        return x;
    }
}
