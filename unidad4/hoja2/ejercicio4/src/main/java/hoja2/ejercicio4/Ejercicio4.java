/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio4;

/**
 *
 * @author DAM122
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       Alumno a1;
       a1 = new Alumno("izan franco");
       System.out.println("la mayor norta es: "+a1.mayor());
        System.out.println("la menor nota es: "+a1.menor());
        System.out.println("Alumno "+a1.mostrar());
    }
}
