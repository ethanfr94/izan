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
public class Disco extends Publicacion {
    private int duracion;

    public Disco(String titulo, String autor, int duracion, int dia, int mes, int ano) {
        super(titulo, autor, dia, mes, ano);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    @Override
    public String toString() {
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        return String.format("el disco %s de %s, con una duracion de %d minutos, fue publicado el %s.", super.getTitulo(), super.getAutor(), duracion, super.getFecha().format(formato));
    }
    
      public static Disco masLargo(Publicacion[] lista) {
        Disco max = new Disco("","",1,1,0,0),
              aux = new Disco("","",0,0,0,0);
        System.out.println("\nEl disco más largo es: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Disco) {
                aux = (Disco) lista[i];
                if (aux.duracion > max.duracion) {
                    max = aux ;
                }
            }
        }
        return max;
    }
    
    public static String cortaNombre(Disco disco) {
        return String.format(disco.getTitulo().substring(0,3).concat(String.format(" - %s", disco.getAutor())));    
    }
    
    public static void ultimosDosAnos(Publicacion[] lista) {
        Disco aux = new Disco("","",0,0,0,0);
        System.out.println("\nLos discos editados en los dos ultimos años son:");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Disco) {
                if (aux.getFecha().getYear()> (LocalDate.now().getYear()-2) && aux.getFecha().getYear()< (LocalDate.now().getYear())) {
                    System.out.println(aux.toString());
                }
            }
        }
    }
    
}
