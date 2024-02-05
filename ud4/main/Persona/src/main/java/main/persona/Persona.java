/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.persona;

import static java.lang.Integer.parseInt;

/**
 *
 * @author usuario
 */
public class Persona {

    String nombre;
    int edad;

    //constructor objeto persona
    public Persona(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad;
    }

    public void mostrar() {//metodo que muestra los datos
        System.out.println(nombre + " tiene " + edad + " años");
    }

    public boolean mayor() {
        boolean mayor;//metodo que nos devuelve si es mayor de edad
        if (edad >= 18) {
            mayor = true;
        } else {
            mayor = false;
        }
        return mayor;
    }

    public static void main(String[] args) {
        //metodo principal introduciendo los datos  como argumentos
        Persona p1 = new Persona(args[0], parseInt(args[1]));
        p1.mostrar();//con parseInt convertimos un valor String en int
        System.out.println(p1.nombre + " es mayor de edad? " + p1.mayor());
    }
}
