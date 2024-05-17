/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package h1.ej1;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author usuario
 */
public class Ej1 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = Met.leeValores();
        
        int suma;
        double media;
        
        
        
        suma = Met.calcularSuma(lista);
        media = suma / lista.size();
        Met.mostrarResultados(lista, suma, media);

    }

    
}
