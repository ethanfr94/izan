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
        Scanner t;

        int matriz[][] = {{101, 102, 103, 104, 105},
        {201, 202, 203, 204, 205},
        {301, 302, 303, 304, 305},
        {401, 402, 403, 404, 405},
        {501, 502, 503, 504, 505}};

        byte menu;
        do {

            System.out.println("selecciona un programa (1/6)");
            menu = new Scanner(System.in).nextByte();
            switch (menu) {
                case 1 -> {
                    System.out.println("elige una fila");
                    int fila = new Scanner(System.in).nextInt() - 1;
                    if (fila < matriz.length) {
                        System.out.print("[");
                        for (int i = 0; i < matriz.length; i++) {
                            if (i == matriz.length - 1) {
                                System.out.print(matriz[fila][i]);
                            } else {
                                System.out.print(matriz[fila][i] + " ");
                            }
                        }
                        System.out.print("]");
                    } else {
                        System.out.println("el numero seleccionado supera el limit del array");
                    }
                    System.out.println("");
                }
                case 2 -> {
                    System.out.println("elige una columna");
                    int fila = new Scanner(System.in).nextInt() - 1;
                    if (fila < matriz.length) {
                        System.out.print("[");
                        for (int i = 0; i < matriz.length; i++) {
                            if (i == matriz.length - 1) {
                                System.out.print(matriz[i][fila]);
                            } else {
                                System.out.print(matriz[i][fila] + " ");
                            }
                        }
                        System.out.print("]");
                    } else {
                        System.out.println("el numero seleccionado supera el limit del array");
                    }
                    System.out.println("");
                }
                case 3 -> {
                    System.out.print("[");
                    for (int i = 0; i < matriz.length; i++) {
                        if (i == matriz.length - 1) {
                            System.out.print(matriz[i][i]);
                        }else {
                            System.out.print(matriz[i][i] + " ");
                        }
                    }
                        System.out.print("]");
                        System.out.println("");
                    
                }
                case 4 -> {
                    System.out.print("[");
                    for (int i = matriz.length - 1; i >= 0; i--) {
                        if (i == 0) {
                            System.out.print(matriz[i][i]);
                        }else{
                            System.out.print(matriz[i][i] + " ");
                        }
                    }
                        System.out.print("]");
                        System.out.println("");
                }
                case 5 -> {
                    System.out.print("[");
                    for (int i = 1; i < matriz.length + 1; i++) {
                        if (i == matriz.length){
                            System.out.print(matriz[matriz.length - i][i - 1]);
                        }else {
                            System.out.print(matriz[matriz.length - i][i - 1] + " ");
                        }                        
                    }
                    System.out.print("]");
                    System.out.println("");
                }
                case 6 -> {
                    System.out.print("adios");
                }
                default -> {
                    System.out.print("la opcion introducida no es valida");
                }

            }

        } while (menu != 6);

    }
}
