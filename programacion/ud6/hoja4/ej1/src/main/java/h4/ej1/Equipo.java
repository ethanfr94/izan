/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h4.ej1;


import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAM122
 */
public class Equipo {
    TreeSet<Jugador> equipo;

    public Equipo() {
        equipo = new TreeSet<>();
    }
    
    public void insert(Jugador j){
        if(equipo.add(j))System.out.println("jugador añadido");
        else System.out.println("error al añadir");
    }
    
    public void borrar(String jugador){
        for (Jugador jug : equipo) {
            if(jug.getNombre().equals(jugador)){
                equipo.remove(jug);
                System.out.println("jugador eliminado");
            }
        }
    }
    
    public String mostrarTodos(){
        String equip = "";
        for (Jugador jug : equipo) {
            equip += jug.toString()+"\n";
        }
        return equip;
    }
    
    public String masBajo(){
        String bajo = null;
        int x = 9999;
        for (Jugador jug : equipo) {
            if(jug.getEstat() < x){
                x = jug.getEstat();
            }
        }
        for (Jugador juga : equipo) {
            if(juga.getEstat() == x){
                bajo = juga.toString();
            }
        }
        return bajo;
    }
    
    public String masAlto(){
        String alto = null;
        int x = 0;
        for (Jugador jug : equipo) {
            if(jug.getEstat() > x){
                x = jug.getEstat();
            }
        }
        for (Jugador juga : equipo) {
            if(juga.getEstat() == x){
                alto = juga.toString();
            }
        }
        return alto;
    }
    
    public TreeSet<Jugador> mas2(){
        TreeSet<Jugador> torres = new TreeSet<>();
        for (Jugador jug : equipo) {
            if(jug.getEstat() > 200)torres.add(jug);
        }
        return torres;        
    }
    
}
