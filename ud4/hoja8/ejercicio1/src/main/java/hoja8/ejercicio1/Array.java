/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Array {
    
    private int [] a; 
    
    public Array (){
        a = new int [10];
    }
    
    public void mostrar(){
        for (int array : a){
            System.out.print(array+" ");
        }System.out.println("");
    }
    
    public void introducir(){
        Scanner t;
        int x;
        for (int i = 0; i < a.length; i++){
            System.out.print("introduce el valor para a["+i+"]: ");
            x = new Scanner (System.in).nextInt();System.out.println("");
            a [i] = x;
        }
    }
    
    public double media(){
        int suma = 0, m = 0;
        double media;
        for (int i = 0; i < a.length; i++){
            suma += a[i];
            m++;
        }
        media = (suma/m);
        return media;
    }
    
    public void modificar(int n, int pos){
        a[pos-1]=n;
    }
    
    public void rotarI(){
        int aux = a[0];
        for (int i = 0; i < a.length-1 ; i++){
            a[i] = a[i+1];            
        }
        a[a.length-1] = aux;
    }
    
    public void rotarD(){
        int aux = a[a.length-1];
        for (int i = a.length-1; i > 0 ; i--){
            a[i] = a[i-1];            
        }
        a[0] = aux;
    }
    
    public void comparar(Array b){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.a.length; j++){
                if (a[i] == b.a[j] && i == j){
                        System.out.println("ambos vectores tienen el valor "+a[i]+" en la posicion "+i);
                }
            }
        }
    }
    
    public void sumaPares(){
        int suma = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                suma += a[i];
            }
        }
        System.out.println("la suma de los valores pares es: "+suma);
    }
    
    public void multiplos(int n){
        for (int i = 0; i < a.length; i++){
            if (i == 0){
                a[i] = n;
            }else {
                a[i] = n*(i+1);
            }    
        }
    }
}
    
    
    
    

