/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package recuperaciones.ejercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Tec {

    public static String IntroTitulo() {
        String nombre = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println("introduce titulo");
                nombre = teclado.nextLine();
                if (nombre.matches("[A-Za-z0-9. ]*")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return nombre;
    }

    public static String IntroAutor() {
        String nombre = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println("introduce autor");
                nombre = teclado.nextLine();
                if (nombre.matches("[A-Za-z0-9. ]*")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return nombre;
    }

    public static String IntroCod() {
        String nombre = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println("Introduce codigo de libro");
                nombre = teclado.nextLine();
                if (nombre.matches("[0-9. ]{13}")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return nombre;
    }

    public static int IntroEntero() {
        Scanner t = new Scanner(System.in);
        int num = 0;
        boolean correcto = false;
        do {
            try {
                System.out.println("introduce numero de copias");
                num = Integer.parseInt(t.nextLine());
                correcto = true;
            } catch (InputMismatchException a) {
                System.out.println("Error en la introducion del numero entero");
                System.out.println("Error " + a.toString());
                t.next();
            }
        } while (!correcto);
        return num;
    }
    
    public static int IntroInt(String c) {
        Scanner t = new Scanner(System.in);
        int num = 0;
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                num = Integer.parseInt(t.nextLine());
                correcto = true;
            } catch (InputMismatchException a) {
                System.out.println("Error en la introducion del numero entero");
                System.out.println("Error " + a.toString());
                t.next();
            }
        } while (!correcto);
        return num;
    }

    public static LocalDate IntroFecha() {
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha = null;
        boolean correcto = false;
        do {
            try {
                System.out.println("fecha");
                int dia = IntroInt("Introduce el dia");
                int mes = IntroInt("Introduce el mes");
                int anio = IntroInt("Introduce el anio");
                fecha = LocalDate.of(anio, mes, dia);
                if (fecha.isAfter(LocalDate.now()) || fecha.isEqual(LocalDate.now())) {
                    correcto = true;
                } else {
                    throw new DateTimeException("Fecha anterior a la actual");
                }
            } catch (DateTimeException a) {
                System.out.println("Error en la introducion de la fecha");
                System.out.println("Error " + a.toString());
                teclado.next();
            }
        } while (!correcto);
        return fecha;
    }

}
