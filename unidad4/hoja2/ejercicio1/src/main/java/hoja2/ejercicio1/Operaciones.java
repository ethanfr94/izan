/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Operaciones {
    private int [] a;
    
    public Operaciones(){
        a = new int [5];
        Scanner t = new Scanner (System.in);
        for (int i = 0; i<a.length; i++){
            System.out.println("escribe los valores del array");
            a[i] = t.nextInt();
        }
    }
    
    public void multiplicar(){
        for (int i = 0; i < a.length; i++){
            a[i]=a[i]*2;
        }
    }
    
    public void mostrar(){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }System.out.println("");
    }
    
    public int par(){
        int x=0;
        for (int i = 0; i < a.length; i++){
            if (i % 2 == 0 && i != 0){
                x+=a[i];
            }
        }
        return x;
    }
}
