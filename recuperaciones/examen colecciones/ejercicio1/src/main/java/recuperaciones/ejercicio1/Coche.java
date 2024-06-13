/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Coche extends Vehiculo {

    private int potencia;

    public Coche(String matricula, String modelo, Conductor conductor, int potencia) throws Exception {
        super(matricula, modelo, conductor);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcularPrimaSeguro() {
        float desc = 0.10f;
        return super.calcularPrimaSeguro() + (potencia * desc);
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LinkedHashMap<String, String> p = new LinkedHashMap<>();
        Conductor c = new Conductor(this.getConductor().getNombre(), this.getConductor().getfCarnet());
        p.put("Matricula: ", this.getMatricula());
        p.put("Modelo", this.getModelo());
        p.put("Conductor", c.getNombre() +" "+ c.getfCarnet().format(f));
        p.put("Potencia", String.valueOf(this.getPotencia()));
        p.put("Prima", String.format("%,.2f €", calcularPrimaSeguro()));
        return p;
    }

}
