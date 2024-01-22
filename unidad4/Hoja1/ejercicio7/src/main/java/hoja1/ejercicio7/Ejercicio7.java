/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio7;

/**
 *
 * @author usuario
 */
public class Ejercicio7 {

    public static void main(String[] args) {
         
        int [] a = new int [10];        
        for (int i = 0; i<=a.length-1; i++){
            a[i] = (int) Math.floor(Math.random()*50);
            System.out.print(a[i]+" ");}System.out.println("");        
            //ordenamos un array de mayor a menor 
            for (int i = 0; i< a.length; i++){
            for (int j = 0; j < a.length-i-1; j++){                
                if (a[j] < a[j+1]){
                int aux = a[j];
                a[j] = a[j+1];
                a[j+1] = aux;
                }}}   
        for (int i = 0; i< a.length; i++){
            System.out.print(a[i]+" ");}System.out.println(""); }     
               
            
        
    }

