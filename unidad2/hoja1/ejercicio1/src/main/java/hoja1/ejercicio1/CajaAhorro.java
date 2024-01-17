/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

/**
 *
 * @author usuario
 */
public class CajaAhorro {
    
    private int saldo;//atributo
    private int transacciones; //atributo (depositos y giros realizados)
    
    public CajaAhorro() {//constructor por defecto
        saldo=0;
        transacciones=0;
    }
    
    public CajaAhorro(int saldo){//constructor indicando valores iniciales
        this.saldo=saldo;
        transacciones=1;
    }
    
    public void depositar(int cantidad){//metodo permite depositar el valor de la cantidad en la cuenta
        this.saldo+=cantidad;
        transacciones++;
    }
    public void girar(int cantidad) {//metodo permite registrar un giro por valor de la cantidad
        this.saldo -= cantidad;
        transacciones++;
    }
    public int obtenerSaldo(){//metodo retorna ekl saldo de la cuenta
        return saldo;
    }
    public int obtenerTransacciones(){//metodo retorna la cantidad total de transacciones realizadas en la cuenta
        return transacciones;
    }
}
