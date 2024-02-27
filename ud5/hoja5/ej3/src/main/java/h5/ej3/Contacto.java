/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h5.ej3;

/**
 *
 * @author DAM122
 */
public class Contacto implements Comparable<Contacto> {
    
    private String nombre, apellidos, movil, mail;

    public Contacto(String nombre, String apellidos, String movil, String mail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", movil=" + movil + ", mail=" + mail + '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Contacto o) {
        return getNombre().compareToIgnoreCase(o.getNombre());
    }

    
    
    
    
    
}
