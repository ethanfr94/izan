/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author usuario
 */
public class Restaurante {
    //atributos
    private int huevos;
    private double chorizo;
    private int platos;       
    //contstructor que inicializa el bjeto con valores indicados
    public Restaurante(int docenasHuevos, double kgChorizo){
        this.huevos=docenasHuevos*12;
        this.chorizo=kgChorizo*1000;
    }    
    //metodo que añade huevos
    public void addHuevos(int docenas){
        huevos+=docenas*12;
    }    
    //metodo que añade chorizo
    public void addChorizo(double kgChorizo){
        chorizo+=kgChorizo*1000;
    }    
    //metodo que nos indica el numero de platos que podemos servir
    public int getPlatos(){
         platos=(int) (huevos/2<chorizo/200?huevos/2:chorizo/200);        
        return platos;
    }    
    //metodo que nos sirve un plato
    public void sirvePlato(){
        huevos-=2;
        chorizo-=200;
    }    
    //metodo que nos indica los huevos que nois quedan
    public int getHuevos(){
        return huevos;
    }    
    //petodo que nos indica el chorizo que nos queda
    public double getChorizo(){
        return chorizo;
    }
    
   
}
