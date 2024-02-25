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
    
    private String getTitulo, autor;
    private LocalDate fecha;

    public Publicacion(String titulo, String autor, int dia, int mes, int ano) {
        this.getTitulo = titulo;
        this.autor = autor;
        this.fecha = LocalDate.of(ano, mes, dia);
    }
    
    @Override
    public abstract String toString();

    public String getTitulo() {
        return getTitulo;
    }

    public void setTitulo(String titulo) {
        this.getTitulo = titulo;
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
        Publicacion publi = null;
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
            t = new Scanner(System.in);
            int duracion = t.nextInt();
            publi = new Disco(titulo, autor, duracion, dia, mes, ano);
        } else if (n == 2) {
            System.out.println("Paginas del libro");
            t = new Scanner(System.in);
            int paginas = t.nextInt();
            publi = new Libro(titulo, autor, paginas, dia, mes, ano);
        }
        return publi;
    }
    
    
    
}
