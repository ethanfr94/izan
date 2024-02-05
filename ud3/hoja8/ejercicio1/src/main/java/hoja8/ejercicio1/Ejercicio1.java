/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio1;

import java.util.Scanner;

/**
 *El Dr Black&White es un poco excéntrico, solo usa calcetines de color negro y de color blanco y
continuamente pierde calcetines dejando a otros desparejados. Implementa un programa que
lea desde teclado una sucesión de letras ‘B’ o ‘W’ para indicar el color (negro o blanco). Un punto
(.) marca el final de la entrada de datos. El programa debe mostrar un mensaje indicando si
todos los calcetines tienen su pareja o si queda sin pareja algún calcetín. Escribe EMPAREJADOS
si todos los calcetines tienen su pareja, NEGRO SOLITARIO o BLANCO SOLITARIO si queda sin
pareja uno del color correspondiente o PAREJA MIXTA si sobra uno de cada color.
Posibilidades:
• Si meto W B W B . La salida sería EMPAREJADOS.
• Si meto W B B . La salida sería BLANCO SOLITARIO.
• Si meto B W . La salida sería PAREJA MIXTA.
• Si meto W W W B B . La salida sería BLANCO SOLITARIO.
 * @author DAM122
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        int w=0, b=0;
        char c;
        Scanner t = new Scanner (System.in);
        
        do {
            System.out.println("introduce color del calcetin (W/B), . para salir");
            c = t.next().charAt(0);
            if (c != 'w' && c != 'b' && c != '.' ){
                System.out.println("el color introducido no es valido");
            }
            else if (c == 'w'){
                w++;
            }
            else if (c == 'b'){
                b++;
            }
            
        }while (c != '.');
        
        if (w % 2 == 0 && b % 2 == 0 && w != 0 && b != 0){
            System.out.println("emparejados");            
        }
        else if(w % 2 == 0 && b % 2 != 0){
            System.out.println("negro solitario");
        }
        else if(w % 2 != 0 && b % 2 == 0){
            System.out.println("blanco solitario");
        }
        else if(w % 2 != 0 && b % 2 != 0){
            System.out.println("pareja mixta");
        }
        
        
        
        
    }
}
