/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Est {

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
            } catch(NumberFormatException n){
                System.out.println(n.toString());
            }
        } while (!correcto);
        return num;
    }

    public static String introCadena(String c) {
        String cdn = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                cdn = teclado.nextLine();
                if (cdn.matches("[A-Za-z0-9. ]*")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return cdn;
    }

    public static int pedirPotencia() throws Exception {
        int p = 0;
        do {
            try {
                p = introEntero("Introduce potencia: ");
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un numero.");
            }
        } while (p < 60 || p > 1200);
        return p;
    }

    public static int pedirCilindrada() {
        int c = 0;
        do {
            try {
                c = introEntero("Introduce cilindrada: ");
            } catch (NumberFormatException e) {
                System.out.println("No has introducido un numero.");
            }
        } while (c != 50 && c != 125 && c != 150 && c != 450);
        return c;
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
                    throw new DateTimeException("Fecha no valida");
                }
            } catch (DateTimeException a) {
                System.out.println("Error en la introducion de la fecha");
                System.out.println("Error " + a.toString());
                teclado.next();
            }
        } while (!correcto);
        return fecha;
    }

    public static boolean validarMatricula(String matricula) throws Exception {
        return matricula.toUpperCase().matches(/*"[0-9]{4}[ ][BCDFGHJKLMNPQRSTVWXYZ]{3}*/"\\d\\d\\d\\d\\s[^A,^E,^I,^O,^U,^Ñ,^[0-9]][^A,^E,^I,^O,^U,^Ñ,^[0-9]][^A,^E,^I,^O,^U,^Ñ,^[0-9]]");
    }

    public static String mostrarDatos(LinkedHashMap<String, String> mapa) {
        String cdn = "";
        for (Map.Entry<String , String> lista : mapa.entrySet()) {
            cdn += lista.getKey()+" "+lista.getValue()+"\n";
        }
        return cdn;
    }

}
