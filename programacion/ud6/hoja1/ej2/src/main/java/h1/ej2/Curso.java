/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h1.ej2;

import utils.utils.Utils;

/**
 *
 * @author usuario
 */
public class Curso {
    private String codigo, descripcion, nHoras;

    public Curso(String codigo, String descripcion, String nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
    }
    
    public Curso() {
        this.codigo = Utils.introString("introduce codigo del curso");
        this.descripcion = Utils.introString("introduce descripcion del curso");
        this.nHoras = Utils.introString("introduce horas del curso");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getnHoras() {
        return nHoras;
    }

    public void setnHoras(String nHoras) {
        this.nHoras = nHoras;
    }
    
    
    
}
