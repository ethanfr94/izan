/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h7.ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Teclado {
    public static int introduceEntero(String mensaje, int min, int max) {
        boolean valido = false;
        int num = 0;
        
        while (!valido) {
            try {
                System.out.print(mensaje + ": ");
                num = new Scanner(System.in).nextInt();
                if (num < min || num > max) {
                    throw new ExcepcionLimite();
                } else {
                    valido = true;
                }//try lanza el programa y si hay algun error catch lo recoge 
                //y nos muestra el mensaje
                //como esta dentro de un while se repetira el proceso hasta recoger un faot valido
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero válido. Inténtalo de nuevo.");
            } catch (ExcepcionLimite e) {
                System.out.println("El valor no esta entre los limites requeridos.");
            }
        }
        return num;
    }
    
    public static void divide(int num1, int num2) {
        try {
            double resultado = (double) num1 / num2;
            System.out.printf("El resultado de la division es %,.2f", resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }        
    }
    
    public static int introduceEntero1(String mensaje, int min, int max) throws InputMismatchException, ExcepcionLimite {
        int num = 0;
        System.out.print(mensaje + ": ");
        num = new Scanner(System.in).nextInt();
        if (num < min || num > max) {
            throw new ExcepcionLimite();
            //si se da la condicion del if llama al metodo excepcionlimite
            //que nos mostrara un mensaje indicandonos el error
        }
        return num;
    }
}
