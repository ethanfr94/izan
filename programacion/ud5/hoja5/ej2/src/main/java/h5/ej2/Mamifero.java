/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h5.ej2;

/**
 *
 * @author DAM122
 */
public class Mamifero {
    
    protected String raza, alimento;
    protected int nPatas;

    public Mamifero(String raza, String alimento, int nPatas) {
        this.raza = raza;
        this.alimento = alimento;
        this.nPatas = nPatas;
    }

    @Override
    public String toString() {
        return "Mamifero{raza: " + raza + ", nPatas: " + nPatas + ", alimento: " + alimento + "}";
    }
    
    
    
    
}
