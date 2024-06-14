/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class Tarjeta {
    Random r = new Random();
    static String nombre, nCuenta;
    static int  pin;
    static boolean bloqueada;
    static double saldo, compra;
    
    public Tarjeta (String _nombre, String _nCuenta, double _saldo){
            nombre = _nombre;
            nCuenta = _nCuenta;
            saldo = _saldo;
            bloqueada = true;
            pin = r.nextInt(10000);
            
    }
    
    public boolean desbloquea(int pin){
        if (pin == this.pin){
            bloqueada = false;
        }else {
            System.out.println("el pin no es correcto");
        }
        return bloqueada;
    }
    
    public double pagar(double compra, int _pin, String descripcion, boolean propina){
        this.compra = compra;
        if (bloqueada == false && pin == _pin && compra <= saldo){
            if (propina == true){
                saldo -= (compra * 1.05);
            }else {
                saldo -= compra;
            }
            ticket(descripcion, propina);
        }
        else if ( bloqueada == true){
            System.out.println("la tarjeta esta bloqueada");
        }
        else if (pin != _pin){
            System.out.println("el pin no es correcto");
        }
        else if (saldo < compra){
            System.out.println("saldo insuficiente");
        }
        
       
        return saldo;
    }
    
    private static void ticket(String descripcion, boolean propina){
        
        System.out.println("titular: "+nombre);
        System.out.println("nº de cuenta: **** **** **** "+nCuenta.substring(nCuenta.length()-4));
        System.out.println("descripcion: "+descripcion.substring(0, 8));
        System.out.println("importe: "+ compra);
        if (propina == true){
            System.out.println("cargos: "+ compra * 0.05);
            System.out.println("total: "+ compra * 1.05);
        }else {
            System.out.println("cargos: 00.00");
            System.out.println("total: "+ compra);
        }
        
        
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Tarjeta.nombre = nombre;
    }

    public static String getnCuenta() {
        return nCuenta;
    }

    public static void setnCuenta(String nCuenta) {
        Tarjeta.nCuenta = nCuenta;
    }

    public int getPin() {
        return pin;
    }

    public static void setPin(int pin) {
        Tarjeta.pin = pin;
    }

    public static boolean isBloqueada() {
        return bloqueada;
    }

    public static void setBloqueada(boolean bloqueada) {
        Tarjeta.bloqueada = bloqueada;
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        Tarjeta.saldo = saldo;
    }
    
    
    
    
    

    
}
