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

    public static int introEntero(String c) {
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
            }catch (NumberFormatException ne) {
                System.out.println("Error");
                System.out.println(ne.toString());
            }
        } while (!correcto);
        return num;
    }

    public static LocalDate introFecha(String c) {
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha = null;
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                int dia = introEntero("Introduce el dia");
                int mes = introEntero("Introduce el mes");
                int anio = introEntero("Introduce el anio");
                fecha = LocalDate.of(anio, mes, dia);
                if (fecha.isBefore(LocalDate.now()) || fecha.isEqual(LocalDate.now())) {
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

    public static String introNombre(String msg) {
        String nombre = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println(msg);
                nombre = teclado.nextLine();
                nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
                if (nombre.toLowerCase().matches("[a-z A-Z  ]*")) {
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

    public static float introFloat(String c) {
        Scanner t = new Scanner(System.in);
        float num = 0.0f;
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                num = Float.parseFloat(t.nextLine());
                correcto = true;
            } catch (InputMismatchException a) {
                System.out.println("Error en la introducion del numero decimal");
                System.out.println("Error " + a.toString());
                t.next();
            } catch (NumberFormatException ne) {
                System.out.println("Error");
                System.out.println(ne.toString());
            }
        } while (!correcto);
        return num;
    }
}
