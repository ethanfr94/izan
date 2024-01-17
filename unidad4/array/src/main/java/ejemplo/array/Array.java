/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejemplo.array;

/**
 *
 * @author DAM122
 */
public class Array {

    public static void main(String[] args) {
        int [] a;
        int [] b = new int []{2,3,4,5,6,7};
        a = b;
        a[0]=5;
        for (int i=0; i<a.length; i++){//for que hace que se nos muestren todos los valores del array
            System.out.print(a[i]+" ");
            
        }
    }
}
