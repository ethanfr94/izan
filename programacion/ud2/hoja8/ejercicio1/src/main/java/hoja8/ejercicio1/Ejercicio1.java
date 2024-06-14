/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
         Persona p1;
        p1 = new Persona("pepito" ,"perez", "fernandez" ,"12345678a");
        System.out.println("la contraseña es:"+p1.clave());
        System.out.println("el dni es valido "+p1.dniValido());
    }
}
