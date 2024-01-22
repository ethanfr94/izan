/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.ejercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author DAM122
 */
public class Letra {
    private int numLetra;
    private String titular;
    private double importe;
    private LocalDate fechaVenc;
    
    
    public Letra (){
        Scanner t;
        System.out.println("indica el numero de la letra");
        numLetra = new Scanner (System.in).nextInt();
        System.out.println("indica un titular");
        titular = new Scanner (System.in).nextLine();
        System.out.println("indica el importe");
        importe = new Scanner (System.in).nextDouble();
        System.out.println("indica la fecha de vencimiento (aaaa-mm-dd)");
        String fecha = new Scanner (System.in).nextLine();
        fechaVenc = LocalDate.parse(fecha);        
    }
    
    public boolean vencida(){
        return fechaVenc.isBefore(LocalDate.now());/*isBefore/isAfter nos indican si la fecha 
        introducida es anterior o posterior a la fecha con la que queremos comparar 
        en este caso la fecha atual*/
    }
    
    public void demora(int n){
        fechaVenc = fechaVenc.plusDays(n);//plusdays nos suma a la fehca dada un numero n de dias
    }
    
    public int faltan(){
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaVenc);
        //ChronoUnit.DAYS.between nos da la diferencia de dias entre dos fechas
    }
    
    public String mostrar(){
        String cadena = "el numero de letra es: "+numLetra+
                        " el titular es: "+titular+
                        " el importe es: "+importe+
                        " la fecha de vencimiento es: "+fechaVenc;
        return cadena;
    }
    
    public int devuelveMes(){
        return fechaVenc.getMonthValue();// nos indica el valor del mes de la fecha
    }

    public String getTitular() {
        return titular;
    }
    
    
    
    
}
