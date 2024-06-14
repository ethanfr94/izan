/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h1.ej2;

import utils.utils.Utils;

/**
 *
 * @author usuario
 */
public class Ej2 {

    public static void main(String[] args) {
       Academia ac = new Academia();
       ac.aniadirAlFinal();
       ac.aniadir(0);
       ac.aniadir(0);
       ac.mostrarCursos();
       ac.borrar(Utils.introString("introduce codigo del curso a borrar"));
       ac.mostrarCursos();
       ac.modificarHoras(Utils.introString("introduce codigo del curso a modificar"));
       ac.mostrarCursos();
    }
}
