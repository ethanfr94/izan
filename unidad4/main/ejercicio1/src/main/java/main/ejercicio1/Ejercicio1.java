/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ejercicio1;

import static java.lang.Integer.parseInt;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
if (args.length>0 && args.length<4) {
            int digitos = args[0].length();//convertimos la longitud del valor del argumento en un valor
            int numero = parseInt(args[0]);//convertimos el string del argumento en un valor int
            int resultado = 0;
            for (int i = 0; i < digitos; i++) {
                //sumamos cada digito del valor elevando cada uno a la cantidad de digitos
                resultado += (int) Math.pow(parseInt(args[0].substring(i, i+1)), digitos);}
            if (resultado == numero) {System.out.println(numero+" es un numero Armstrong");} 
            else {System.out.println(numero+"No es un numero Armstrong");}}
            else {System.out.println("datos no validos");}}
}
