/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio2;


/**
 *
 * @author usuario
 */
public class Libro {  
    private String titulo, autor, isbn;    
    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;//constructor
        this.titulo=titulo;
        this.autor=autor;        
    }    
    public void setTitulo(String nuevo){
        this.titulo=nuevo;//metodo de asignacion
    }    
    public void setAutor(String nuevo){//metodo de asignacion
        this.autor=nuevo;    
    }     
    public void setIsbn(String nuevo){//metodo de asignacion
        this.isbn=nuevo;
    }    
    public String getTitulo(){//metodo que nos indica un valor
        return titulo;
    }    
    public String getAutor(){//metodo que indica un valor
        return autor;
     }    
    public boolean esEspanol(){//metodo que nos indica que el libro es en español en funcion si contiene ciertos caracteres en su codigo
        String guia="84";
        boolean esp=guia.contains(isbn.substring(3, 4));
        return esp;
    }    
    public String mostrar(){//metodo que nos muestra el titulo en mayusculas seguido del nombre del autor con la primera letra en mayusculas y el resto en minusculas
        return titulo.toUpperCase().concat(autor.substring(0, 1).toUpperCase().concat(autor.substring(1)));
    }
    
}
