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
    //conn super llamamos al constructor de la clase padre  y luego añadimos la inicializacion de las variables de la actual clase
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
    
    //sobreescribimos el metodo tostring
    @Override
    public String toString() {
        //damos formato a como mostrar la fecha
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        return String.format("el disco %s de %s, con una duracion de %d minutos, fue publicado el %s.", 
                super.getTitulo(), super.getAutor(), duracion, super.getFecha().format(formato));
    }
    //creamos un metodo en el que introducimos un array por parametro
      public static Disco masLargo(Publicacion[] lista) {
       Disco max = null, aux = null;
        System.out.println("\nEl disco más largo es: ");
       //revisamos cada posicion del array 
        for (int i = 0; i < lista.length; i++) {
            //si el objeto de la posicion indicada es del tipo indicado realiza las acciones definidas mas tarde
            if (lista[i] instanceof Disco) {
                aux = (Disco) lista[i];
                if(max == null){
                    max = aux;
                }
                if (aux.duracion > max.duracion) {
                    max = aux ;
                }
            }
        }
        return max;
    }
    
    public static String cortaNombre(Disco disco) {
        return String.format(disco.getTitulo().substring(0,3).concat(String.format(" - %s",disco.getAutor())));    
    }
    
    public static void ultimosDosAnos(Publicacion[] lista) {
        Disco aux;
        System.out.println("\nLos discos editados en los dos ultimos años son:");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Disco) {
                aux = (Disco) lista[i];                
                if (aux.getFecha().getYear()> (LocalDate.now().getYear()-2) && aux.getFecha().getYear()< (LocalDate.now().getYear())) {
                    System.out.println(aux.getAutor()+" "+aux.getTitulo());
                }
            }
        }
    }
    
}
