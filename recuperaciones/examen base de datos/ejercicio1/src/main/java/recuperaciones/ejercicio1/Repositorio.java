/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package recuperaciones.ejercicio1;

import java.util.List;

/**
 *
 * @author Izan Franco Anduaga
 */
public interface Repositorio<T> {

    public List<T> listar();

    public T porCod(String cod);

    public void insertar(T t);

    public void modificar(String cod);

    public boolean eliminar(String cod);

}
