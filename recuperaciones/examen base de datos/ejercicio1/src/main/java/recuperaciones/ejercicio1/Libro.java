/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package recuperaciones.ejercicio1;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Libro {
    private String cod_libro;
    private String titulo;
    private String autor;
    private  int copias;

    public Libro(String cod_libro, String titulo, String autor, int copias) {
        this.cod_libro = cod_libro;
        this.titulo = titulo;
        this.autor = autor;
        this.copias = copias;
    }

    public String getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(String cod_libro) {
        this.cod_libro = cod_libro;
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

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "cod_libro: " + cod_libro + ", titulo: " + titulo + ", autor: " + autor + ", copias: " + copias;
    }
}
