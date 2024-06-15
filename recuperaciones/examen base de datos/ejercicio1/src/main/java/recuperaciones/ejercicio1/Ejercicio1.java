/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recuperaciones.ejercicio1;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Ejercicio1 {

    public static void main(String[] args) {        
        
        LibroDAOImp libro = new LibroDAOImp();  
        
        
       
        System.out.println("\napartado 1");
        List<Libro> libros = libro.listar();
        for (Libro l : libros) {
            System.out.println(l.toString()+"\n");
        }        
       
        System.out.println("\napartado 2");
        Libro l1 = new Libro("9788433975744","El Gran Gatsby","F.Scott Fitgerald",50);
        libro.insertar(l1);
        
        System.out.println("\napartado 3");
        Lector le1 = new Lector("juan martinez",l1,LocalDate.now());        
        Lector le2 = new Lector("ana olvido",l1, LocalDate.now());
        LectorImp.guardar(le1);
        //LectorImp.guardar(le2);
        
        System.out.println("\napartado 4");
        libro.modificar("9788433975744");
        
        System.out.println("\napartado 5");
        //LectorImp.guardar(le1);        
              
        System.out.println("\napartado 6");
        System.out.println(libro.porCod("9788433975744").toString());    
        
        System.out.println("\napartado 7");
        List<Lector> l = LectorImp.lLectoresLibro("9788433975744");
                for (Lector lector : l) {
                    System.out.println(lector.toString()+"\n");
        }
        
        System.out.println("\napartado 8");
        /*
        si el usuario ha sido modificado en el apartado 5 la fecha estara a null y el metodo porNombre no creara un objeto al ancontrar un nulo en la columna 
        */
        LectorImp.eliminar(LectorImp.porNombre("juan martinez").getId());  
       
        System.out.println("\napartado 9");
        /*
        si hay un lector que ha leido ese libro no lo borrara por tener el codigo que es foreign key
        y no esta habilitado el borrado en cascada
        */
          if(libro.eliminar("9788433975744")){
              System.out.println("libro eliminado correctamente");
          }
          else{
              System.out.println("error al eliminar el libro");              
          } 
        
        
        
    }
}
