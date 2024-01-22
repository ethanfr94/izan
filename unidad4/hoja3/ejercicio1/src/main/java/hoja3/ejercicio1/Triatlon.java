/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Triatlon {
    int dorsal;
    String nombre;
    int [] puntos;
    
    
    public Triatlon(int _dorsal, String _nombre, int pruebas){
        dorsal = _dorsal;
        nombre = _nombre;
        puntos = new int [pruebas];
        
        
        Scanner t;
        
        System.out.println("introduce las puntuaciones de "+nombre);
        int n;
        for ( int i = 0; i < puntos.length; i++){
            n = new Scanner (System.in).nextInt();
            puntos[i] = n;
        }        
    }
    
    public Triatlon(){
        System.out.println("nuevo atleta");
        Scanner t;
        System.out.println("indica el dorsal");
        dorsal = new Scanner (System.in).nextInt();
        System.out.println("introduce nombre");
        nombre = new Scanner (System.in).nextLine();
        System.out.println("introduce numero de pruebas");
        puntos = new int [new Scanner (System.in).nextInt()];
        
        System.out.println("introduce las puntuaciones de "+nombre);
        int n;
        for ( int i = 0; i < puntos.length; i++){
            n = new Scanner (System.in).nextInt();
            puntos[i] = n;
        }        
    }
    
    public double pMedia(){
        double media = 0;
        for ( int i = 0; i < puntos.length; i++){
            media += puntos[i];
            } media /= puntos.length;
            return media;
    }
    
    //metodo que nos dice si algo es verdadero o falso
    //en funcion dee si algun valor de un array cumple la condicion
    public boolean esSeleccionado(){ boolean clasifica = false;
        for ( int i = 0; i < puntos.length; i++){
            if (puntos[i]>10){ clasifica = true; }   }
        return clasifica;    }
    
    public String mostrar (){
        String cadena = "dorsal: "+dorsal+", nombre: "+nombre+", puntuaciones: ";
        for ( int i = 0; i < puntos.length; i++){
            cadena += puntos[i]+", ";
        }
        cadena += "media: "+pMedia();
                 
        
        return cadena;
    }
    
}
