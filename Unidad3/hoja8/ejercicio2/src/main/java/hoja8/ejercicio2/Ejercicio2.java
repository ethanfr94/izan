/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *En una tienda han decidido aplicar una estrategia de marketing para aumentar las ventas que
consiste en, por cada producto que se compra, el cliente lanza una bola virtual y en función de
su color, se aplica un descuento.
Si la bola es blanca, no hay descuento. Si la bola es amarilla, hay un 5% de descuento. Si la bola
es azul, hay un 7% de descuento y si la bola es roja, hay un 10% de descuento.
Escribe un programa que permite introducir los productos que ha comprado un cliente y
muestre para cada uno de ellos el descuento que se hace, es decir, para cada venta se lanza una
bola y en función del color se aplica el descuento correspondiente. Al final se debe mostrar el
total a pagar por el cliente.
Para simular el lanzamiento de la bola, el ordenador generará un número aleatorio (0. Blanco,
1: amarillo, 2: azul y 3: rojo)
Los precios de los productos que ha comprado el cliente se piden de forma repetitiva hasta que
la entrada tiene un -1.
 * @author DAM122
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Random r = new Random();
        
        double precio;
        double total = 0; 
        
       
                     
                
                
        do {
       
        
        float descuento= 0;
            
                System.out.println("introduce precio del articulo");
                precio = t.nextDouble();
                if (precio != -1){
                    
                 int n = r.nextInt(4);
                 if (n == 0){
                     System.out.println("la bola es blanca"); 
                     System.out.println("el precio final del producto es: "+precio);
                     total += precio;
                }
                 else if (n == 1){
                     descuento = (float) (precio * 0.05);
                     precio *= 0.95;
                     System.out.println("la bola es amarilla"); 
                     System.out.println("se aplicara un descuento de: "+descuento);
                     System.out.println("el precio final del producto es: "+precio);
                     total += precio;
                }
                 else if (n == 2){
                     descuento = (float) (precio * 0.07);
                     precio *= 0.93;
                     System.out.println("la bola es azul");  
                     System.out.println("se aplicara un descuento de: "+descuento);
                     System.out.println("el precio final del producto es: "+precio);
                     total += precio;
                }
                 else if (n == 3){
                     descuento = (float) (precio * 0.1);
                     precio *= 0.9;
                     System.out.println("la bola es roja");  
                     System.out.println("se aplicara un descuento de: "+descuento);
                     System.out.println("el precio final del producto es: "+precio);
                     total += precio;
                }
                }else{
                    System.out.println("ahora se generara su ticket");
                }
            
            
        }while (precio != -1);
        
       System.out.printf("el precio de la compra es de: %,.2f\n", total);
        
    }
}
