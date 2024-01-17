/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

/**
 *
 * @author usuario
 */
public class Satelite {
    
    private int meridiano, paralelo, distierra;
    
    public Satelite (){//constructor de un objeto por defcto 
        meridiano=0;
        paralelo=0;
        distierra=0;
    }
    
    public Satelite (int meridiano, int paralelo, int distierra){//constructor con valores indicados
        this.meridiano=meridiano;
        this.paralelo=paralelo;
        this.distierra=distierra;
    }
    
    public void printPosicion(){//metodo que nos muestra la posicion del objeto
        System.out.println("meridiano "+meridiano+" paralelo "+paralelo);   
    }
    
    public void variarAltura(int movimiento){//metodopara variar la altura del objeto
        distierra=distierra+movimiento;
    }
    
    public void variarPosicon(int m, int p){//metodo que varia la posicion del objeto
        meridiano=m;
        paralelo=p;
    }
    
    public boolean enOrbita(){
        return distierra>=16000?true:false;//metodo que nos dice si el objetro esta o no en orbita segun su altura
    }
}
