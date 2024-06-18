/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package recuperaciones.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Lector {
    private int id;
    private String nombre;
    private Libro libro;
    private LocalDate fecha;

    public Lector(int id, String nombre, Libro libro, LocalDate fecha) {  
        this.id = id;
        this.nombre = nombre;
        this.libro = libro;
        this.fecha = fecha;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro cod_libro) {
        this.libro = cod_libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", cod_libro: " + libro.getCod_libro() + ", fecha: " + fecha;
    }
    
    
}

