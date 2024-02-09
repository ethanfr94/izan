
package hoja1.ejercicio1;

import static hoja1.ejercicio1.Sexo.M;

/**
 *
 * @author izan
 */
public class Ejercicio1 {
       
    
    public static void main(String[] args) {
        
    //definicion y asignacion de las variables
    boolean casado=true;
    final int MAXIMO=999999;
    Sexo sexo=M;
    byte diasem=1;
    short diaanual=300;
    long  miliseg=1298332800000L;//milisegundos transcurridos desde el 01/01/1970
    float totalfactura=10350.678F;
    long poblacion=6775235741L;
    
    //impresion de las variables println
        System.out.println("----EJERCICIO DE VARIABLES Y TIPOS DE DATOS----");
        System.out.println("\tel valor de la variable casado es "+casado);
        System.out.println("\tel valor de la variable maximo es "+MAXIMO);
        System.out.println("\tel valor de la variable sexo es "+sexo);
        System.out.println("\tel valor de la variable diasem es "+diasem);
        System.out.println("\tel valor de la variable diaanual es "+diaanual);
        System.out.println("\tel valor de la variable miliseg es "+miliseg);
        System.out.println("\tel valor de la variable totalfactura es "+totalfactura);
        System.out.println("\tel valor de la variable poblacion es "+poblacion);
        
        //impresion de las variables print
        System.out.println("\n----EJERCICIO DE VARIABLES Y TIPOS DE DATOS----");
        System.out.print("\n\tel valor de la variable casado es "+casado);
        System.out.print("\n\tel valor de la variable maximo es "+MAXIMO);
        System.out.print("\n\tel valor de la variable sexo es "+sexo);
        System.out.print("\n\tel valor de la variable diasem es "+diasem);
        System.out.print("\n\tel valor de la variable diaanual es "+diaanual);
        System.out.print("\n\tel valor de\r la variable miliseg es "+miliseg);
        System.out.print("\n\tel valor de la variable totalfactura es "+totalfactura);
        System.out.print("\n\tel valor de la variable poblacion es "+poblacion);
        
        //impresion de las variables printf
        System.out.println("\n----EJERCICIO DE VARIABLES Y TIPOS DE DATOS----");
        System.out.printf("\n\tel valor de la variable casado es %b",casado);
        System.out.printf("\n\tel valor de la variable maximo es %d",MAXIMO);
        System.out.printf("\n\tel valor de la variable sexo es %S",sexo);
        System.out.printf("\n\tel valor de la variable diasem es %d",diasem);
        System.out.printf("\n\tel valor de la variable diaanual es %d",diaanual);
        System.out.printf("\n\tel valor de la variable miliseg es %d",miliseg);
        System.out.printf("\n\tel valor de la variable totalfactura es %f",totalfactura);
        System.out.printf("\n\tel valor de la variable totalfactura en notacion cientgifica es %e",
                totalfactura);
        System.out.printf("\n\tel valor de la variable poblacion es %d",poblacion);
        
    }
}
