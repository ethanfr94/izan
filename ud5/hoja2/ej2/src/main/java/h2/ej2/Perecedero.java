/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2.ej2;

import java.time.LocalDate;

/**
 *
 * @author DAM122
 */
public class Perecedero extends Articulo {
    private static int mes, ano;
    private String caducidad;

    public Perecedero(int mes, int ano, String codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);        
        this.caducidad = mes+"/"+ano;
    }

    public static int getMes() {
        return mes;
    }

    public static int getAno() {
        return ano;
    }
    
    @Override
    public void datos(){
        super.datos();
        System.out.println("caducidad: "+caducidad);
    }

    @Override
    public void caducados() {
        if (LocalDate.of(Perecedero.getAno(), Perecedero.getMes(), 31).isAfter(LocalDate.now())){
            System.out.println("cod: "+codigo+" descripcion: "+descripcion);
        }
    }
    
    
}
