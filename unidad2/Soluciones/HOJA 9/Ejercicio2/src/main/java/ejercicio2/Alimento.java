package ejercicio2;

public class Alimento {
    private String nombre;
    private int grasas;
    private int hidratos;
    private boolean origenAnimal;

    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrasas() {
        return grasas;
    }

    public int getHidratos() {
        return hidratos;
    }

    public boolean isOrigenAnimal() {
        return origenAnimal;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", grasas=" + grasas + ", hidratos=" + hidratos + ", origenAnimal=" + origenAnimal + '}';
    }
   
    public boolean esDietetico() {
        if ((grasas < 12) && (!origenAnimal)) {
            return true;
        } else {
            return false;
        }
    }
    public double calorias(int gramos){
        return (gramos*(grasas*5.3+hidratos*2.1));
    }
    }

