/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h9.ej4;

/**
 *
 * @author DAM122
 */
public class Ej4 {

    public static void main(String[] args) {
        try {
            throw new MiExcepcion("FUERA DE LIMITES");
        }
        catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }
        
        try {
            throw new MiExcepcion("otro error");
        }
        catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }
    }
}
