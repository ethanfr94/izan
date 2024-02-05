/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2.ej2;

/**
 *
 * @author DAM122
 */
public class Perecedero extends Articulo {
    private int mes, ano;
    private String caducidad;

    public Perecedero(int mes, int ano, String codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);        
        this.caducidad = mes+"/"+ano;
    }

    public  int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    @Override
    public void datos(){
        super.datos();
        System.out.println("caducidad: "+caducidad);
    }
    
    public void caducados(){
        if ()
    }
}
