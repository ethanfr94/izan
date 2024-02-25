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
public class Profesor extends Persona {
    
    private String [] asignaturas;

    public Profesor(int asignaturas) {
        Scanner t;
        this.asignaturas = new String [asignaturas];
        for (int i = 0; i < this.asignaturas.length; i++){
            System.out.println("asignatura");
            this.asignaturas[i]= new Scanner (System.in).nextLine().toUpperCase();            
        }      
    }
    
    public String getAsignaturas(){
        String cadena = "";
        for (int i = 0; i < this.asignaturas.length; i++){
            cadena += this.asignaturas[i]+", ";
        } 
        return cadena;
    }
    
    @Override
    public String mostrar() {
        return super.mostrar().concat(String.format("dni: %s\nasignaturas: %s", getDni(), getAsignaturas())); 
    }
    
}
