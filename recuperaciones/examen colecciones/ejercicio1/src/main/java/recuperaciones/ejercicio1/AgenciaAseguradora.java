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
    

    public boolean eliminar(String matricula) {
        int old = agencia.size();
        boolean correcto = false;
        Iterator<Vehiculo> it = agencia.iterator();
        while (it.hasNext()) {
            Vehiculo v = it.next();
            if (v.getMatricula().equals(matricula)) {
                if(v instanceof Moto){
                    Moto m = (Moto) v;
                    agencia.remove(m);
                }
                if(v instanceof Coche){
                    Coche m = (Coche) v;
                    agencia.remove(m);
                }                
            }
        }        
        if (agencia.size() < old) {
            correcto = true;
            Vehiculo.setnVehiculos(Vehiculo.getnVehiculos()-1);
        }
        return correcto;
    }

    public String listarMotos(int prima) {
        String lista = "";
        for (Vehiculo v : agencia) {
            if (v instanceof Moto) {
                Moto m = (Moto) v;
                if (m.calcularPrimaSeguro() > prima) {
                    lista += m.datosObjeto() + "\n";
                }
            }
        }
        return lista;
    }

    public TreeSet listarConductores() {
        TreeSet<Conductor> cond = new TreeSet<>();
        for (Vehiculo v : agencia) {
            cond.add(v.getConductor());
        }
        return cond;
    }

    public Coche masPotente() {
        Coche s = null;
        int max = 0;
        Iterator<Vehiculo> it = agencia.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof Coche) {
                Coche c = (Coche) it.next();
                max = c.getPotencia();
            }
        }
        while (it.hasNext()) {
            if (it.next() instanceof Coche) {
                Coche c = (Coche) it.next();
                if (max == c.getPotencia()) {
                    s = c;
                }
            }
        }
        if (agencia.isEmpty()) {
            s = null;
        }
        return s;
    }

}
