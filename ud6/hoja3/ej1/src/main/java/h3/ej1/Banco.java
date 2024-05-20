/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package h3.ej1;

import java.util.LinkedHashSet;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Banco {
    
    LinkedHashSet<Cliente> banco = new LinkedHashSet<>();
    
    public void introCliente(Cliente c){
        if(banco.add(c))System.out.println("cliente añadido");
        else System.out.println("error al añadir cliente");
    }
    
    public String buscarCliente(String nombre, String apellido){
        for (Cliente cliente : banco) {
            if(cliente.getNombre().equalsIgnoreCase(nombre) && cliente.getApellido().equalsIgnoreCase(apellido)){
                return cliente.toString();
            }
        }
        return "cliente no encontrado";
    }
    
    public String eliminarCliente(String cod){        
        for (Cliente cliente : banco) {
            if(cliente.getCodigo().equals(cod)){
                if(banco.remove(cliente)) return "cliente eliminado";
            }            
        }
        return "cliente no encontrado";
    }
    
    public Cliente maxSaldo(){
        double temp = 0;
        Cliente c = null;
        for (Cliente cliente : banco) {
            if(cliente.getSaldo() > temp)temp = cliente.getSaldo();
        }
        for (Cliente cliente : banco) {
            if(cliente.getSaldo() == temp) c = cliente;            
        }
        return c;
    }
}
