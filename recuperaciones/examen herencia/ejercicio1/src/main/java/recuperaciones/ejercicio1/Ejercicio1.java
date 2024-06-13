/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package recuperaciones.ejercicio1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author DAM122
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("DAM09", 5);

        Libro cmc = new LibroElectronico();
        Libro edm = new LibroElectronico("El dia de mañana", "Ignacio Martinez de Pison", 0.5f);
        Libro evdlm = new LibroPapel("El vagon de las mujeres", "Anita Nair", 120);
        Libro dfi = new LibroElectronico("Donde fuimos invencibles", "Maria Oruña", 2.2f);

        Usuario izan = new Usuario();
        Usuario maria = new Usuario("Maria", "Gonzalez");
        Usuario ignacio = new Usuario("Ignacio", "Alvarez");
        Usuario alfredo = new Usuario("Alfredo", "Gomez");

        Prestamo p1 = new Prestamo(cmc, izan, LocalDate.of(2024, Month.MARCH, 15));

        b.insertaUsuario(izan);
        b.insertaUsuario(maria);
        b.insertaUsuario(ignacio);

        if (b.insertaLibro(cmc)) {
            System.out.println("libro: " + cmc.getTitulo() + " Insertado correctamente");
        } else {
            System.out.println("Error al introducir el libro");
        }
        if (b.insertaLibro(edm)) {
            System.out.println("libro: " + edm.getTitulo() + " Insertado correctamente");
        } else {
            System.out.println("Error al introducir el libro");
        }
        if (b.insertaLibro(evdlm)) {
            System.out.println("libro: " + evdlm.getTitulo() + " Insertado correctamente");
        } else {
            System.out.println("Error al introducir el libro");
        }

        System.out.println("\n---------------------------------");

        b.prestaLibro(cmc, izan);
        b.prestaLibro(dfi, izan);
        b.prestaLibro(edm, alfredo);
        b.prestaLibro(cmc, maria);

        System.out.println("\n---------------------------------");

        b.devuelveLibro(cmc, izan);
        b.devuelveLibro(edm, ignacio);

        System.out.println("\n--------------------------------");

        b.eliminarLibro(evdlm);
        b.eliminarLibro(dfi);

        System.out.println("\n---------------------------------");
       
        System.out.println("Libros Electronicos\n");
        b.listarElectronicos(0.4f);
        
        System.out.println("\n---------------------------------");

        System.out.println(b.imprime());
    }
}
