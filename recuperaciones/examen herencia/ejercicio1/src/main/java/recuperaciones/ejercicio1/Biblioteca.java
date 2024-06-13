/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Biblioteca implements Identificable {

    private String nombre;
    private Libro[] libros;
    private int nLibros;
    private Usuario[] usuarios;
    private Prestamo[] prestamos;

    public Biblioteca(String nombre, int max) {
        this.nombre = nombre;
        this.libros = new Libro[max];
        this.usuarios = new Usuario[max];
        this.prestamos = new Prestamo[max];
        nLibros = 0;
    }

    public boolean insertaLibro(Libro l) {
        boolean exito = false;
        if (nLibros < libros.length) {
            libros[nLibros] = l;
            nLibros++;
            exito = true;
        }
        return exito;
    }

    public void insertaUsuario(Usuario u) {
        boolean exito = false;
        for (int i = 0; i < usuarios.length && !exito; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = u;
                exito = true;
            }
        }
        if (exito) {
            System.out.println("usuario insertado correctamente");
        } else {
            System.out.println("error al insertar usuario");
        }
    }

    public void insertaPrestamo(Prestamo p) {
        boolean exito = false;
        for (int i = 0; i < prestamos.length && !exito; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = p;
                exito = true;
            }
        }
        if (exito) {
            System.out.println("prestamo registrado correctamente");
        } else {
            System.out.println("error al registrar prestamo");
        }
    }

    public boolean buscaUsuario(Usuario u) {
        boolean encontrado = false;
        for (int i = 0; i < usuarios.length && usuarios[i] != null && !encontrado; i++) {
            if (usuarios[i].equals(u)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public boolean buscaLibro(Libro l) {
        boolean encontrado = false;
        for (int i = 0; i < nLibros && !encontrado; i++) {
            if (libros[i].equals(l)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void prestaLibro(Libro l, Usuario u) {
        boolean disponible = true;
        if (buscaLibro(l)) {
            if (buscaUsuario(u)) {
                for (int i = 0; i < prestamos.length && prestamos[i] != null; i++) {
                    if (prestamos[i].getLibro().equals(l) && prestamos[i].getDev() == null) {
                        disponible = false;
                    }
                }
                if (disponible) {
                    Prestamo p = new Prestamo(l, u, LocalDate.now());
                    System.out.print(l.getTitulo() + " ");
                    insertaPrestamo(p);
                } else {
                    System.out.println(l.getTitulo() + " no disponible");
                }
            } else {
                System.out.println("usuario no encontrado");
            }
        } else {
            System.out.println(l.getTitulo() + " no esta en la biblioteca");
        }

    }

    public void devuelveLibro(Libro l, Usuario u) {
        boolean devuelto = false;
        for (int i = 0; i < prestamos.length && !devuelto; i++) {
            if (prestamos[i] != null && prestamos[i].getLibro().equals(l) && prestamos[i].getDev() == null && prestamos[i].getUser().equals(u)) {
                LocalDate fd = Tec.introFecha("introduce fecha de devolucion");
                if (fd.isAfter(prestamos[i].getPrest())) {
                    prestamos[i].setDev(fd);
                    devuelto = true;
                }
            }
        }
        if (devuelto) {
            System.out.println(l.getTitulo() + " devuelto correctamente");
        } else {
            System.out.println(l.getTitulo() + " no se habia prestado");
        }
    }

    public void eliminarLibro(Libro l) {
        boolean encontrado = false;
        for (int i = 0; i < nLibros && !encontrado; i++) {
            if (libros[i].equals(l)) {
                encontrado = true;
                for (int j = i; j < nLibros - 1; j++) {
                    libros[j] = libros[j + 1];
                }
                libros[nLibros] = null;
                nLibros--;
                System.out.println(l.getTitulo() + " eliminado correctamente de la biblioteca");
            }
        }
        if (!encontrado) {
            System.out.println(l.getTitulo() + " no esta en la biblioteca");
        }

    }

    public void ordenarLibros() {
        Arrays.sort(libros, 0, nLibros);
    }

    public void listarElectronicos(float tam) {
        int cnt = 0;
        for (int i = 0; i < nLibros; i++) {
            if (libros[i] instanceof LibroElectronico) {
                LibroElectronico l = (LibroElectronico) libros[i];
                if (l.getMb() > tam) {
                    cnt++;
                }
            }
        }
        LibroElectronico[] eb = new LibroElectronico[cnt];
        int list = 0;
        for (int i = 0; i < nLibros; i++) {
            if (libros[i] instanceof LibroElectronico) {
                LibroElectronico l = (LibroElectronico) libros[i];
                if (l.getMb() > tam) {
                    eb[list] = l;
                    list++;
                }
            }
        }
        Arrays.sort(eb);
        for (int i = 0; i < eb.length && eb[i] != null; i++) {
            System.out.println(eb[i].imprime());
        }
    }

    @Override
    public String imprime() {
        //ordenarLibros();
        String ret = "---Biblioteca " + this.nombre + "---\n\n\tLibros\n";
        for (int i = 0; i < nLibros; i++) {          
                ret += libros[i].imprime();            
        }
        ret += "\n\tUsuarios\n";
        for (int i = 0; i < usuarios.length && usuarios[i] != null; i++) {
            ret += usuarios[i].imprime();
        }
        ret += "\n\tPrestamos\n";
        for (int i = 0; i < prestamos.length && prestamos[i] != null; i++) {
            ret += prestamos[i].imprime();
        }
        return ret;
    }

}
