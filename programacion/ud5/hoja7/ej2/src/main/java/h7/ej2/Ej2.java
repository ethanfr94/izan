/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h7.ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean valido = false;

        while (!valido) {
            try {
                num1 = Teclado.introduceEntero1
        ("Introduce un numero entero mayor de 1 y menor de 30 ambos incluidos", 1, 30);
                valido = true ;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero válido. Inténtalo de nuevo.");
            } catch (ExcepcionLimite e) {
                System.out.println("El valor no esta entre los limites requeridos.");
            }
        }

    }
}
