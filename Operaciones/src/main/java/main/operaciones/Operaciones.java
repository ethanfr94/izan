/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.operaciones;

import static java.lang.Integer.parseInt;

/**
 *
 * @author usuario
 */
public class Operaciones {

    public static void suma(int x, int y) {
        System.out.println((x + y));
    }

    public static void resta(int x, int y) {
        System.out.println((x - y));
    }

    public static void multiplica(int x, int y) {
        System.out.println((x * y));
    }

    public static void divide(int x, int y) {
        System.out.println((x / y));
    }

    public static void main(String[] args) {
        Operaciones.suma(parseInt(args[0]), parseInt(args[1]));
        Operaciones.resta(parseInt(args[0]), parseInt(args[1]));
        Operaciones.multiplica(parseInt(args[0]), parseInt(args[1]));
        Operaciones.divide(parseInt(args[0]), parseInt(args[1]));
    }
}
