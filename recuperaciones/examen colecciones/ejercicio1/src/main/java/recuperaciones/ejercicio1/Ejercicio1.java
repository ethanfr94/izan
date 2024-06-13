/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package recuperaciones.ejercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Izan Franco Anduaga
 */
public class Ejercicio1 {
/*
    Fallos en case 2, 4, 6
    */
    public static void main(String[] args) throws Exception {
        AgenciaAseguradora a = new AgenciaAseguradora();
        int op;
        
        do{
            op = Est.introEntero("1.añadir vehiculo\n2.eliminar por matricula\n3.listar motos segun prima\n4.coleccion conductores\n5.total vehculos\n6.coche mas potente\n7.salir");
            switch(op){
                case 1->{
                    System.out.println("Datos para el registro");
                    String nombre = Est.introCadena("introduce nombre del conductor");
                    LocalDate fCarnet = Est.introFecha("introduce fecha de obtencion del carnet");
                    Conductor c = new Conductor(nombre, fCarnet);
                    String matriculaTmp = Est.introCadena("introduce matricula del vehiculo (XXXX 000)");
                    String matricula;
                    if(Est.validarMatricula(matriculaTmp))matricula = matriculaTmp;
                    else matricula = "XXXX";
                    String modelo = Est.introCadena("introduce modelo del vehiculo");
                    int cm;
                    do{
                        cm = Est.introEntero("1.Coche\n2.moto");                        
                    }while(cm != 1 && cm != 2);
                    if(cm == 1){
                        int pot = Est.pedirPotencia();   
                        if(!matricula.equals("XXXX")){
                            Vehiculo v = new Coche(matricula, modelo, c, pot);
                            a.insertar(v);
                            System.out.println("vehiculo registrado "+Est.mostrarDatos(v.datosObjeto()));
                        }else System.out.println("no se puede insertar el vehiculo");                        
                    }else{
                        int cil = Est.pedirCilindrada();   
                        if(!matricula.equals("XXXX")){
                            Vehiculo v = new Moto(matricula, modelo, c, cil);
                            a.insertar(v);
                            System.out.println("vehiculo registrado "+Est.mostrarDatos(v.datosObjeto()));
                        }   else System.out.println("no se puede insertar el vehiculo");    
                    }                    
                }
                case 2->{
                    String matricula = Est.introCadena("introduce matricula del vehiculo a eliminar");
                    a.eliminar(matricula);
                }
                case 3->{
                    System.out.println("motos aseguradas\n"+a.listarMotos(Est.introEntero("introduce prima para comparar")));
                }
                case 4->{
                    for (Conductor c : a.listarConductores()) {
                        System.out.println(Est.mostrarDatos(c.datosObjeto()));
                    }                    
                }
                case 5->{
                    System.out.println("numero total de vehiculos creados:"+Vehiculo.getnVehiculos());
                }
                case 6->{
                    System.out.println("coche registrado mas potente\n"+a.masPotente().datosObjeto());
                }
                case 7->{
                    System.out.println("saliendo del programa");
                }
                default->{
                    System.out.println("opcion no valida");
                }
            }
            
        }while(op != 7);
      
    }
}
