/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Pais {

    private String nombre;
    private static int ciudades;
    private Ciudad[] c;

    public Pais(String _nombre) {
        nombre = _nombre;
        c = new Ciudad[25];
        ciudades = 0;
    }

    public void insertar() {
        Scanner t;
        if (c.length <= ciudades) {
            System.out.printf("No podemos añadir mas ciudades a %s", this.nombre);
        } else {
            System.out.print("Introduce el nombre de la ciudad: ");
            String nombre = new Scanner(System.in).next();
            System.out.print("Introduce la latitud: ");
            float lat = new Scanner(System.in).nextFloat();
            System.out.print("Introduce la longitud: ");
            float lon = new Scanner(System.in).nextFloat();
            System.out.print("Introduce el numero de habitantes: ");
            int hab = new Scanner(System.in).nextInt();
            c[ciudades] = new Ciudad(nombre, lat, lon, hab);
            ciudades++;
        }
    }

    public Ciudad topHabitantes() {
        Ciudad top = new Ciudad("0", 0, 0, 0);
        for (int i = 0; i < ciudades; i++) {
            if (c[i].getHabitantes() > top.getHabitantes()) {
                top = c[i];
            }
        }
        return top;
    }

    public boolean existe(String nombre) {
        boolean existe = false;
        for (int i = 0; i < ciudades; i++) {
            if (c[i].getNombre().equalsIgnoreCase(nombre)) {
                existe = true;
            }
        }
        return existe;
    }

    public int poblacionMedia() {
        int suma = 0;
        for (int i = 0; i < ciudades; i++) {
            suma += c[i].getHabitantes();
        }
        return suma /= ciudades;
    }

    public String toString() {
        String cadena = String.format("PAIS: %s\nNº de ciudades: %d\nCIUDADES: ", this.nombre, ciudades);
        for (int i = 0; i < ciudades; i++) {
            cadena += c[i].toString() + "\n\t";
        }
        return cadena;
    }

    public String getNombre() {
        return nombre;
    }

}
