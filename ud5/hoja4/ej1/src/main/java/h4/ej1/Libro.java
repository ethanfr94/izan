/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h4.ej1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author usuario
 */
public class Libro extends Publicacion {
    private int paginas;

    public Libro(String titulo, String autor, int paginas, int dia, int mes, int ano) {
        super(titulo, autor, dia, mes, ano);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        return String.format("el libro %s de %s, fue publicado el %s con %d paginas.", super.getTitulo(), super.getAutor(), super.getFecha().format(formato), paginas);
    }
    
     public static void libroLargo(Publicacion[] lista) {
        Libro aux;
        System.out.println("\nLos libros editados este mes con más de 1000 paginas son: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Libro) {
                aux = (Libro) lista[i];
                if (aux.fecha.getYear() == LocalDate.now().getYear() && aux.fecha.getMonthValue() == LocalDate.now().getMonthValue()) {
                    if (aux.paginas > 1000) {
                        System.out.println(aux.toString());
                    }                    
                }
            }
        }
    }
    
}
