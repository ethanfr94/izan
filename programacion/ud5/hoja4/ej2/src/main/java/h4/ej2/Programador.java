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
public class Programador extends Empleado {
    
    private int codH;
    private String lenguaje;

    public Programador(String nombre, String departamento, int edad, boolean casado, double salario, int codH, String lenguaje) {
        super(nombre, departamento, edad, casado, salario);
        this.codH = codH;
        this.lenguaje = lenguaje;
    }

    public Programador() {
        super();
        Scanner t;        
        System.out.println("introduce lineas de codigo por hora");
        codH = new Scanner(System.in).nextInt();
        System.out.println("introduce lenguaje dominante");
        lenguaje = new Scanner(System.in).nextLine();
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public int getCodH() {
        return codH;
    }

    
    
    @Override
    public void aumentoSalario(int incremento) {
        super.aumentoSalario(incremento); 
    }

    @Override
    public String datos() {
       return super.datos().concat(String.format("cod/h: %d \nlenguaje dominante: %s\n",codH, lenguaje));
        
    }

    @Override
    public Categoria categoria() {
        return super.categoria();
    }

    
    
}
