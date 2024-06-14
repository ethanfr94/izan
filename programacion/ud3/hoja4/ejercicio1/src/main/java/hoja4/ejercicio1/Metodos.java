/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodos {

    public static void m1() {
        int n;
        Scanner t = new Scanner(System.in);
        System.out.println("introduce un numero");
        n = t.nextInt();
        for (int d = n-1; d > 0; d--) {
            if (n % d == 0) {
                System.out.println(d);
            }
        }
    }

    public static void m2() {
        int n1, n2, suma=0;
        Scanner t = new Scanner(System.in);
        System.out.println("introduce dos numeros");
        n1 = t.nextInt();
        n2 = t.nextInt();
        for (int n = n1; n >= n2; n--) {
            if (n % 2 != 0) {
                System.out.println(n);
                suma+=n;
            }
        }    
        for (int n = n1; n <= n2; n++) {
            if (n % 2 != 0) {
                System.out.println(n);
                suma+=n;
                System.out.println("la suma total es: "+suma);
            }
        }
    }
    
    public static void m3() {
        int n;
        Scanner t = new Scanner(System.in);
        System.out.println("introduce un numero");
        n = t.nextInt();
        if (n>0&&n%n==0){
            for (int x=1; x<=10;x++){
                System.out.println(n+" x "+x+" = "+n*x);
            }
        }
        else {
            System.out.println("el numero no es valido, por favor, introduzca un numero entero positivo");
        }
    }
    
    public static void m4() {
        int n1, n2;
        Scanner t = new Scanner(System.in);
        System.out.println("introduce dos numeros");
        n1 = t.nextInt();
        n2 = t.nextInt();
        if (n1<n2){
            int aux = n2;
            n2=n1;
            n1=aux;
        }
        int cociente =0, resto =n1;
        while (resto>=n2){
            resto-= n2;
            cociente++;
        }
        System.out.println("la division entre "+n1+" y "+n2+" es igual a "+cociente+" con un resto de "+resto);
    }
    
}
