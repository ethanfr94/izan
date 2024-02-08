/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.tienda;

/**
 *
 * @author usuario
 */
public class EnPromocion extends Articulo{
    private int prom;

    public EnPromocion(int prom, String desc, int cod, double precio) {
        super(desc, cod, precio);
        this.prom = prom;
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("con un descuento del %d%%, y un precio final de %,.2f", prom, super.precio*(100-(prom/100)))); 
        
    }
    
    
}
