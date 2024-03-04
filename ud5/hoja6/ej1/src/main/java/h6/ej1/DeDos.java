/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h6.ej1;

/**
 *
 * @author usuario
 */
public class DeDos implements Series {
    private int valor, anterior;

    public DeDos() {
        valor = inicio;
        anterior = valor - 2;
    }

    public int getValor() {
        return valor;
    }    
    
    @Override
    public void getsiguiente() {
        valor += 2;
        anterior = valor - 2;
        
    }

    @Override
    public void reiniciar() {
        valor = 0;
        anterior = valor - 2;        
    }

    @Override
    public void setComenzar(int x) {
        valor = x;
        anterior = valor - 2;        
    }
        
    public void getAnterior() {
        System.out.println(anterior);
    }
}
