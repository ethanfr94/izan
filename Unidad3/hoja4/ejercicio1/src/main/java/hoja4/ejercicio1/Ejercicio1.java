/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int a;
        Scanner t = new Scanner(System.in);
        do {
            System.out.println("elige un programa\n1\n2\n3\n4\n0 para terminar el programa");
            a = t.nextInt();

            switch (a) {
                case 1 ->
                    Metodos.m1();
                case 2 ->
                    Metodos.m2();
                case 3 ->
                    Metodos.m3();
                case 4 ->
                    Metodos.m4();
                case 0 ->
                    System.out.println("adios");
                default ->
                    System.out.println("la opcion no es valida");
            }
        } while (a != 0);
    }
}
