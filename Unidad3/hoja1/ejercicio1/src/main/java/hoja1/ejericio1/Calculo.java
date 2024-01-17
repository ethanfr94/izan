/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejericio1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Calculo {

    Scanner t1, t2, t3;

    public void m1() {
        t1 = new Scanner(System.in);
        int x = t1.nextInt();
        if (x > 100 && x < 1000) {
            System.out.println("el valor de x esta comprendido entre 100 y 1000");
        } else {
            System.out.println("el valor de x no esta comprendido entre 100 y 1000");
        }
    }

    public void m2() {
        t1 = new Scanner(System.in);
        int x = t1.nextInt();
        if (x < 0) {
            System.out.println("el numero es positivo");
        } else if (x > 0) {
            System.out.println("el numero es negativo");
        } else if (x == 0) {
            System.out.println("el numero es nulo");
        }
    }

    public void m3() {
        t1 = new Scanner(System.in);
        int x = t1.nextInt();
        if ((x % 2 == 0) && (x % 5 == 0)) {
            System.out.println("el numero es divisible entre 2 y entre 5");
        } else {
            System.out.println("el numero no es divisible entre 2 y entre 5");
        }
    }

    public void m4() {
        t1 = new Scanner(System.in);
        int x = t1.nextInt();
        if (x % 1 == 0)/*x=(int)x*/ {
            System.out.println("el numero no tiene parte fraccionaria");
        } else {
            System.out.println("el numero tiene parte fraccionaria");
        }
    }

    public void m5() {
        t1 = new Scanner(System.in);
        int x = t1.nextInt();
        if (x % 4 == 0 || (x % 100 == 0 && x % 400 != 0)) {
            System.out.println("el año es bisiesto");
        } else {
            System.out.println("el año no es bisiesto");
        }
    }

    public void m6() {
        t1 = new Scanner(System.in);
        int x = t1.nextInt();
        if (x%2==0) {
            System.out.println("el numero es par");
        } 
        else {
            System.out.println("el numero es impar");
        }
    }
    
     public void m7() {
        t1 = new Scanner(System.in);
        int x = t1.nextInt();
        if ((x%2==0)&&(x>=1&&x<=10)) {
            System.out.println("el numero es par");
        } 
        else if ((x%2!=0)&&(x>=1&&x<10)){
            System.out.println("el numero es impar");
        }
     }
        
       public void m8() {
        t1 = new Scanner(System.in);
         t2 = new Scanner(System.in);
          t3 = new Scanner(System.in);
        int x = t1.nextInt();
        int y = t2.nextInt();
        int z = t3.nextInt();
        if ((x<y)&&(x<z)) {
            if (y<z){
            System.out.println("el maximo es "+z+" y el minimo es "+x);                
            }
            else{
                    System.out.println("el maximo es "+y+" y el minimo es "+x);
                    }        
       }
        else if ((y<x)&&(y<z)) {
             if (x<z){
            System.out.println("el maximo es "+z+" y el minimo es "+y);                
            }
            else{
                    System.out.println("el maximo es "+x+" y el minimo es "+y);
                    }
       }
        
        else if ((z<x)&&(z<y)) {
             if (x<y){
            System.out.println("el maximo es "+y+" y el minimo es "+z);                
            }
            else{
                    System.out.println("el maximo es "+x+" y el minimo es "+z);
                    }
       }
       }
       
          public void m9() {
        t1 = new Scanner(System.in);
        t2 = new Scanner(System.in);
        int x = t1.nextInt();
        int y= t2.nextInt();
        if (x%y==0) {
            System.out.println(+y+" es divisor de "+x);
        } 
        else if (y%x==0){
            System.out.println(+x+" es divisor de "+y);
        }
        else if ((x%y!=0)&&(y%x!=0)){
            System.out.println("ningun numero es divisor del otro");
        }
     }
        
      
        
    }


