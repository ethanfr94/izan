/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Serie {

    double[] n;
    char c;
    Scanner t = new Scanner(System.in);

    public Serie(int a, char ch){
        n = new double [a];
        c = ch;
        if (c != '+' && c != '*'){
            System.out.println("el caracter introducido no es valido");
        }else {
        System.out.println("introduce los valores del array");
        for (int i = 0; i < n.length; i++){
            System.out.print("n["+(i+1)+"]/n["+n.length+"]: ");
            n[i]= t.nextDouble();
        }    
        }
    }
    
    public double resultado(){
        double resultado = 0;
        if (c == '+'){
            for (int i = 0; i < n.length; i++){
                resultado += n[i];
            }
        }
        else if (c == '*'){
            resultado = 1;
            for (int i = 0; i < n.length; i++){
                resultado *= n[i];
            }
        }
        
        return resultado;
    }
    
}
