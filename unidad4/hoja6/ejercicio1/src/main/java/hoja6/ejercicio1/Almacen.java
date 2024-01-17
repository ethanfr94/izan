/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author DAM122
 */
public class Almacen {
    private Articulo [] art;
    
    public Almacen(int n){
        art = new Articulo [n];
    }
    
    public void llenar(){
        for (int i = 0; i < art.length; i++){
            art[i] = new Articulo();
        }
    }
}
