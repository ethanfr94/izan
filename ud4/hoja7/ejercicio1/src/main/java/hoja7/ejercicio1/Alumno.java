/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Alumno {
 
    private String nombre;
    private int [] notas;
    
    public Alumno(String _nombre){
        Scanner t;
        nombre = _nombre;
        notas = new int [5];
        for (int i = 0; i < notas.length; i++){
            System.out.println("introduce nota");
            notas [i] = new Scanner (System.in).nextInt();
        }
    }
    
    public int mayor(){
        Arrays.sort(notas);
        return notas[notas.length-1];
    }
    
    public int menor(){
        Arrays.sort(notas);
        return notas[0];
    }
    
    public void ponerACero(){
        Arrays.fill(notas, 0);
    }
    
    public int buscar(int nota){
        Arrays.sort(notas);
        return Arrays.binarySearch(notas, nota);
    }
    
    public int[] tresMejores(){
        int[] mejores;
        Arrays.sort(notas);
        mejores = Arrays.copyOfRange(notas, notas.length-3, notas.length);
        return mejores;
    }

    public void getNotas() {
        for (int i = 0; i < notas.length; i++){
          if (i==0) {
                System.out.print(notas[i]);
            } else {
                System.out.print(" / " + notas[i]);
            }   
        }
    }
    
    
    
}
