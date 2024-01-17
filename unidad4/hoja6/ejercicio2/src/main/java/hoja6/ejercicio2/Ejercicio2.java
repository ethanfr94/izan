/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Banco b = new Banco(3);
        Scanner t;
        boolean salir = false;
        do {
            t = new Scanner(System.in);
            System.out.println("\nMENU DEL BANCO\n\n1.-Ingresar un cliente\n2.-Mostrar los usuarios\n3.-Buscar un cliente\n4.-Eliminar un cliente\n5.-Salir\n");
            int n = t.nextInt();
            switch (n) {
                case 1->{
                    b.ingresar();
                }
                case 2->{
                    b.mostrar();
                }
                case 3->{
                    
                    System.out.println("Introduce codigo de usuario: ");
                    System.out.println(b.buscar(new Scanner(System.in).nextInt()));
                }
                case 4->{
                    
                    System.out.println("Introduce codigo de usuario: ");
                    b.eliminar(new Scanner(System.in).nextInt());
                }
                case 5->{
                    salir = true ;
                }
                default->System.out.println("La opcion introducida no es correcta");
            }
        } while (!salir);
        
    }
}