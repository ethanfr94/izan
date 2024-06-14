/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h5.ej1;

/**
 *
 * @author DAM122
 */
public class AutoAnfibio implements TransporteMaritimo, TransporteTerrestre {

    private String marca, modelo;

    public AutoAnfibio(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void nadar() {
        System.out.println("estoy nadando");
    }

    @Override
    public void andar() {
        System.out.println("estoy andando");
    }


    
}
