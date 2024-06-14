/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package radio.sintonizador;

/**crea un proyecto en netbeans que permita controlar un sintonizador digitalde emisoras FM
 * 
 * concretamente, se desea dotar al controlador de una interfaz que permita subir(up) o bajar(down) la frecuencia (en saltos de 5mhz)y mostrar la frecienciasintonizada en un momento dado.
 * 
 * supondremos que la frecuencia para manejar oscila entree los 80mhz y los 108mhz y que al inicio, al crear un sintonizador de frecuencia en una frecuencia dada,
 * el controlador sintonice la frecuencia indicada si sobrepasa los limites ajuste al valor limitey en el constructor por defecto sintonice la frecuencia a 80mhz.
 * 
 * si durante una operacioon de subida o bajada se supera uno de los 2 los limites, la freecuencia sintonizada debe pasar a ser la del extremo contrario.
 * 
 * definiremos una clase sintonizadorFM, con un tributo privado de tipo double denominado frecuencia, dos constructoresuno por defecto y el que inicializa a un valor dado cumpliendo el rango de freecuenciapermitidas.
 * 
 * como metodos al menos subir, bajr que deberan controlar el increemento o decremento de 0,5mhz y que si sobrepasa uno de los limites sintonicere al extremo contrario.
 * 
 * el metodo para mostrar la frecuencia (display).
 * 
 * para probarlo creamos un sinonizador en 107mhz, mostramos la frecuencia,  subimos 4 veces, bajamos 3 y mostramos la frecuencia.
 * 
 * creamos otro sintanizaor a 200mhz y mostramos la frecuencia.
 * 
 * añade a la clase un constructor copia y crea otro sintonizadorcon este constructor, muestra la frecuenciasube una vez, baja otra y vuelve a mostrar la frecuencia.
 *
 * 
 */
public class Sintonizador {

    public static void main(String[] args) {
        
            SintonizadorFM s1=new SintonizadorFM(107);
            System.out.println("la frecuencia sintonizada en s1 es: "+s1.display());
            s1.up();
            s1.up();
            s1.up();
            s1.up();
            s1.down();
            s1.down();
            s1.down();
            System.out.println("la freecuencia sintonizada en s1 es: "+s1.display());
            
            SintonizadorFM s2=new SintonizadorFM(200);
            System.out.println("la frecuencia sintonizada en s2 es: "+s2.display());
            
            SintonizadorFM s3=new SintonizadorFM(s1);
            System.out.println("la frecuencia sintonizada en s3 es: "+s3.display());
            s3.down();
            System.out.println("la frecuencia sintonizada en s3 es: "+s3.display());
            
    }
}
