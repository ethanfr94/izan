/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Prestamo implements Identificable {

    private Libro libro;
    private Usuario user;
    private LocalDate prest;
    private LocalDate dev;

    public Prestamo(Libro libro, Usuario user, LocalDate prest) {
        this.libro = libro;
        this.user = user;
        this.prest = prest;
        this.dev = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public LocalDate getPrest() {
        return prest;
    }

    public void setPrest(LocalDate prest) {
        this.prest = prest;
    }

    public LocalDate getDev() {
        return dev;
    }

    public void setDev(LocalDate dev) {
        this.dev = dev;
    }

    @Override
    public String imprime() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yyyy").withLocale(Locale.of("es", "ES"));
        String fDev = "";
        String cdn;
        if (dev != null) {
            fDev = dev.format(f);
            cdn = "Prestamo- Libro: " + libro.getTitulo() + " / Usuario: " + user.imprime() + " / Fecha de prestamo: " + prest.format(f) + " / Fecha de devolucion: " + fDev + "\n";
        } else {
            cdn = "Prestamo- Libro: " + libro.getTitulo() + " / Usuario: " + user.imprime() + " / Fecha de prestamo: " + prest.format(f) + "\n";
        }
        return cdn;
    }

}
