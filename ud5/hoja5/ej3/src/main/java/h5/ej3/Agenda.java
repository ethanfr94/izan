/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h5.ej3;

import java.util.Arrays;

/**
 *
 * @author DAM122
 */
public class Agenda {
    
    private int cont;
    private Contacto [] contactos;

    public Agenda(int n) {
        contactos = new Contacto [n];
        cont = 0;
    }
    
    public void insertar(){
        if (cont < contactos.length){
            contactos[cont++] = new Contacto("nombre", "apellido", "movil", "mail");
        }
        else {
            System.out.println("la agenda esta llena");        
        }
    }
    
    public void buscar (String nombre){
        for (int i = 0; i < cont; i++) {
            if (contactos[i].nombre.equals(nombre)) {
                System.out.println(contactos[i].nombre+" / "+contactos[i].movil+" / "+contactos[i].mail);
            }
        }
    }
    
    public void eliminar (String nombre){
        int aux;
        for (int i = 0; i < cont; i++) {
            if (contactos[i].nombre.equals(nombre)) {
                aux = i;            
                for (int j = aux; j < cont; i++) {        
                    contactos[j].setNombre(contactos[j+1].getNombre());
                    contactos[j].setApellidos(contactos[j+1].getApellidos());
                    contactos[j].setMail(contactos[j+1].getMail());
                    contactos[j].setMovil(contactos[j+1].getMovil());
            }
                cont--;
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            cadena += contactos[i].toString()+"\n";
        }        
        return cadena;
    }
    
    public void ordenar(){
        Arrays.sort(contactos);
    }
    
    
}
