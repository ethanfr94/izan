/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio1;

/**
 *
 * @author usuario
 */
public class Persona {    
    private String nombre, apellido1, apellido2, dni;    
    public Persona(String nombre, String apellido1, String apellido2, String dni){
        this.nombre=nombre;//constructor con valores dados
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.dni=dni.toUpperCase();
    }    
    public String clave(){//metodo que recoge los caracteres indicados en las posiciones dadas y crea una contraseña
        String password= nombre.substring(0, 1).concat(apellido1.substring(0,3).concat(apellido2.substring(apellido2.length()-1)));
        return password;
    }    
    public boolean dniValido(){//metodo que nos indica si la variable cumple los requisitos indicados
        String guia="abcdefghijklmnñopqrstuvwxyz";
        boolean valido=(dni.length()==9)&&guia.toUpperCase().contains(dni.substring(dni.length()-1));
        return valido;
   }
}
