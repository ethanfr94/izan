/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Izan Franco Anduaga
 */
public class AgenciaAseguradora {

    TreeSet<Vehiculo> agencia;

    public AgenciaAseguradora() {
        agencia = new TreeSet<>();
    }

    public boolean insertar(Vehiculo v) {
        return agencia.add(v);
    }
    //no es necesario instanciar porque elimina el vehiculo

    /*if (v instanceof Coche) {
            Coche c = (Coche) v;
            agencia.add(c);
        } else if (v instanceof Moto) {
            Moto m = (Moto) v;
            agencia.add( m);
        }*/
    public void eliminar(String matricula) {
        int old = agencia.size();
        boolean correcto = false;
        Iterator<Vehiculo> it = agencia.iterator();
        while (it.hasNext()) {
            Vehiculo v = it.next();
            if (v.getMatricula().equals(matricula)) {
                /*if(v instanceof Moto){
                    Moto m = (Moto) v;
                    agencia.remove(m);
                }
                if(v instanceof Coche){
                    Coche m = (Coche) v;
                    agencia.remove(m);
                } */
                it.remove();
                correcto = true;
            }
        }
        //if (agencia.size() < old) {

        //Vehiculo.setnVehiculos(Vehiculo.getnVehiculos()-1);
        //}
        if (correcto) {
            System.out.println("vehiculo eliminado");
        } else {
            System.out.println("error al eliminar vehiculo");
        }
    }

    public String listarMotos(int prima) {
        String lista = "";
        for (Vehiculo v : agencia) {
            if (v instanceof Moto) {
                Moto m = (Moto) v;
                if (m.calcularPrimaSeguro() > prima) {
                    lista += Est.mostrarDatos(m.datosObjeto());
                }
            }
        }
        return lista;
    }

    public TreeSet<Conductor> listarConductores() {
        TreeSet<Conductor> cond = new TreeSet<>();
        for (Vehiculo v : agencia) {
            cond.add(v.getConductor());
        }
        return cond;
    }

    public Coche masPotente() {
        Coche s = null;
      
        boolean exito = false;
        Iterator<Vehiculo> it = agencia.iterator();
        while (it.hasNext() && !exito) {
            Vehiculo v = it.next();
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                
                    s = c;
                    exito = true;
               
            }
        }
        while (it.hasNext()) {
            Vehiculo v = it.next();
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (s.getPotencia() < c.getPotencia()) {
                    s = c;
                }
            }
        }
        return s;
    }

}
