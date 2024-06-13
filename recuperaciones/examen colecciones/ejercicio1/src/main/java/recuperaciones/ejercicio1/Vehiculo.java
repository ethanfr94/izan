/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package recuperaciones.ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

/**
 *
 * @author Izan Franco Anduaga
 */
public abstract class Vehiculo implements Primable, Identificable, Comparable<Vehiculo>{
    
    private String matricula;
    private String modelo;
    private Conductor conductor;
    private static int nVehiculos;

    public Vehiculo(String matricula, String modelo, Conductor conductor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.conductor = conductor;
        nVehiculos++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public static int getnVehiculos() {
        return nVehiculos;
    }

    public static void setnVehiculos(int nVehiculos) {
        Vehiculo.nVehiculos = nVehiculos;
    }
          
    @Override
    public double calcularPrimaSeguro() {
        double primaBase = 500;
        int aniosCarnet = Period.between(conductor.getfCarnet(), LocalDate.now()).getYears();
        if(aniosCarnet<=15 && aniosCarnet>=5){
            primaBase *= 0.65;                    
        }
        return primaBase;
    }
    
    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LinkedHashMap<String, String> p = new LinkedHashMap<>();     
        p.put("Matricula: ", this.getMatricula());
        p.put("Modelo", this.getModelo());
        p.putAll(conductor.datosObjeto());
        return p;
    }

    @Override
    public int compareTo(Vehiculo o) {
        String numero=o.getMatricula().substring(0, 3);     
        String numeroMio=this.getMatricula().substring(0, 3);     
        String letras=o.getMatricula().substring(5);
        String letrasMio=this.getMatricula().substring(5);
        if(letras.compareTo(letrasMio)==0){
            return numero.compareTo(numeroMio);
        }
        else{
            return letras.compareTo(letrasMio);
        }
        //return this.getMatricula().compareTo(o.getMatricula());
    }

    
    
    

}
