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
    private String cod_libro;
    private LocalDate fecha;

    public Lector(int id, String nombre, String cod_libro, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.cod_libro = cod_libro;
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

    public String getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(String cod_libro) {
        this.cod_libro = cod_libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", cod_libro: " + cod_libro + ", fecha: " + fecha;
    }
    
    
}

