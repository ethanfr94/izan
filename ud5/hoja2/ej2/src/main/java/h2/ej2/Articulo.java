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
public class Articulo {
    protected String codigo, descripcion;
    protected double precio;

    public Articulo(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    private String getCodigo() {
        return codigo;
    }

    private String getDescripcion() {
        return descripcion;
    }

    protected double getPrecio() {
        return precio;
    }
    
    public String datos(){
        String aux ="cod: "+getCodigo()+" articulo: "+getDescripcion()+" precio: "+getPrecio();
        return aux;
    }
    
    public String caducados(){
        String aux="";
        return aux;
    }
    
}
