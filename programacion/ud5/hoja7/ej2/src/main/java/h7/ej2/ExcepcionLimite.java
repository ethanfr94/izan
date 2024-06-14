/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h7.ej2;

/**
 *
 * @author DAM122
 */
public class ExcepcionLimite extends Exception {
     @Override
    public String toString() {
    return "Fuera limites "+super.toString();
    }
    //sobreescribimos los mensajes que nos lanza la excepcion
    @Override
    public String getMessage() {
    return "Fuera limites "+super.getMessage();
    }
}
