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
public class Articulo {
    protected String desc;
    protected int cod;
    protected double precio;

    public Articulo(String desc, int cod, double precio) {
        this.desc = desc;
        this.cod = cod;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("el articulo %s con el codigo %d tiene un precio de %,.2f" ,desc, cod, precio);
    }
    
   /* public static String EnPromocion(Articulo[] array){
        String cadena ="\n\tArticulos en promocion\n";
        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof EnPromocion){
                cadena = cadena.concat("\n"+array.toString());
            }
        }
        return cadena;
    }
    
    /*public static String descuento (Articulo[] array){
        String cadena ="\n\tArticulos caducados\n";
        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof Perecederos){
                if (array[i].getAnio() < LocalDate.now().getYear() || (array[i].getAnio() == LocalDate.now().getYear() && array[i].getMes() > LocalDate.now().getMonthValue())){
                    cadena = cadena.concat("\n"+array.toString());
                }
            }
        }
        return cadena;
    }*/
    
    
    
    
}
