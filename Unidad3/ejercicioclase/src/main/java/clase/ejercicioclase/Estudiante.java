/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.ejercicioclase;

/**
 * //estudia modulo: usuario introduce modulo, en funcion del modulo //pregunta
 * al usuario si quiere usuariosde daw o dam
 *
 * @author dam1
 */
public class Estudiante {

    public String nombre, modulo;
    public byte edad;
    public Ciclo ciclo;

    public Estudiante(String _nombre, byte _edad, Ciclo _ciclo, String _modulo) {
        nombre = _nombre;
        edad = _edad;
        ciclo = _ciclo;
        modulo = _modulo;
    }

    public boolean esEstudianteModulo(String _modulo) {
        if (modulo.equals(_modulo)) {
            return true;
        } 
        else {
            return false;
        }
    }

    public boolean esMayor(byte _edad) {
        if (edad > _edad) {
            return true;
        } else {
            return false;
        }
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public String getNombre() {
        return nombre;
    }

}
