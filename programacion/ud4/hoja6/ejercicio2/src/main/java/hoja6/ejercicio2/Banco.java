/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Banco {
    private Cliente [] cliente;
    private int n = 0;
    
    public Banco(int n){
        cliente = new Cliente [n];
    }
    
    public void ingresar(){
        Scanner t;
        if (cliente.length != n){
          cliente [n] = new Cliente (); 
            cliente[n].setCodigo(n);
            System.out.println(cliente[n].getCodigo());
            System.out.println("introduce nombre del cliente");
            cliente[n].setNombre(new Scanner (System.in).nextLine());
            System.out.println("introduce apellidos del cliente");
            cliente[n].setApellidos(new Scanner (System.in).nextLine());
            System.out.println("introduce telefono del cliente");
            cliente[n].setTelefono(new Scanner (System.in).nextInt());
            System.out.println("introduce saldo del cliente");
            cliente[n].setSaldo(new Scanner (System.in).nextInt());  
            n++;
        }
        else {
            System.out.println("maximo de clientes alcanzado");
        }        
    }
    
    public String buscar(int n){
        String cadena = "";
        if (n < cliente.length){
            cadena = "codigo de cliente: "+cliente[n].getCodigo()+"\n"+
                     "nombre y apellidos: "+cliente[n].getNombre()+" "+cliente[n].getApellidos()+"\n"+
                     "telefono: "+cliente[n].getTelefono()+"\n"+
                     "saldo: "+cliente[n].getSaldo()+"\n";
        }
        else {
            cadena = "no hay nigun cliente con ese codigo";
        }
        return cadena;
    }
    
    public void eliminar(int n){
        if (n < cliente.length){
             for (int i = n; i < this.n; i++) {
                this.cliente[i].setNombre(this.cliente[n+1].getNombre());
                this.cliente[i].setApellidos(this.cliente[n+1].getApellidos());
                this.cliente[i].setTelefono(this.cliente[n+1].getTelefono());
                this.cliente[i].setSaldo(this.cliente[n+1].getSaldo());
            }
            this.n--;
        }
        else {
            System.out.println("no hay nigun cliente con ese codigo");
        }
    }
    
    public void mostrar(){
        for (int i = 0; i < n; i++) {
            System.out.println("codigo de cliente: "+cliente[i].getCodigo()+"\n"+
                     "nombre y apellidos: "+cliente[i].getNombre()+" "+cliente[i].getApellidos()+"\n"+
                     "telefono: "+cliente[i].getTelefono()+"\n"+
                     "saldo: "+cliente[i].getSaldo()+"\n");
        }        
    }    
}
