/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio4;

/**
 *
 * @author usuario
 */
public class Bonoloto {
    private int [] n= new int [6];
    
    public Bonoloto(){
        for (int i = 0; i < n.length; i++){
            n[i] = (int) (Math.floor(Math.random()*49)+1);
            for (int j = i; j >= 0; j--){
                if (n[j] == n[i] && i!=j){
                    i--;
                }
            }
        }
    }
    
    public String mostrar(){
        String cadena = "los numeros premiados son: ";
            for (int i = 0; i < n.length; i++){
                cadena += n[i]+" ";
            }
        
        return cadena;
    }
}
    

