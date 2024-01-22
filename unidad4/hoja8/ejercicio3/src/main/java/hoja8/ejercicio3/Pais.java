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
     private String nombre;    private static int ciudades;    private Ciudad[] cities;    
    public Pais(String nombre) {
        this.nombre = nombre ;
        this.cities = new Ciudad[25];
        this.ciudades = 0 ;    }    
    public void insertar() {
        Scanner t;
        if (cities.length<=ciudades) {
            System.out.printf("No podemos añadir mas ciudades a %s", this.nombre);}        
         else {System.out.print("Introduce el nombre de la ciudad: ");
               String nombre = new Scanner(System.in).next();
               System.out.print("Introduce la latitud: ");
               float lat = new Scanner(System.in).nextFloat();
               System.out.print("Introduce la longitud: ");
               float lon = new Scanner(System.in).nextFloat();
               System.out.print("Introduce el numero de habitantes: ");
               int hab = new Scanner(System.in).nextInt();
               cities[ciudades] = new Ciudad(nombre, lat, lon, hab);
               ciudades++;} }    
    public Ciudad topHabitantes() {
        Ciudad top = new Ciudad("0",0,0,0);
        for (int i = 0; i < ciudades; i++) {
            if (cities[i].getHabitantes()>top.getHabitantes()) {
                top = cities[i]; }}
        return top;  }    
    public boolean existe(String nombre) {
        boolean existe = false ;
        for (int i = 0; i < ciudades; i++) {
            if (cities[i].getNombre().equalsIgnoreCase(nombre)) {
                existe = true ; }    }
        return existe; }    
    public int poblacionMedia() {
        int suma = 0 ;
        for (int i = 0; i < ciudades; i++) {
            suma += cities[i].getHabitantes();        }
        return suma /= ciudades;    }    
    public String toString() {
        String cadena = String.format("PAIS: %s\nNº de ciudades: %d\nCIUDADES: ", this.nombre, ciudades);
        for (int i = 0; i < ciudades; i++) {
            cadena += cities[i].toString()+"\n\t";        }
        return cadena ;    }
    public String getNombre() {
        return nombre;    }
    
}
