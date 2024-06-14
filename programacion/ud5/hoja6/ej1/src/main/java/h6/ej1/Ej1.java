/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h6.ej1;

/**
 *
 * @author usuario
 */
public class Ej1 {

    public static void main(String[] args) {
        DeDos a = new DeDos();
        
        for (int i = 0; i < 5; i++) {
            System.out.print(a.getValor()+" ");
            a.getsiguiente();
        }System.out.println("");
        
        System.out.println("reiniciamos la serie");
        a.reiniciar();
        
        for (int i = 0; i < 5; i++) {
            System.out.print(a.getValor()+" ");
            a.getsiguiente();
        }System.out.println("");
        
        System.out.println("iniciamos desde 100");
        a.setComenzar(100);
        for (int i = 0; i < 5; i++) {
            System.out.print(a.getValor()+" ");
            a.getsiguiente();
        }System.out.println("");
        
    }
}
