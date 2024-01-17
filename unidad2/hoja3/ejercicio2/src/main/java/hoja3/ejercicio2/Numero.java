/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

/**
 *
 * @author usuario
 */
public class Numero {

    private int num;
    
    public Numero(){//constructor que inicializa el objeto a 0
        num=0;
    }
    
    public Numero(int num){//constructor que inicializa el objeto con un valor dado
        this.num=num;
    }
    
    public void suma(int valor){//metodo que suma un valor al valor del objeto
        num=num+valor;
    }
    
    public void resta(int valor){//metodo que resta un valor al valor del objeto
        num=num-valor;
    }
    
    public int getNum(){//metodo que nos muestra el valor del objeto
        return num;
    }
    
    public int doble(){//metodo que nos muestra el doble del valor del objeto
        return num*2;
    }
    
    public int triple(){//metodso que nos muestra el triple del valor del objeto
        return num*3;
    }
    
    public void setNum(int num){//metodo que nos permite cambiar el valor inicial del objeto
        this.num=num;
    }
}
