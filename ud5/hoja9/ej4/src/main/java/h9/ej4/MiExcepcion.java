/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h9.ej4;

/**
 *
 * @author DAM122
 */
public class MiExcepcion extends Exception {

    public MiExcepcion(String mensaje) {
        super(mensaje);
    }

    @Override
    public String getMessage() {
        return "ERROR PERSONALIZADO: " + super.getMessage();
    }
    
    
    
    
}
