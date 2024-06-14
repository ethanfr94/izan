/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h5.ej2;

/**
 *
 * @author DAM122
 */
public class Gato extends Mamifero implements Domestico, Felino {

    private String nombre;

    public Gato(String nombre, String raza, String alimento, int nPatas) {
        super(raza, alimento, nPatas);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{nombre: " + nombre + "} "+super.toString();
    }
    
    
    
    @Override
    public String obedecer() {
        String cadena = "el gato no obedece";
        return cadena;
    }

    @Override
    public String arañar() {
        String cadena = "el gato araña";
        return cadena;
    }
    
}
