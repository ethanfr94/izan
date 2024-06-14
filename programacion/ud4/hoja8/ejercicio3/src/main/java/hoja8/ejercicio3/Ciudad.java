/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio3;

/**
 *
 * @author DAM122
 */
public class Ciudad {

    private String nombre;
    private float latitud, longitud;
    private int habitantes;

    public Ciudad(String _nombre, float lat, float lon, int habitantes) {
        nombre = _nombre;
        latitud = lat;
        longitud = lon;
        habitantes = habitantes;
    }

    public String toString() {
        String cadena = nombre + " tiene " + habitantes + " habitantes";
        return cadena;
    }// = String.format("%s tiene %d habitantes.", this.nombre, this.habitantes)    

    public int getHabitantes() {
        return habitantes;
    }

    public String getNombre() {
        return nombre;
    }
}
