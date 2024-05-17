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
        ArrayList<Integer> lista = leeValores();
        
        int suma;
        double media;
        
        
        
        suma = calcularSuma(lista);
        media = suma / lista.size();
        mostrarResultados(lista, suma, media);

    }
public static ArrayList<Integer> leeValores() {
        ArrayList<Integer> al = new ArrayList<>();
        Integer x;
        do{
        x = Utils.introEntero("introduce entero (-99 para acabar)");
        if(x != -99)al.add(x);
        }while(x != -99);
        return al;
    }

    public static int calcularSuma(ArrayList<Integer> al) {
        int x = 0;
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            x += it.next();
        }
        return x;
    }

    public static void mostrarResultados(ArrayList<Integer> al, int suma, double media) {
        System.out.println(al);
        System.out.println("la suma de los valores es: " + suma);
        System.out.println("la media de los valore es: " + media);        
         int x = 0;
        for (Integer num : al) {
            if(num > media){
                x++;
            }
        }
        System.out.println("hay " + x + " valores por encima de la media");
    }
    
}
