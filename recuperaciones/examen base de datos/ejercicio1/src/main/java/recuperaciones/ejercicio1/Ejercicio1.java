/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.ejercicio1;

import java.sql.Connection;
import java.time.LocalDate;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Connection conn = AccesoBD.getInstance().getConn();
        
        LibroDAOImp libros = new LibroDAOImp();
        
        
        
        System.out.println("apartado 1");
        System.out.println(libros.listar());
        
        
        System.out.println("apartado 2");
        Libro l1 = new Libro("9788433975744","El Gran Gatsby","F.Scott Fitgerald",50);
        libros.insertar(l1);
       
        System.out.println("apartado 3");
        Lector le1 = new Lector(11,"juan martinez","9788433975744",LocalDate.now());        
        Lector lect = new Lector(12,"ana olvido","9788433975744", LocalDate.now());
        
        System.out.println("apartado 4");
        libros.modificar("9788433975744");
        
        System.out.println("apartado 5");
        LectorImp.guardar(le1);
        //pruebas de funcionamiento de metodos
        System.out.println(LectorImp.porNombre("Laura Gomez"));
        System.out.println(LectorImp.lLectoresLibro("9780452284234"));
        System.out.println(libros.listar());
        System.out.println(libros.porCod("9780670813023"));
        System.out.println("apartado 6");
        libros.porCod("9788433975744");
       
        libros.modificar("9788433975744");
        System.out.println(libros.eliminar("9788433975744"));
        
        LectorImp.eliminar(11);
        
        
    }
}
