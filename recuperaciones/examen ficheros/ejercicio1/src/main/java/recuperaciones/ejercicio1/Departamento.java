/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package recuperaciones.ejercicio1;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Objects;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Departamento implements Identificable, Serializable {

    String _id, _codigo, _nombre;

    public Departamento(String _id, String _codigo, String _nombre) {
        this._id = _id;
        this._codigo = _codigo;
        this._nombre = _nombre;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getCodigo() {
        return _codigo;
    }

    public void setCodigo(String _codigo) {
        this._codigo = _codigo;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    @Override
    public LinkedHashMap<String, String> datosObjeto() {
        LinkedHashMap<String, String> departamento = new LinkedHashMap<>();
        departamento.put("ID: ", this.getId());
        departamento.put("CODIGO: ", this.getCodigo());
        departamento.put("NOMBRE: ", this.getNombre());        
        return departamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this._id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Departamento other = (Departamento) obj;
        return Objects.equals(this._id, other._id);
    }

    
    

}
