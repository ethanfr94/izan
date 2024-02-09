/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ej2;

/**
 *
 * @author usuario
 */
public class Alumno extends Persona {
    private int [] notas;
    private double media;
    public Alumno(int notas) {
        int suma = 0;
        
        this.notas = new int [notas];
        for (int i = 0; i < this.notas.length; i++){
            this.notas[i]= (int) Math.floor(Math.random()*11);
            suma += this.notas[i];
        }  
        media = suma/notas;
    }

    public double getMedia() {
        return media;
    }
        
    
    
    @Override
    public String mostrar() {
        return super.mostrar().concat(String.format("dni: %s\nnota media: %,.2f", getDni(), getMedia())); 
    }
    
    
    
    
    
}
