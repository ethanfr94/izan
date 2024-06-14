/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Veterinario {
    
    Mascota [] mascotas;
    int nMascota;
    
    public Veterinario (int n){
        nMascota = 0;
        mascotas = new Mascota[n];
        String nombre;
        int ano, mes, dia;
        for (int i = 0; i < mascotas.length; i++){
            Scanner t;
            System.out.print("[" + (i+1) + "/" + n + "] Nombre de la mascota: ");            
            nombre = new Scanner(System.in).nextLine();
            System.out.print("Año de nacimiento de " + nombre + ": ");
            ano = new Scanner(System.in).nextInt();
            System.out.print("Mes de nacimiento de " + nombre + ": ");
            mes = new Scanner(System.in).nextInt();
            System.out.print("Dia de nacimiento de " + nombre + ": ");
            dia = new Scanner(System.in).nextInt();
            mascotas[i] = new Mascota(nombre, ano, mes, dia);
            nMascota++;
        }
    }
    
    public void anadir(){
        String nombre;
        int ano, mes, dia;        
            Scanner t;
            System.out.print("Nombre de la mascota: ");            
            nombre = new Scanner(System.in).nextLine();
            System.out.print("Año de nacimiento de " + nombre + ": ");
            ano = new Scanner(System.in).nextInt();
            System.out.print("Mes de nacimiento de " + nombre + ": ");
            mes = new Scanner(System.in).nextInt();
            System.out.print("Dia de nacimiento de " + nombre + ": ");
            dia = new Scanner(System.in).nextInt();
            
        Mascota[] aux = new Mascota[this.mascotas.length];
        //creamos una copia de nuestro array principal
        for (int i = 0; i < aux.length; i++) {
            aux[i]=this.mascotas[i];
        }
        //borramos nuestro array y le inicializamos un un espacio de memoria mas que antes
        mascotas = new Mascota[mascotas.length+1];
        for (int i = 0; i < mascotas.length; i++) {
            if (i<mascotas.length-1) {
                mascotas[i] = aux[i];
                //recuperamos los datos desde la copia
            } else {
                mascotas[i] = new Mascota(nombre, ano, mes, dia);
                //en la ultima posicion del array añadimos a la nueva mascota
                nMascota++;
            }
        } 
        
    }
    
    public String mostrar(){
        /*creamos una cadena con los datos de todas las mascotas utilizando
        el metodo tostring de la otra clase*/
        String cadena = "";
        for (int i = 0; i < mascotas.length; i++){
            cadena += mascotas[i].toString()+"\n";
        }
        return cadena;
    }
    
    public String mayores(){
        String cadena = "";
        for (int i = 0; i < mascotas.length; i++){
            if (mascotas[i].getEdad()>5){
            cadena += mascotas[i].toString()+"\n";
            }
        }
        return cadena;
    }
}
