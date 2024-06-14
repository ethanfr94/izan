/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package recuperaciones.ejercicio1;

import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Profesor implements Identificable, Serializable {

    private String apellidos, nombre, dni, email;
    private Departamento _dept;

    public Profesor(String apellidos, String nombre, String dni, String email, Departamento dept) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this._dept = dept;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departamento getDept() {
        return _dept;
    }

    public void setDept(Departamento dept) {
        this._dept = dept;
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> profesor = new LinkedHashMap<>();        
        profesor.put("Nombre: ", this.getNombre());
        profesor.put("Apellido: ", this.getApellidos());
        profesor.put("DNI: ", this.getDni());
        profesor.put("EMAIL: ", this.getEmail());
        profesor.putAll(this.getDept().datosObjeto());
        return profesor;
    }

    
}
