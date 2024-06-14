/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.io.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Funciones {

    public static ArrayList<Departamento> leerDepartamentos(File f) {
        ArrayList<Departamento> lista = new ArrayList<>();
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                while (st.hasMoreTokens()) {
                    String id = st.nextToken();
                    String cod = st.nextToken();
                    String nombre = st.nextToken();
                    Departamento dep = new Departamento(id, cod, nombre);
                    lista.add(dep);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public static ArrayList<Profesor> leerProfesores(File f, File d) {
        ArrayList<Profesor> lista = new ArrayList<>();
        ArrayList<Departamento> depts = new ArrayList<>();
        depts = leerDepartamentos(d);
        String linea;
        Departamento dep = null;
        Profesor p = null;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                while (st.hasMoreTokens()) {
                    String apellido = st.nextToken();
                    String nombre = st.nextToken();
                    String dni = st.nextToken();
                    String email = st.nextToken();
                    String id = st.nextToken();
                    for (Departamento dept : depts) {
                        if (dept.getId().equals(id)) {
                            dep = dept;
                            p = new Profesor(apellido, nombre, dni, email, dep);
                            lista.add(p);
                        }
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public static void listarProfesores(ArrayList<Profesor> profesor) {
        int num = 0;
        for (Profesor a : profesor) {
            System.out.println(a.datosObjeto());
            num++;
        }
        System.out.println("\nHay " + num + " profesores\n");
    }

    public static int guardarProfDep(ArrayList<Profesor> profesor, String cod) {
        int num = 0;
        File f = new File("ProfesoresDEP.dat");

        for (Profesor a : profesor) {
            if (a.getDept().getCodigo().equalsIgnoreCase(cod)) {
                if (f.exists()) {
                    try (Mos gs = new Mos(new FileOutputStream(f, true));) {
                        gs.writeObject(a);
                        num++;
                    } catch (IOException e) {
                        System.out.println("No se puede abrir el fichero");
                    }
                } else {
                    try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f));) {
                        os.writeObject(a);
                        num++;

                    } catch (IOException e) {
                        System.out.println("No se ha podido abrir el fichero");
                    }
                }
            }
        }
        return num;
    }

    public static void leerProfDep() {
        File f = new File("ProfesoresDEP.dat");
        String linea = "";
        try (ObjectInputStream lec = new ObjectInputStream(new FileInputStream(f))) {
            while (true) {
                Profesor p = (Profesor) lec.readObject();
                linea = Tec.modoFicha(p.datosObjeto());
                System.out.println(linea);
            }
            
        } catch (EOFException eof) {
            System.out.println("======Fin del fichero ======");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    public static void grabarProfesores(ArrayList<Profesor> profesor) {
        int num = 0;
        File f = new File("profesores.txt");
        for (Profesor s : profesor) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));) {
                String line = s.getDni() + " " + s.getApellidos() + " " + s.getNombre() + " " + s.getDept().getNombre();
                bw.write(line);
                bw.newLine();
                num++;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("se han añadido " + num + " profesor/es");
    }

    public static void guardaDepartamentos(ArrayList<Profesor> profesor) {
        HashSet<Departamento> dep = new HashSet<>();
        for (Profesor s : profesor) {
            Departamento d = s.getDept();
            dep.add(d);
        }
        File f = new File("departamentos.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f));) {
            for (Departamento d : dep) {
                bw.write(d.getNombre());
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("hay " + dep.size() + " departamento/s");
    }

    public static void insertarProfesor(Profesor o, File f) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));) {
            bw.write(o.getApellidos() + "," + o.getNombre() + "," + o.getDni() + "," + o.getEmail() + "," + o.getDept().getId());
            bw.newLine();
            System.out.println("Profesor añadido correctamente al archivo");
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("No se puede abrir el fichero");
        }
    }

}
