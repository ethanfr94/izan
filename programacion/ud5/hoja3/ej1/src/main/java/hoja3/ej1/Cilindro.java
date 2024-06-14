/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ej1;

/**
 *
 * @author usuario
 */
public class Cilindro extends Figura {

    public Cilindro(int r, int h) {
        super(r, h);
    }

    @Override
    public double area() {
        double area = 2*Math.PI * super.r * (super.h + super.r);

        return area;
    }

    @Override
    public double volumen() {
        double volumen = Math.PI * Math.pow(super.r, 2) * super.h;

        return volumen;
    }

}
