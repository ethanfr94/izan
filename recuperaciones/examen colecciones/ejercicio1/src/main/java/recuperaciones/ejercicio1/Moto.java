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
public class Moto extends Vehiculo{

    private int cilindrada;

    public Moto(String matricula, String modelo, Conductor conductor, int cilindrada) {
        super(matricula, modelo, conductor);
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularPrimaSeguro() {
        float desc = 0.25f;
        return super.calcularPrimaSeguro()+(cilindrada*desc);
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LinkedHashMap<String,String> p=new LinkedHashMap<>();        
        Conductor c=new Conductor(this.getConductor().getNombre(),this.getConductor().getfCarnet());
        p.put("Matricula: ",this.getMatricula());
        p.put("Modelo", this.getModelo());
        p.put("Conductor",c.getNombre()+" "+c.getfCarnet().format(f));
        p.put("Cilindrada", String.valueOf(this.getCilindrada()));
        p.put("Prima", String.format("%,.2f €",calcularPrimaSeguro()));
        return p;
    }
    

}
