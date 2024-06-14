/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ej2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public abstract class Persona {
    
    private String dni, nombre, direccion;

    public Persona(){
        Scanner t;
        System.out.println("introduce un dni");
        dni = new Scanner(System.in).nextLine();
        System.out.println("introduce un nombre");
        nombre = new Scanner(System.in).nextLine();
        System.out.println("introduce una direccion");
        direccion = new Scanner(System.in).nextLine();
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String mostrar(){
        String nomdi = String.format("nombre: %s\ndireccion: %s\n", getNombre(), getDireccion());
        
        return nomdi;
    }
    
}
