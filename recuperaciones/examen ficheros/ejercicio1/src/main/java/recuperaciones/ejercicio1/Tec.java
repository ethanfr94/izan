/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Tec {

    public static int introEntero(String c) {
        Scanner t = new Scanner(System.in);
        int num = 0;
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                num = Integer.parseInt(t.nextLine());
                correcto = true;
            } catch (InputMismatchException a) {                
                System.out.println("Error " + a.toString());
                t.next();
            } catch (NumberFormatException n) {
                    
                System.out.println(n.toString());
            }
        } while (!correcto);
        return num;
    }

    public static String modoFicha(LinkedHashMap<String, String> mapa) {
        String cdn = "";
        for (Map.Entry<String, String> lista : mapa.entrySet()) {
            cdn += " " + lista.getKey() + lista.getValue() + "\n";
        }
        return cdn;
    }
    
    
}
