/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;



/**
 *
 * @author Izan Franco Anduaga
 */
public class Usuario implements Identificable {

    private String nombre;
    private String apellido;

    public Usuario() {
        nombre = Tec.introNombre("introduce nombre");
        apellido = Tec.introNombre("introduce apellido");
    }

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String imprime() {
        return "Usuario: "+nombre+" "+apellido+"\n";
    }

}
