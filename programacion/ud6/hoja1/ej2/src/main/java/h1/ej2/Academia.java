/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h1.ej2;

import java.util.LinkedList;
import utils.utils.Utils;

/**
 *
 * @author usuario
 */
public class Academia {
    private LinkedList<Curso> ac;

    public Academia() {
        ac = new LinkedList<>();
    }
    

    
    public void aniadirAlFinal(){
        ac.addLast(new Curso());
    }
    
    public void aniadir(int posicion){
        ac.add(posicion, new Curso());
    }
    
    public void borrar(String cod){
        for (Curso curso : ac)if(curso.getCodigo().equalsIgnoreCase(cod))ac.remove(curso);
    }
    
    public void modificarHoras(String cod){
        for (Curso curso : ac) {
            if(curso.getCodigo().equalsIgnoreCase(cod))curso.setnHoras("10");
        }
    }
    
    public void mostrarCursos(){
       for (Curso curso : ac)System.out.println(curso.getCodigo() + " - " + curso.getDescripcion() + " - " + curso.getnHoras() + " horas");        
    }
    
    
}
