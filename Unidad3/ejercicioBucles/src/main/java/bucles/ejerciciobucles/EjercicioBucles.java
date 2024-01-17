/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles.ejerciciobucles;

/**
 *
 * @author dam1
 */
public class EjercicioBucles {

    public static void main(String[] args) {
        
        boolean salir = false;
        /* En este caso el centinela es una variable booleana que
inicialmente vale falso */
        
        int n, contador = 1;//variable contador para crear el limite de 5 bucles
        
            while (salir == false && contador <= 5) { // Condición de repetición: que salir siga siendo falso ese es el centinela.
                //También se podía haber escrito simplemente: while(!salir)--- contador<05 limite de 5 bucles luego para

                n = (int) Math.floor(Math.random()*499 )+ 1; // Lo que se repite en el bucle: math.floor trunca y al resultado le quita los decimalespero no redondea

                System.out.println(n); // calcular un número aletorio de 1 a 500 y escribirlo

                salir = (n % 7 == 0); //El centinela vale verdadero si el número es múltiplo de 7
                contador++;//contador para llevar la cuenta de bucles y parar si se llega a los 5
            }
    }
}
