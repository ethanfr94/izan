/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        CajaAhorro c1= new CajaAhorro();//creamos el objeto
        c1.depositar(100);//depositamos una cantidad
        System.out.println("el saldo actual de c1 es de: "+c1.obtenerSaldo());//mostramos la cantidad
        c1.girar(50);//quitamos una cantidad
        System.out.println("el saldo actual de c1 es de: "+c1.obtenerSaldo());//mostramos la cantidad
        System.out.println("se han realizado "+c1.obtenerTransacciones()+" transacciones en c1");//mostramos el numero de operaciones realizadas
        
        CajaAhorro c2= new CajaAhorro(200);
        System.out.println("el saldo actual de c2 es de: "+c2.obtenerSaldo());
        System.out.println("se han realizado "+c2.obtenerTransacciones()+" transacciones en c2");
        
    }
}
