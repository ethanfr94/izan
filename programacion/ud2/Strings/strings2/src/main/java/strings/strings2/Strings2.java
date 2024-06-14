/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package strings.strings2;

/**
 *
 * @author dam1
 */
public class Strings2 {

    public static void main(String[] args) {
String nombre, apellido;//creamos las variables        
        nombre="pepito ";
        apellido="perez ";        
        System.out.println("mi nombre es "+nombre +apellido);
        System.out.println("la longitud de nombre es "+nombre.length());//le pedimos la longitud de la variable
        System.out.println("la longitud de apellido es "+apellido.length());        
        String apellido2;
        apellido2="fernandez ";        
        System.out.println("mi nombre es "+nombre.concat(apellido).concat(apellido2));//le pedimos que nos muestres las variables encadenandolas
        System.out.println("la longitud de la limea  anterior es "+nombre.concat(apellido).concat(apellido2).length());//le pedimos que nos muestre la lomgitud total de las variables encadenadas        
        String cadena="aurelio comia anacardos en el pueblo";
        cadena=cadena.replace("a", "o").replace("e", "o").replace("i", "o").replace("u", "o");//asi hacemos que nos sustituya unas letras por otras
        System.out.println("la linea anterior cambiando las vocales por o`s quedaria "+cadena);
        String cadena1="hola, me llamo pepito";
        System.out.println("la mitad de la cadena es "+cadena1.substring(0, 10));//asi nos muestra solo una parte que seleccionamos de la variable        
        String cadena2="esto es un despiporre? lo es";
        System.out.println("cambiando es por no por quedaria "+cadena2.replaceAll("es", "no por"));//lo utilizamos para sustituir un conjunto de caracteres por otros    
    }
}
