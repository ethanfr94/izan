/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fechas.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Letra [] l;
       Scanner t;
        System.out.println("indica la dimension del array");
       int n = new Scanner (System.in).nextInt();
       l = new Letra [n];
       for (int i = 0; i < l.length; i++){
           l [i] = new Letra();
       }
        System.out.println("letras vencidas");
       for (int i = 0; i < l.length; i++){
           if (l[i].vencida()){
               System.out.println(l[i].mostrar());
           }           
       }
        System.out.println("añadimos 15 dias a las vencidas en enero");
        for (int i = 0; i < l.length; i++){
           if (l[i].vencida()&& l[i].devuelveMes()==1){
               l[i].demora(15);
               l[i].mostrar();
           }
        }   
        
        System.out.println("tiempo hasta que venzan las que aun no han vencido");
        for (int i = 0; i < l.length; i++) {
            if (!l[i].vencida()) {
                System.out.println("Titular: " + l[i].getTitular());
                System.out.println("faltan "+l[i].faltan()+" dias para que venza esta letra.");
            }
        }
        
        System.out.println("lista de letras");
        for (int i = 0; i < l.length; i++) {
            l[i].mostrar();
        }
            
    }
}
