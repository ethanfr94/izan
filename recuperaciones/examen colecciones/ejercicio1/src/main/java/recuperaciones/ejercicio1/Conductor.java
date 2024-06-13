/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package recuperaciones.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

/**
 *
 * @author Izan Franco Anduaga
 */
public final class Conductor implements Identificable, Comparable<Conductor>{
    private String nombre;
    private LocalDate fCarnet;

    public Conductor(String nombre, LocalDate fCarnet) {
        this.nombre = nombre;
        this.fCarnet = fCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfCarnet() {
        return fCarnet;
    }

    public void setfCarnet(LocalDate fCarnet) {
        this.fCarnet = fCarnet;
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LinkedHashMap<String,String> datos = new LinkedHashMap<>();
        datos.put("Nombre: ", nombre);
        datos.put("Fecha carnet: ", fCarnet.format(f));
        return datos;
    }
    
    @Override
    public int compareTo(Conductor o) {        
        return this.fCarnet.compareTo(o.fCarnet);
    }
    
    
}
