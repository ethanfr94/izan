/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Comunidad {
    
    private String comunidad;
    private String [] provincias;
    
    public Comunidad (String nombre, int cantidad){
        comunidad = nombre;
        provincias = new String [cantidad];
        Scanner t;
        for(int i = 0; i < provincias.length; i++){
            System.out.println("introduce provincia");
            provincias [i] = new Scanner (System.in).nextLine();
        }
    }
    
    public String mostrar(){
        String cadena = comunidad.toUpperCase()+" / ";
        for(int i = provincias.length-1; i >= 0 ; i--){
            if (provincias[i].length()<4){
            cadena += provincias[i]+" "; 
            }
            else {
                cadena += provincias[i].substring(0, 4)+" ";   
            }
       }
        return cadena;
    }
    
    public String sorteo(){
        int i= (int) Math.floor(Math.random()*provincias.length);
        return provincias[i];
    }
    
    public int buscar (String provincia){int n = -1;        
        for(int i = 0; i < provincias.length && n==-1; i++){
            if(provincias[i].toLowerCase().contains(provincia.toLowerCase())){
                n = i; }}//con toLowerCase ignoramos si esta escrito en mayus o minus
        return n;}//buscar un valor en un array y que solo nos diga si lo encuentra
}
