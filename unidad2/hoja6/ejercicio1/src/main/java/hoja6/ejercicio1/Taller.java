/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author dam1
 */
public class Taller {        
    private int ruedas, aceite;
    private static int contadorCambiosTotales,contadorCambiosParciales;    
    public Taller(int aceite, int ruedas){//constructor con valores dados
        //aceite en bidones de 5l
        this.aceite=aceite*5;
        this.ruedas=ruedas;
    }    
    public void addAceite(int addaceite){//metodo para añadir aceite, recoge bidones y lo pasa a litros
        aceite += (addaceite*5);
    }    
    public void addRuedas(int addruedas){//metodo para añadir ruedas
        ruedas += addruedas;
    }    
    public int getCambioCompleto(){
        int cambioCompleto=ruedas/4<aceite/3?ruedas/4:aceite/3;//metodo que nos indica los cambios coimpletos que se pueden hacer
        return cambioCompleto;
    }    
    public int getCambioParcial(){
        int cambioParcial=ruedas/2<aceite/3?ruedas/2:aceite/3;//metodo que nos indica los cambios parciales que se pueden hacer
        return cambioParcial;
    }    
    public void cambioCompleto(){//metodo que realiza un cambio completo
        aceite-=getCambioCompleto()>=1?3:0;
        ruedas-=getCambioCompleto()>=1?4:0;
        contadorCambiosTotales++;
        //this.contadorCambiosTotales=contadorCambiosTotales+1;
    }    
    public void cambioParcial(){//metodo que realiza un cambio parcial
        aceite-=getCambioParcial()>=1?3:0;
        ruedas-=getCambioParcial()>=1?2:0;
        contadorCambiosParciales++;
        //this.contadorCambiosParciales=contadorCambiosParciales+1;
    }    
    public int getRuedas(){//nos indica las ruedas
        return ruedas;
    }    
    public int getAceite(){//nos indica el aceite en litros
        return aceite;
    }       
    public String toString(){//nos muestra una "factura"
        double ingresos= contadorCambiosTotales*4*50+contadorCambiosTotales*3*4.50;
        ingresos=ingresos+contadorCambiosParciales*2*60+contadorCambiosParciales*3*5;
        String cadena= "TALLER\nEXISTENCIAS: \n\tRuedas: "+getRuedas()+" unidades.\n\tAceite: "+getAceite()+" litros.\nINGRESOS: tOTAL: "+ingresos+" €";
        return cadena;
    }
    
    
    
}
