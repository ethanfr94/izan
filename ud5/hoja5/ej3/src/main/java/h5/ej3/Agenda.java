/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h5.ej3;

/**
 *
 * @author DAM122
 */
public class Agenda {
    
    int cont;
    Contacto [] contactos;

    public Agenda(int n) {
        contactos = new Contacto [n];
        cont = 0;
    }
    
    public void insertar(){
        if (cont < contactos.length){
            contactos[cont] = new Contacto("nombre", "apellido", "");
        }
    }
    
}
