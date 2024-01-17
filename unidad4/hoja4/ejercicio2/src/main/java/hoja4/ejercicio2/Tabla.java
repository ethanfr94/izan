/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

/**
 *
 * @author usuario
 */
public class Tabla {
    private int [][] a;
    
    public Tabla(){
        a = new int [4][5];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = (int) Math.floor(Math.random()*100)+1;
            }
        }
    }
    public void mostrar(){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void mayorF(int fila){
        int n = 0;
        for (int i = 0; i < a.length; i++){
            if (a[fila-1][i]>n){
                n = a[fila-1][i];
            }
        }
        System.out.println("el mayor es "+n);
    }
    public void mayorC(int columna){
        int n = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i][columna-1]>n){
                n = a[i][columna-1];
            }
        }
        System.out.println("el mayor es "+n);
    }
    
    public double media(){
        double suma = 0;
        int valores = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                suma += a[i][j];
                valores++;
            }
    }
        return suma/valores;
    }
   
}
