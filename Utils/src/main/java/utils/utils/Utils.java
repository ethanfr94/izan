/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package utils.utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Utils {
//metodos generico

    public static String introString(String msg) {
        Scanner t = new Scanner(System.in);
        String cadena = "";
        boolean valido = false;
        do {
            try {
                System.out.println(msg);
                cadena = t.nextLine();
                if (cadena.equals("")) {
                    throw new Excepcion("el campo no puede esar vacio");
                }
                valido = true;
            } catch (Excepcion e) {
                e.getMessage();
            }
        } while (!valido);
        return cadena;
    }

    public static float introFloat(String msg) {
//si en tipo introducimos un 1 el metodo solo validara numeros positivos
        Scanner t = new Scanner(System.in);
        float tamanio = 0;
        boolean valido = false;
        do {
            try {
                System.out.println(msg);
                tamanio = t.nextFloat();
                
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("introduce un numero valido");
            } 
        } while (!valido);
        return tamanio;
    }

    public static int introEntero(String msg){
        Scanner t = new Scanner(System.in); 
        int x = 0;        
            try{
                System.out.println(msg);
                x = Integer.parseInt(t.nextLine());
                return x;
            }catch(InputMismatchException e) {
                System.out.println("introduce un numero valido");
            }  
        return x;
    }
    
    /*public static int introEntero(String msg) {
        Scanner t = new Scanner(System.in);
        int x = 0;
        boolean valido = false;        
            try {
                System.out.println(msg);
                x = Integer.parseInt(t.nextLine());
                valido = true;

            } catch (InputMismatchException e) {
                System.out.println("introduce un numero valido");
            }        
        return x;
    }*/

    /*public static int introEntero(String msg, int tipo) {
//si en tipo introducimos un 1 el metodo solo validara numeros positivos
//si introducimos un 2 seran negativos
// si eliminamos el tipo valida cualquier numero entero
Scanner t = new Scanner(System.in);
int tamanio = 0;
boolean valido = false;
do {
try {
System.out.println(msg);
tamanio = Integer.parseInt(t.nextLine());
if(tamanio < 0 && tipo == 1){// con este if condicionamos a que el numero sea positivo
throw new Excepcion("el numero debe ser positivo");
}
else if(tamanio > 0 && tipo == 2){
throw new Excepcion("el numero debe ser negativo");
}
valido = true;
} catch (InputMismatchException e) {
System.out.println("introduce un numero valido");
} catch (Excepcion e) {
e.getMessage();
}
}while (!valido);
return tamanio;
}*/
    public static String introDNI() {
        String dni = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println("introduce DNI");
                dni = teclado.nextLine();
                if (dni.length() == 9) {
                    char letra = dni.charAt(8);
                    String numero = dni.substring(0, 8);
                    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
                    int num = Integer.parseInt(numero);
                    int resto = num % 23;
                    char letraEsperada = letras.charAt(resto);
                    if (numero.matches("[0-9]{8}")) {
                        if (letraEsperada == letra) {
                            correcto = true;
                        } else {
                            throw new Exception("DNI invalido. Letra incorrecta");
                        }
                    } else {
                        throw new Exception("DNI invalido. Numero incorrecto");
                    }
                } else {
                    throw new Exception("DNI invalido. longitud incorrecta");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return dni;
    }

    public static String IntroCodigo(String msg) {
        String codigo = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println(msg);
                codigo = teclado.nextLine();
                if (codigo.matches("[A-Z]{3}[0-9]{4}")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato del CODIGO incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return codigo;
    }

    public static String IntroNombre(String msg) {
        String nombre = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println(msg);
                nombre = teclado.nextLine();
                if (nombre.toLowerCase().matches("[a-z]")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato del nombre incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return nombre;
    }

    public static String IntroApellidos(String c) {
        String apellidos = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                apellidos = teclado.nextLine();
                if (apellidos.matches("[A-Za-z ]*")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato de los apellidos incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return apellidos;
    }

    public static String IntroTelefono(String c) {
        String tlf = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                tlf = teclado.nextLine();
                if (tlf.matches("[0-9]{9}")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato del telefono incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return tlf;
    }

    public static String IntroMatricula(String c) {
        String matricula = "";
        Scanner teclado = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                matricula = teclado.nextLine();
                if (matricula.matches("[0-9]{4}[A-Z]{3}")) {
                    correcto = true;
                } else {
                    throw new Exception("Formato de la matricula incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.toString());
            }
        } while (!correcto);
        return matricula;
    }

    public static LocalDate IntroFecha() {
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha = null;
        boolean correcto = false;
        do {
            try {
                System.out.println("introduce fecha");
                int dia = introEntero("Introduce el dia");
                int mes = introEntero("Introduce el mes");
                int anio = introEntero("Introduce el anio");
                fecha = LocalDate.of(anio, mes, dia);
                correcto = true;
            } catch (DateTimeException a) {
                System.out.println("Error en la introducion de la fecha");
                System.out.println(a.toString());
                teclado.next();
            }
        } while (!correcto);
        return fecha;
    }

    public static String pedirFecha() throws DateTimeParseException {
        String fecha = "";
        Scanner lee = new Scanner(System.in);
        boolean valido = false;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        do {
            try {
                System.out.println("Introduce fecha (dd-MM-yyyy): ");
                LocalDate fe = LocalDate.parse(lee.nextLine(), f);
                fecha = fe.format(f).toString();
                valido = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha no valida.");
                fecha = "x";
            }
        } while (!valido);
        return fecha;
    }

    public static int pedirPotencia() throws Excepcion {
        Scanner lee = new Scanner(System.in);
        int p = 0;
        boolean valido = false;
        do {
            try {
                System.out.println("Introduce potencia: ");
                p = Integer.parseInt(lee.next());
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un numero.");
            }

        } while (!valido);
        return p;
    }

    public static int pedirCilindrada() {
        Scanner lee = new Scanner(System.in);
        int c = 0;
        do {
            try {
                System.out.println("Introduce cilindrada: ");
                c = Integer.parseInt(lee.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No has introducido un numero.");
            }

        } while (c != 50 && c != 125 && c != 150 && c != 450);
        return c;
    }

    public static String mostrarDatos(LinkedHashMap<String, String> mapa) {
        String resultado = "";
        resultado += mapa.toString() + "\n";
        return resultado;
    }

    public static boolean validarMatricula(String matricula) throws Excepcion {
        return matricula.toUpperCase().matches("\\d\\d\\d\\d\\s[^A,^E,^I,^O,^U,^Ñ,^[0-9]][^A,^E,^I,^O,^U,^Ñ,^[0-9]][^A,^E,^I,^O,^U,^Ñ,^[0-9]]");

    }

}

class Excepcion extends Exception {

    public Excepcion(String msg) {
        super(msg);
    }
}
