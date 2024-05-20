/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h4.ej1;

/**
 *
 * @author DAM122
 */
public class Ej1 {

    public static void main(String[] args) {
        //falta corregir que no permita duplicados por nombre no por altura
        Jugador j1 = new Jugador("izan", 201);
        Jugador j2 = new Jugador("juan", 205);
        Jugador j3 = new Jugador("pedro", 204);
        Jugador j4 = new Jugador("luis", 174);
        Jugador j5 = new Jugador("manuel", 194);
        
        Equipo e = new Equipo();
        e.insert(j1);
        e.insert(j2);
        e.insert(j3);
        e.insert(j4);
        e.insert(j5);
        
        System.out.println(e.mostrarTodos());
        
        e.borrar("juan");
        
        System.out.println(e.mostrarTodos());
        
        System.out.println(e.masAlto());
        System.out.println(e.masBajo());
        
        System.out.println(e.mas2());
        
        
    }
}
