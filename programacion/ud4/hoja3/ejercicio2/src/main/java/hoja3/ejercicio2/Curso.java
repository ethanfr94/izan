/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Curso {
    private String curso;
    private String [] alumnos;
    
    
    public Curso(int nAlumnos){        
        curso = "DAW";
        Scanner t;
        alumnos = new String [nAlumnos];
        for (int i =  0; i < alumnos.length; i++){
            System.out.println("introduce nombre de alumno"+(i+1)+": ");
            alumnos [i] = new Scanner (System.in).nextLine(); 
          
        }
          
    }
    
    public String iniciales(){
        String cadena = "";
        for (int i =  0; i < alumnos.length; i++){
            cadena += alumnos[i].substring(0, 1).concat(".");
        }
        return cadena;
    }
    
    public void desplaza(){//mueve los vaslores una 
        String aux = "";//posicion a la derecha
        for (int i =  alumnos.length-1; i >= 0; i--){
           if (i == alumnos.length-1) {
                aux = alumnos[i];
                alumnos[i] = alumnos[0];
            } else if (i > 0) { 
                alumnos[i+1] = alumnos[i];
            } else {
                alumnos[i+1] = alumnos[i];
                alumnos[i] = aux;} }  }
    
    public String verNombre(int posicion){
        if (posicion > alumnos.length) {
            return "La posicion introducida no es valida";
        } else {
            return "El alumno en la posicion "+posicion+" es "+alumnos[posicion-1];
        }
    }
    
    public boolean esDaw(){
        String aux = "daw";
        if (curso.toLowerCase().contains(aux)){
            return true;
        }else return false;
    }
}
