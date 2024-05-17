/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h1.ej1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Utils {
       

    
    public static int introEntero(String msg) {
        Scanner t = new Scanner(System.in);
        int x = 0;
        boolean valido = false;        
            try {
                System.out.println(msg);
                x = t.nextInt();
                valido = true;

            } catch (InputMismatchException e) {
                System.out.println("introduce un numero valido");
            }
        
        return x;
    }
    
}

 