/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.util.Objects;



/**
 *
 * @author DAM122
 */
public abstract class Libro implements Identificable, Comparable<Libro> {

    private String titulo;
    private String autor;

    public Libro() {
        titulo = Tec.introNombre("introduce titulo");
        autor = Tec.introNombre("introduce autor");
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String imprime() {
        return  "-Titulo: " + titulo + " -Autor: " + autor;
    }
    
     @Override
    public int compareTo(Libro o) {
        int res;
        LibroElectronico l = null;
        if (o instanceof LibroElectronico) {
            l = (LibroElectronico) o;
        }
        if (this.getTitulo().equals(l.getTitulo())) {
            res = this.getAutor().compareTo(l.getAutor());
        } else {            
            res = this.getTitulo().compareTo(l.getTitulo());
        }
        return res;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.titulo);
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
        final Libro other = (Libro) obj;
        return Objects.equals(this.titulo, other.titulo);
    }
    
    
    
    
}
