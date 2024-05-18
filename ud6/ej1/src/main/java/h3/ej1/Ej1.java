/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h3.ej1;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Ej1 {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("001", "izan", "franco", "645191237", 155.00);
        Cliente c2 = new Cliente("002", "pedro", "franco", "645191237", 255.00);
        Cliente c3 = new Cliente("003", "luis", "franco", "645191237", 155.00);
        Cliente c4 = new Cliente("001", "juan", "franco", "645191237", 155.00);
    
        Banco b = new Banco();
        b.introCliente(c1);
        b.introCliente(c2);
        b.introCliente(c3);
        b.introCliente(c4);
        
        System.out.println(b.buscarCliente("zan", "franco"));
        System.out.println(b.eliminarCliente("03"));
        System.out.println(b.buscarCliente("1zan", "franco"));
        System.out.println(b.eliminarCliente("003"));
        System.out.println(b.maxSaldo().toString());
        
        
        
    }   
}
