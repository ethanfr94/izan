/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h4.ej2;

/**
 *
 * @author usuario
 */
public class Plantilla extends Empleado {

    Empleado[] emp;
    private int cont = 0;

    public Plantilla() {
        emp = new Empleado[50];
        cont = 0;
    }

    public void insertar(Empleado e) {
        if (cont < emp.length) {
            emp[cont++] = e;
        }
    }

    public void todosEmpleados() {
        for (int i = 0; i < cont; i++) {
            System.out.println(emp[i].datos());
        }
    }

    public String maxLineas() {
        Programador max = new Programador("", "", 0, false, 0, 0, "");
        for (int i = 0; i < cont; i++) {
            if (emp[i] instanceof Programador) {
                Programador aux = (Programador) emp[i];
                if (aux.getCodH() > max.getCodH()) {
                    max = aux;
                }
            }
        }
        return String.format("el programador que mas lineas escribe por hora es %s\n", max.nombre);
    }

    public String senior() {
        String info = "";
        for (int i = 0; i < cont; i++) {
            if (emp[i].categoria() == Categoria.SENIOR) {
                info += emp[i].datos();
            }
        }
        return info;
    }

    public void aumento() {
        for (int i = 0; i < cont; i++) {
            Programador aux = (Programador) emp[i];
            if (emp[i] instanceof Programador && emp[i].categoria() == Categoria.INTERMEDIO && aux.getLenguaje().toLowerCase().contains("java")) {
                emp[i].aumentoSalario(20);
            }
        }
    }
}
