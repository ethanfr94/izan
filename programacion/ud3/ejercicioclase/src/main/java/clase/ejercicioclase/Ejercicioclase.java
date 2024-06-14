/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clase.ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicioclase {

    public static void main(String[] args) {
        Estudiante a1=new Estudiante("link", (byte)35, Ciclo.DAM, "programacion");
        Estudiante a2=new Estudiante("ethan", (byte)29, Ciclo.DAM, "sistemas informaticos");
        Estudiante a3=new Estudiante("salah", (byte)21, Ciclo.DAM, "fol");
        Estudiante a4=new Estudiante("adrian", (byte)24, Ciclo.DAM, "bases de datos");
        Estudiante a5=new Estudiante("carmen", (byte)28, Ciclo.DAW, "entornos de desarrollo");
        Estudiante a6=new Estudiante("santi", (byte)37, Ciclo.DAM, "lenguaje de marcas");

        Scanner t =new Scanner(System.in);
        
            System.out.println("recuperar informacion de estudiantes");
            System.out.printf("introduce una opcion: \n\t1. estudiantes mayores que la edad introducida\n\t2.estudiantes pertenecientes al modulo introducido\n\t3.estudiantes pertenecientes al ciclo introducido\n\t");
            byte opcion=t.nextByte();
            switch (opcion){
                case 1->{
                    System.out.println("introduce una edad para comparar");
                    byte edad=t.nextByte();
                    if (a1.esMayor(edad)){
                        System.out.println(a1.nombre);
                    }  
                    if (a2.esMayor(edad)){
                        System.out.println(a2.nombre);
                    }  
                    if (a3.esMayor(edad)){
                        System.out.println(a3.nombre);
                    }  
                    if (a4.esMayor(edad)){
                        System.out.println(a4.nombre);
                    }  
                    if (a5.esMayor(edad)){
                        System.out.println(a5.nombre);
                    }  
                    if (a6.esMayor(edad)){
                        System.out.println(a6.nombre);
                    }
                   
                }
                case 2->{
                   Scanner t2=new Scanner(System.in);
                   System.out.println("introduce un modulo para comparar");
                    String modulos=t2.nextLine();
                    if (a1.esEstudianteModulo(modulos)){
                        System.out.println(a1.nombre);
                    }  
                    if (a2.esEstudianteModulo(modulos)){
                        System.out.println(a2.nombre);
                    }  
                    if (a3.esEstudianteModulo(modulos)){
                        System.out.println(a3.nombre);
                    }  
                    if (a4.esEstudianteModulo(modulos)){
                        System.out.println(a4.nombre);
                    }  
                    if (a5.esEstudianteModulo(modulos)){
                        System.out.println(a5.nombre);
                    }  
                    if (a6.esEstudianteModulo(modulos)){
                        System.out.println(a6.nombre);
                    }
                }
                case 3->{
                    Scanner t3=new Scanner(System.in);
                   System.out.println("introduce un ciclo para comparar");
                    String ciclo=t3.nextLine();
                    if (a1.getCiclo().equals(Ciclo.valueOf(ciclo.toUpperCase()))){
                        System.out.println(a1.nombre);
                    }  
                    if (a2.getCiclo().equals(Ciclo.valueOf(ciclo.toUpperCase()))){
                        System.out.println(a2.nombre);
                    }  
                    if (a3.getCiclo().equals(Ciclo.valueOf(ciclo.toUpperCase()))){
                        System.out.println(a3.nombre);
                    }  
                    if (a4.getCiclo().equals(Ciclo.valueOf(ciclo.toUpperCase()))){
                        System.out.println(a4.nombre);
                    }  
                    if (a5.getCiclo().equals(Ciclo.valueOf(ciclo.toUpperCase()))){
                        System.out.println(a5.nombre);
                    }  
                    if (a6.getCiclo().equals(Ciclo.valueOf(ciclo.toUpperCase()))){
                        System.out.println(a6.nombre);
                    }
                }
            
            }
            
    }
}
