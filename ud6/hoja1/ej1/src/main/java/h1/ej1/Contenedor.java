/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h1.ej1;

import java.util.Arrays;

/**
 *
 * @author DAM122
 */
public class Contenedor <T> {
    //creamos un array del tipo generico(T)
    private T[] objeto;
    //creamos el constructor    
    public Contenedor(T[] a) {
        objeto = a;
    }

    public void insertarAlPrincipio(T nuevo){
        if (objeto[0] != null){
        //copiamos el array dandole una posicion mas de longitud
        objeto = Arrays.copyOf(objeto, objeto.length+1);
        //copiamos el array pero desplazandole una posicion a la derecha
        System.arraycopy(objeto , 0 ,objeto, 1, objeto.length-1);
        //rellenamos la posicion que hemos dejado vacia al principio con el valor pasado por parametro
        objeto[0] = nuevo;
        }
        else{
            objeto[0] = nuevo;
        }
    }
    
    public void insertarAlFinal(T nuevo){
        //copiamos el array dandole una posicion mas de longitud
        objeto = Arrays.copyOf(objeto, objeto.length+1);
        //en la ultima posicion insertamos el valor pasado por parametro
        objeto[objeto.length] = nuevo;
    }
    
    public T extraerDelPrincipio(){
        T n;
        // creamos una variable en la que almacenamos la primera posicion del array
        n = objeto [0];
        //copiamos el array desde la segunda posicion pero pero pegandolo en la anterior y eliminamos la ultima posicion
        System.arraycopy(objeto , 1 ,objeto, 0, objeto.length-1);
        objeto = Arrays.copyOf(objeto, objeto.length-1);
        return n;
    }
    
    public void ordenar(){
        Arrays.sort(objeto);
    }       
    
    @Override
    public String toString() {        
        return Arrays.deepToString(objeto);
    }
    
    
}
