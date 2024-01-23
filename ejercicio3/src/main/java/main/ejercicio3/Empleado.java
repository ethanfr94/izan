/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.ejercicio3;

/**
 *
 * @author DAM122
 */
public class Empleado {
     private String nombre;
    private double sueldo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public static void show(String nombre, double sueldo) {
        System.out.printf("NOMBRE: %s\nEDAD: %,.2f\n", nombre, sueldo);
    }
    
    public static void obligacionImpositiva(double sueldo) {
        if (sueldo > 3000) {
            System.out.println("Debes pagar impuestos.");
        } else {
            System.out.println("No es necesario que pagues impuestos.");
        }
    }
    
    public static void main(String[] args) {
        if (args.length>1) {
            show(args[0], Double.parseDouble(args[1]));
            obligacionImpositiva(Double.parseDouble(args[1]));
        } else {
            System.out.println("No se han introducido los datos correctos.");
        }
    }
}
