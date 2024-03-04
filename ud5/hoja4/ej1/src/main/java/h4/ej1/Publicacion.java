/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h4.ej1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public abstract class Publicacion {
    
    protected String titulo, autor;
    protected LocalDate fecha;

    public Publicacion(String titulo, String autor, int dia, int mes, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = LocalDate.of(ano, mes, dia);
    }
    
    
    @Override
    public abstract String toString();

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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public static Publicacion crear(int n) {
        Publicacion p = null;
        Scanner t;
        System.out.println("Introduce titulo");
        t = new Scanner(System.in);
        String titulo = t.nextLine();
        System.out.println("Introduce autor");
        t = new Scanner(System.in);
        String autor = t.nextLine();
        System.out.println("Dia de publicacion");
        t = new Scanner(System.in);
        int dia = t.nextInt();
        System.out.println("Mes de publicacion");
        t = new Scanner(System.in);
        int mes = t.nextInt();
        System.out.println("Año de publicacion");
        t = new Scanner(System.in);
        int ano = t.nextInt();
        if (n==1) {
            System.out.println("Duracion del disco");
            int duracion = new Scanner(System.in).nextInt();
            p = new Disco(titulo, autor, duracion, dia, mes, ano);
        } else if (n == 2) {
            System.out.println("Paginas del libro");
            int paginas = new Scanner(System.in).nextInt();
            p = new Libro(titulo, autor, paginas, dia, mes, ano);
        }
        return p;
    }
    
    
    
}
