/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio2;

/**
 *
 * @author usuario
 */
public class Alimento {    
    private String nombre;
    private int grasas, hidratos;
    private boolean origenAnimal;    
    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal){
        this.nombre=nombre;//constructor
        this.grasas=grasas;
        this.hidratos=hidratos;
        this.origenAnimal=origenAnimal;
    }    
    public String getNombre(){//indica el valor
        return nombre;
    }    
    public int getGrasas(){//indica el valor
        return grasas;
    }    
    public int getHidratos(){//indica el valor
        return hidratos;
    }        
    public String getOrigenAnimal(){//indica si es o no de origen animal segun si cumple las condiciones indicadas
        String oAnimal=origenAnimal==true?"es de origen animal":"no es de origen animal";
        return oAnimal;
    }    
    public String getDatos(){//nos muestra los valores de los atributos
        String cadena="el nombre del alimento es "+getNombre()+" contiene "+getGrasas()+"g de grasas y "+getHidratos()+"g de hidratos y "+getOrigenAnimal();
        return cadena;
    }
     public String esDietetico(){//nos dice si cumple unos requisitos y si es o no dietetico en funcion de si los cumple o no
         boolean esDietetico=grasas<12&&origenAnimal==false;
         String dietetico=esDietetico==true?"es dietetico":"no es dietetico";
         return dietetico;
     }     
     public int calorias(int gramosAlimento){//nos indica las calorias
         int calorias=(int) (gramosAlimento*((grasas*5.3)+(hidratos*2.1)));
         return calorias;
     }
    
    
    
    
}
