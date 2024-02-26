/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h4.ej2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Empleado {
    protected String nombre, departamento;
    protected int edad;
    protected boolean casado;
    protected double salario;

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    /*public Empleado() {
        Scanner t;
        System.out.println("introduce nombre");
        nombre = new Scanner(System.in).nextLine();
        System.out.println("introduce departamento");
        departamento = new Scanner(System.in).nextLine();
        System.out.println("introduce edad");
        edad = new Scanner(System.in).nextInt();
        System.out.println("¿casado? (true/false)");
        casado = new Scanner(System.in).nextBoolean();
        System.out.println("introduce salario");
        salario = new Scanner(System.in).nextDouble();
    }*/

    public Categoria categoria(){
        Categoria ct;
        if(edad <= 21){
            ct = Categoria.PRINCIPIANTE;
        }
        else if(edad > 21 && edad <= 35){
            ct = Categoria.INTERMEDIO;
        }
        else{
            ct = Categoria.SENIOR;
        }
        return ct;
    }

    
    public String datos() {
        String aux;
        if(casado == true){
            aux = "casado";
        }else {aux = "soltero";}            
        
       return String.format("%s\ndepartamento de %s\nedad: %d \nestado civil: %s \nsalario: %,.2f\n",nombre, departamento, edad, aux, salario);
    }
    
    public void aumentoSalario(int incremento){//tanto porciento
        salario = salario + (salario * (incremento/100));
    }

    
    
    
    
}
