/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h6.ej1;

/**
 *
 * @author usuario
 */
public class DeTres implements Series {
    private int valor;
        
    public DeTres() {
        valor = inicio;
    }

    public int getValor() {
       return valor;
    }    
    
    @Override
    public void getsiguiente() {
        valor += 3;        
    }

    @Override
    public void reiniciar() {
        valor = 0;
    }

    @Override
    public void setComenzar(int x) {
        valor = x;
    }
    
    
}
