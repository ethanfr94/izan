/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2.ej2;

/**
 *
 * @author DAM122
 */
public class EnPromocion extends Articulo{
    private double descuento;

    public EnPromocion(double descuento, String codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
    }
    
    
    @Override
    public double getPrecio() {
        return precio * descuento;
    }

    @Override
    public void datos(){
        super.datos();
    }
    
    
}
