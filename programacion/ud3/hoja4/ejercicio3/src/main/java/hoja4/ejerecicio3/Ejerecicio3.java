/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejerecicio3;

/**
 *
 * @author usuario
 */
public class Ejerecicio3 {

    public static void main(String[] args) {
               
        for (int y = 2016; y <= 2030; y++){
            
            int a = y % 19, 
            b = y % 4, 
            c = y % 7, 
            d = (19 * a + 24) % 30, 
            e = (2 * b + 4 * c + 6 *d + 5) % 7, 
            n = (22 + d + e);
           
            if (n > 31){
                n -= 31;
                System.out.println("en el año " + y + " el domingo de pascua es el " + n + " de abril");
            }else {
                System.out.println("en el año " + y + " el domingo de pascua es el " + n + " de marzo");
            }
        }
        
    }
}
