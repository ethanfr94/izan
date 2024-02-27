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
    
    public void insertar(Contacto contacto){
        
        if (cont < contactos.length){
            contactos[cont] = contacto;
            System.out.println("contacto introducido");
            cont++;
        }
        else {
            System.out.println("la agenda esta llena");        
        }
    }
    
    public void buscar (String nombre){
        boolean encontrado = false;
        for (int i = 0; i < cont && encontrado == false; i++) {
            if (contactos[i].getNombre().equals(nombre)) {
                System.out.println("posicion: "+(i+1)+" / "+contactos[i].getNombre());
                encontrado = true;
            }
        }
        if(!encontrado){
                System.out.println("contacto no encontrado");
            }
    }
    
    public void eliminar (String nombre){
        boolean borrado = false;        
        for (int i = 0; i < cont && borrado == false; i++) {
            if (contactos[i].getNombre().equals(nombre)) {                            
                for (int j = i; j < cont-1; j++) {        
                    contactos[j] = contactos[j+1];
                }                
                cont--;
                borrado = true;
                System.out.println("contacto borrado"); 
            }            
        }
        if (borrado == false){
            System.out.println("contacto no encontrado");
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
        Arrays.sort(contactos, 0, cont);
    }
    
    
}
