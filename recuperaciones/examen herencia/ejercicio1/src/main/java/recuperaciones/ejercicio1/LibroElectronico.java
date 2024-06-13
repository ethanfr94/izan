/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperaciones.ejercicio1;

/**
 *
 * @author DAM122
 */
public class LibroElectronico extends Libro {

    private float mb;

    public LibroElectronico() {
        super();
        mb = Tec.introFloat("introduce tamaño del libro");
    }

    public LibroElectronico(float mb) {
        this.mb = mb;
    }

    public LibroElectronico(String titulo, String autor, float mb) {
        super(titulo, autor);
        this.mb = mb;
    }

    public float getMb() {
        return mb;
    }

    public void setMb(float mb) {
        this.mb = mb;
    }

    @Override
    public String imprime() {
        return super.imprime() + " -Tamaño del libro: " + mb + "Mb\n";
    }

   

}
