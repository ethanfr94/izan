/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja9.ejercicio2;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {

            Alimento a=new Alimento("pollo",10,15,true);
            
            System.out.println("el alimento es: "+a.getNombre());
            System.out.println("contiene "+a.getGrasas()+ "g de grasa");
            System.out.println("contiene "+a.getHidratos()+"g de hidratos");
            System.out.println(a.getOrigenAnimal());
            System.out.println(a.getDatos());
            System.out.println(a.esDietetico());
            System.out.println("contiene "+a.calorias(150)+" calorias");

            




    }
}
