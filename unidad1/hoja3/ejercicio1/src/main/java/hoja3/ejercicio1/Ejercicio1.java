/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        //valores de las variables solicitados por teclado
        float totaliva;
        float total;
       
        System.out.println("introduce la base imponible ");
        float bi=teclado.nextFloat();//base imponible por teclado
        
        System.out.println("introduce el IVA ");
        byte iva=teclado.nextByte();//IVA aplicado pedido por teclado
        
        // calculo de resultados
        
        total=(float) (((iva*0.01)+1)*bi);
        totaliva=(float) (total*(iva*0.01));
       
        System.out.println("el importe total es: "+total);
        System.out.println("el importe correspondiente al IVA es: "+totaliva);
        
    }
}
