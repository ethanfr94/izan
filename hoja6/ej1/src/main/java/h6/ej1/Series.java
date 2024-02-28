/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package h6.ej1;

/**
 *
 * @author usuario
 */
public interface Series {
    int inicio = 0;
    
    public abstract void getsiguiente();
    
    public abstract void reiniciar();
    
    public abstract void setComenzar(int x);
    
    public default void mostrarInicio (){
        System.out.println("inicio : "+inicio);
    }
    
    public static void nombreInterfaz(){
        System.out.println("interfaz series");
    }
}
