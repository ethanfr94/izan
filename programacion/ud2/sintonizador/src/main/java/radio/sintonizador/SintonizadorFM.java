/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radio.sintonizador;

/**
 *
 * @author usuario
 */
public class SintonizadorFM {
    private double frecuencia;    
     public SintonizadorFM(){//constructor por defecto
        frecuencia=80;
     }         
    public SintonizadorFM(double frec){//constructor con valores dados y limites establecidos para los valores
        this.frecuencia=frec<80?80:frec;//si el valor dado es menor de 80 lo establece en 80
        this.frecuencia=frec>108?108:frec;//si el valor es mayuor de 108 lo establece en 108
    }    
    public SintonizadorFM(SintonizadorFM copia){//constructor copia que establece el valor del objeto indicado
        this.frecuencia=copia.frecuencia;
    }    
    public void up(){//metodo que sube la frecuencia en saltos de 0.5mhz 
        frecuencia+=0.5;
        this.frecuencia=frecuencia>108?80:frecuencia;//si se supera el valor de 108mhz se establece el limite inferior (80mhz)
    }    
    public void down(){//metodo que baja la frecuencia en saltos de 0.5mhz
        frecuencia-=0.5;
        this.frecuencia=frecuencia<80?108:frecuencia;//si el valor llega a ser inferior a 80mhz se establece el limite superior de 108mhz
    }    
    public double display(){//indica el valor
        return frecuencia;
    }
    
}
