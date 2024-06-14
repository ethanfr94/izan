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
        this.mes = mes;
        this.ano = ano;
    }

    public static int getMes() {
        return mes;
    }

    public static int getAno() {
        return ano;
    }
    
    @Override
    public String datos(){
        return super.datos()+"caducidad: "+mes+"/"+ano;
    }

    @Override
    public String caducados() {
        String cadena="";
        if (LocalDate.of(getAno(), getMes(), 1).isAfter(LocalDate.now())){
            cadena = "cod: "+codigo+" descripcion: "+descripcion;
        }
        return cadena;
    }    


   
    
    
}
