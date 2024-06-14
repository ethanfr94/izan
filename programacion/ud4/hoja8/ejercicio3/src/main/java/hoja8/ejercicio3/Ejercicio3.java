/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja8.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Pais esp = new Pais("España");
        Scanner t;
        int n;
        do {
            System.out.printf("\n\nBASE DE DATOS DE PAISES\n%s"
                    + "\n1.- Insertar una nueva ciudad"
                    + "\n2.- Buscar la ciudad con mas habitantes"
                    + "\n3.- Buscar una ciudad"
                    + "\n4.- Obtener la poblacion media de las ciudades"
                    + "\n5.- Mostrar informacion"
                    + "\n6.- Salir\n", esp.getNombre());
            t = new Scanner(System.in);
            n = t.nextInt();
            switch (n) {
                case 1 ->
                    esp.insertar();
                case 2 ->
                    System.out.println(esp.topHabitantes().toString());
                case 3 -> {
                    t = new Scanner(System.in);
                    System.out.print("Introduce el nombre de la ciudad que quieras buscar: ");
                    if (esp.existe(t.nextLine())) {
                        System.out.println("Se ha encontrado la ciudad que estabas buscando.");
                    } else {
                        System.out.println("NO se ha encontrado la ciudad que estabas buscando.");
                    }
                }
                case 4 -> {
                    System.out.printf("La población media de las ciudades de %s es de %d",
                            esp.getNombre(), esp.poblacionMedia());
                }
                case 5 -> {
                    System.out.println(esp.toString());
                }
                case 6 -> {
                    System.out.println("Hasta Luego");
                }
                default -> {
                    System.out.println("Has introducido una opcion incorrecta");
                }
            }
        } while (n != 6);
    }
}
