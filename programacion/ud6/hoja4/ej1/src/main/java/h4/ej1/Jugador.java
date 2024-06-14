/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h4.ej1;

import java.util.Objects;

/**
 *
 * @author DAM122
 */
public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private int estat;

    public Jugador(String nombre, int estat) {
        this.nombre = nombre;
        this.estat = estat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstat() {
        return estat;
    }

    public void setEstat(int estat) {
        this.estat = estat;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", estat=" + estat + '}';
    }
        
    @Override
    public int compareTo(Jugador o) {       
        return Integer.compare(this.estat, o.estat);        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    
    
   
}
