/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja7.ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int [] mejores;
        Alumno a1 = new Alumno("izan");
        System.out.println("la nota mas alta es un "+a1.mayor());
        System.out.println("la nota mas baja es un "+a1.menor());
        System.out.println("el 5 esta en la posicion "+a1.buscar(5));
        System.out.println("las tres mejores notas son ");
        mejores = a1.tresMejores();
        for (int i = 0; i < mejores.length; i++) {
            if (i==0) {
                System.out.print(mejores[i]);
            } else {
                System.out.print(" / " + mejores[i]);
            }
        }System.out.println("");
        a1.ponerACero();
        a1.getNotas();
    }
}
