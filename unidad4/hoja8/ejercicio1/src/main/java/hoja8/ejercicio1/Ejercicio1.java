/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Array ar = new Array();
        int opcion;
        Scanner t;
        do {
        System.out.print("escoge un programa:\n"
                + "1. mostrar valores del array\n"
                + "2. introducir valores\n"
                + "3. media\n"
                + "4. modificar valor\n"
                + "5. rotar a la izquierda\n"
                + "6. rotar a la derecha\n"
                + "7. comparar array\n"
                + "8. sumar valores pares\n"
                + "9. rellenar con multiplos\n"
                + "otro. salir\n");
        opcion = new Scanner (System.in).nextInt();
        
        switch (opcion){
            case 1 ->{
                ar.mostrar();
            }
            case 2 ->{
                ar.introducir();
            }
            case 3 ->{
                System.out.println(ar.media());
            }
            case 4 ->{
                System.out.print("introduce un valor: ");
                int v = new Scanner (System.in).nextInt();
                System.out.print("introduce una posicion: ");
                int p = new Scanner (System.in).nextInt();
                ar.modificar(v, p);
            }
            case 5 ->{
                ar.rotarI();
            }
            case 6 ->{
                ar.rotarD();
            }
            case 7 ->{
                Array ar1 = new Array();
                ar1.introducir();
                ar.comparar(ar1);
            }
            case 8 ->{
                ar.sumaPares();
            }
            case 9 ->{
                ar.multiplos(opcion);
            }
            case 0 ->{
                System.out.println("adios");
            }
            default ->{
                System.out.println("el indice introducido no es valido");
            }
        }
        }while (opcion != 0);
    }
}
