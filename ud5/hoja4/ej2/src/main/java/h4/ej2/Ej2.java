/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h4.ej2;

/**
 *
 * @author usuario
 */
public class Ej2 {

    public static void main(String[] args) {
        Plantilla p1 = new Plantilla();
        Empleado e1 = new Programador("Izan", "IT", 30, true, 185.15, 1170, "C++");
        Empleado e2 = new Programador("Carmen", "IT", 21, false, 185.15, 1070, "Java");
        Empleado e3 = new Programador("Santi", "IT", 37, false, 185.15, 3170, "Java");
        Empleado e4 = new Programador("Link", "IT", 35, true, 185.15, 170, "Java");
        
        p1.insertar(e1);
        p1.insertar(e2);
        p1.insertar(e3);
        p1.insertar(e4);
        
        p1.todosEmpleados();
        System.out.println(p1.maxLineas());
        System.out.println("");
        System.out.println(p1.senior());
        System.out.println("aumentamos sueldo");
        p1.aumento();
        p1.todosEmpleados();              
    }
    
}
