/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package h4.ej1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ej1 {

    public static void main(String[] args) {
        Publicacion[] p = new Publicacion[4];
        
        p[0] = Publicacion.crear(1);
        p[1] = Publicacion.crear(1);
        p[2] = Publicacion.crear(1);
        p[3] = Publicacion.crear(2);
        

        for (Publicacion p1 : p) {
            System.out.println(p1.toString());
        }

        //Disco.cortaNombre(Disco.masLargo(p));

        Libro.libroLargo(p);
        
        Disco.ultimosDosAnos(p);
        

    }
}
