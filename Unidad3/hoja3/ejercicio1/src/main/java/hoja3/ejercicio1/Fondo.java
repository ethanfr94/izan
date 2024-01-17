/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author dam1
 */
public class Fondo {
    private double c, i;
    private int n;
    
    public Fondo(double _c, double _i, int _n){
        c=_c;
        i=_i;
        n=_n;
    }
    
    public void evolucion(){
        int p=1;
        while(p<=n){
        double interes= (c*i/100*p);
        double cfinal=c+interes;
        System.out.println("el interes es de: "+interes+" y el capital es de: "+cfinal);
        
        p++;
    }
    }
}
