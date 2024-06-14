/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.tienda;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Perecederos extends Articulo{

    private int mes;
    private int anio;

    public Perecederos(int mes, int anio, String desc, int cod, double precio) {
        super(desc, cod, precio);
        this.mes = mes;
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    
    
    @Override
    public String toString() {
        return super.toString().concat(String.format(" caduca en %d / %d", mes, anio)); 
        
    }
    
    public static String caducados (Articulo[] array){
        String cadena ="\n\tArticulos caducados\n";
        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof Perecederos per){// si el array[i] es del tipo indicado "Perecederos" crea el objeto "per" del tipo indicado "Perecederos"
              //  Perecederos per = (Perecederos)array[i];
                if (per.getAnio() < LocalDate.now().getYear() || (per.getAnio() == LocalDate.now().getYear() && per.getMes() > LocalDate.now().getMonthValue())){
                    cadena = cadena.concat("\nel codigo del articulo es "+array[i].cod+" y la descripcion es "+array[i].desc);
                }
            }
        }
        return cadena;
    }
    
    
    
}
