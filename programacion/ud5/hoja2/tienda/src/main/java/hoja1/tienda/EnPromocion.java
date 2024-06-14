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
    private int promocion;

    public EnPromocion(int prom, String desc, int cod, double precio) {
        super(desc, cod, precio);
        this.promocion = prom;
    }

    @Override
    public String toString() {        
        return super.toString().concat(String.format("con un descuento del %d%%, y un precio final de %,.2f€ ", promocion, super.precio-(super.precio*promocion/100))); 
        
    }
    
    public static String maxdescuento(Articulo[] array){
        int max = 0;
        EnPromocion maximo = null;
        String cadena ="el articulo con mayor descuento es: \n";
        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof EnPromocion promo){
                if (promo.promocion > max){
                    max = promo.promocion;
                    maximo = promo;
                }
                
            }            
        }
        if (maximo == null){
                cadena = "no existen articulos con descuento";
            }else{
            cadena = cadena.concat(maximo.toString()+"\n");
            }
        return cadena;
    }
}
