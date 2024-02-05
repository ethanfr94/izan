/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.ejercicio2;

import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author usuario
 */
public class Mascota {
    private String nombre;
    private LocalDate fecha;
    
    public Mascota (String _nombre, int ano, int mes, int dia){
        nombre = _nombre;
        fecha = LocalDate.of(ano, mes, dia);
        //representa la fecha
    }
    
    public int getEdad(){
        return Period.between(fecha, LocalDate.now()).getYears();
        //nos dice la cantidad de años en un periodo de tiempo definido
    }
    
    public String toString(){
        DateTimeFormatter formatoFecha= DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
        //convierte la fecha en una cadena de texto
        String cadena = "la mascota llamada "+nombre+" nacio el "+fecha.format(formatoFecha);
        return cadena;
    }
}