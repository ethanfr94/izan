/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package recuperaciones.ejercicio1;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        File p = new File(args[0]);
        File d = new File(args[1]);

        ArrayList<Profesor> profes = null;
        ArrayList<Departamento> dep = null;

        if (args.length!=2) {
            System.out.println("error. parametros no recibidos");
        } else if (p != null && d != null) {
            if (!p.exists() || !d.exists()) {
                profes = new ArrayList<>();
            } else {
                if (d.getName().equals(args[1])) {
                    dep = Funciones.leerDepartamentos(d);
                }
                if (p.getName().equals(args[0])) {
                    profes = Funciones.leerProfesores(p, d);
                }
                for (Departamento l : dep) {

                }
                int op = -1;
                do {
                    op = Tec.introEntero("1.listar profesores\n2.guardar profesores segun departamento\n3.leer profesoresDep.dat\n4.grabar profesores\n5.grabar departamentos\n6.insertar profesor en csv\n0.salir");

                    switch (op) {
                        case 1 -> {
                            Funciones.listarProfesores(profes);
                        }
                        case 2 -> {
                            System.out.println("se han guardado " + Funciones.guardarProfDep(profes, "INF") + " profesores");
                            
                        }
                        case 3 -> {
                            Funciones.leerProfDep();
                        }
                        case 4 -> {
                            Funciones.grabarProfesores(profes);
                        }
                        case 5 -> {//
                            Funciones.guardaDepartamentos(profes);
                        }
                        case 6 -> {
                            Profesor o = new Profesor("perez", "pepe", "72153424D", "pepe@perez.com", dep.get(0));
                            Funciones.insertarProfesor(o,p);
                        }
                        case 0 -> {
                            System.out.println("saliendo del programa");
                        }
                        default -> {
                            System.out.println("inserta una opcion valida");
                        }
                    }

                } while (op != 0);
            }
        }
    }
}
