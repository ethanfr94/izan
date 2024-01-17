/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Calculo {

    public Calculo() {
    }

    private static void m1() {
        byte x = 10;

        while (x >= 0) {
            System.out.println(x);
            x--;
        }
        System.out.println("¡DESPEGUE!");
    }

    private static void m2() {
        Scanner t = new Scanner(System.in);
        byte x = 10;

        while (x > 0) {
            System.out.println("introduce un numero");
            int n = t.nextInt();
            if (n < 0) {
                System.out.println("el numero es negativo");
            } else if (n == 0) {
                System.out.println("el numero es nulo");
            } else if (n > 0) {
                System.out.println("el numero es positivo");
            }
            x--;
        };
    }

    private static void m3() {
        Scanner t = new Scanner(System.in);
        System.out.println("introduce un numero");
        int n = t.nextInt();
        int a = n - 1;

        System.out.println("el factorial de " + n + " es: ");

        while (a > 1) {
            n = n * a;
            System.out.println(n);
            a--;
        }
    }

    private static void m4() {
        Scanner t = new Scanner(System.in);
        char a;
        int c = 0;
        do {
            System.out.println("introduce un caracter, el programa finaliza al introducir un punto");
            a = t.next().charAt(0);
            c++;
        }
        while (a != '.');

        System.out.println("hemos escrito " + c + " caracteres");
    }

    private static void m5() {
        Scanner t = new Scanner(System.in);
        int suma = 0, contador = 0, n;
        System.out.println("introduce una serie de numeros positivos, para acabar introduce uno negativo que no sera contabilizado");

        do {
            System.out.println("introduce un numero ");
            n = t.nextInt();
            if (n > 0) {
                suma += n;
                contador++;
            }
        } while (n >= 0);
        double media = suma / contador;
        System.out.println("la media es: " + media);
    }

    public static void opcion() {
        Scanner t = new Scanner(System.in);
        int opcion=1;
        
        do {
        System.out.println("escoge un programa del 1 al 5, con el 0 se cierra el programa");
        opcion = t.nextInt();
        
            switch (opcion) {
                
                case 1 ->
                    Calculo.m1();
                case 2 ->
                    Calculo.m2();
                case 3 ->
                    Calculo.m3();
                case 4 ->
                    Calculo.m4();
                case 5 ->
                    Calculo.m5();
                case 0-> System.out.println("adios");
                default -> System.out.println("la opcion no es valida"); 
            }  
        }while (opcion != 0);
    }
}
